package ma.beyondcom.sma.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import ma.beyondcom.sma.Activities.inApplication;
import ma.beyondcom.sma.Beans.Prof;
import ma.beyondcom.sma.R;

import io.realm.Realm;

/**
 * Created by lenovo on 27/11/2017.
 */

public class ProfFragment extends Fragment {


    private Realm realm;
    private  int id_prof;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.prof, container, false);
          realm = Realm.getDefaultInstance();
          Bundle b = getArguments();
          if( b!= null)
          {
              id_prof = b.getInt("id_prof");
          }
          if( id_prof > 0)
          {
              final Prof prof = realm.where(Prof.class).equalTo("id_prof",id_prof).findFirst();
              if( prof != null)
              {
                  ((TextView)v.findViewById(R.id.prof_name)).setText(prof.getNom());
                  ((TextView)v.findViewById(R.id.prof_address)).setText(prof.getAdresse());
                  Glide.with(getActivity()).load(prof.getPhoto()).into(((ImageView)v.findViewById(R.id.prof_image)));

                  v.findViewById(R.id.prof_pdf).setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          PdfViewerFragment pdfViewerFragment = new PdfViewerFragment();
                          Bundle b = new Bundle();
                          b.putString("pdf", prof.getPdf());
                          pdfViewerFragment.setArguments(b);
                          ((inApplication)getActivity().getApplication()).setUpFragment(getActivity(), pdfViewerFragment ,R.id.fragment_container);
                      }
                  });
              }
          }
        return  v;
    }
}

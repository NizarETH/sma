package ma.beyondcom.sma;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ma.beyondcom.sma.m_Model.EposterModel;

public class EposterAdapter extends RecyclerView.Adapter<EposterAdapter.MyViewHolder>

    {

        private List<EposterModel> moviesList;
        private Context ctx;
        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, count;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(ma.beyondcom.sma.R.id.title);
                count = (TextView) view.findViewById(ma.beyondcom.sma.R.id.count);
            }
        }


        public EposterAdapter(List < EposterModel > moviesList, Context context) {
        this.moviesList = moviesList;
        this.ctx = context;
    }

        @Override
        public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(ma.beyondcom.sma.R.layout.eposter_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

        @Override
        public void onBindViewHolder (MyViewHolder holder,int position){
        final EposterModel movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.count.setText(movie.getCout());
        final String sts = movie.getPdf();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                  Intent myIntent = new Intent(ctx, Eposter.class);
                 myIntent.putExtra("pdf", sts);
                 Log.v("TAGSMOUAD", sts);
                  ctx.startActivity(myIntent);


            }
        });
    }

        @Override
        public int getItemCount () {
        return moviesList.size();
    }

}

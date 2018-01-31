package ma.beyondcom.sma2018.Activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import  ma.beyondcom.sma2018.Fragments.SearchFragment;
import  ma.beyondcom.sma2018.R;

public class MainActivity extends AppCompatActivity {

    public String bodyFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);

        ((inApplication)getApplication()).setUpFragment(this, new SearchFragment(), R.id.fragment_container);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(getSupportFragmentManager().getBackStackEntryCount() <= 0)
        {
            final AlertDialog.Builder b =  new AlertDialog.Builder(this, R.style.MyDialogTheme);
            b.setTitle("Application");

            b.setMessage("Voulez-vous fermer l'application ?");
            b.setCancelable(false)
                    .setPositiveButton("Oui",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            ((inApplication)getApplication()).setUpFragment(MainActivity.this, new SearchFragment(), R.id.fragment_container);
                        }
                    });
            b.show();

        }
    }
}

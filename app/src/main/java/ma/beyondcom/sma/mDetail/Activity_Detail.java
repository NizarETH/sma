package ma.beyondcom.sma.mDetail;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ma.beyondcom.sma.R;
public class Activity_Detail extends AppCompatActivity {
    TextView nameTxt;

    TextView resumeTxt;
    TextView nameDetail;
    TextView profTxt;
    TextView comTxt;
    TextView cvTxt;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__detail);

        //INITIALIZE VIEWS
        nameDetail= (TextView) findViewById(R.id.nameTxt);
        nameTxt= (TextView) findViewById(R.id.cvTxtDetail);
        resumeTxt= (TextView) findViewById(R.id.resumeTxt);
        img= (ImageView) findViewById(R.id.spacecraftImageDetail);
        //RECEIVE DATA
        Intent i=this.getIntent();
        String namedetail=i.getExtras().getString("NAMEDETAIL_KEY");
        String cv=i.getExtras().getString("CV_KEY");
        String resume=i.getExtras().getString("RESUME_KEY");
        int image=i.getExtras().getInt("IMAGE_KEY");
        //BIND DATA
        nameDetail.setText(namedetail);
        nameTxt.setText(cv);
        resumeTxt.setText(resume);
        img.setImageResource(image);
    }
}
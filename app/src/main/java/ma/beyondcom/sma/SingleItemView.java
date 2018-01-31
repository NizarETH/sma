package ma.beyondcom.sma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends AppCompatActivity {

    // Declare Variables
    String rank;
    String country;
    String population;
    String flag;
    String position;
    ImageLoader imageLoader = new ImageLoader(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ma.beyondcom.sma.R.layout.singleitemview);
        Toolbar toolbar = (Toolbar) findViewById(ma.beyondcom.sma.R.id.toolbar);
        setSupportActionBar(toolbar);


        Intent i = getIntent();

        population = i.getStringExtra("population");
        // Get the result of flag
        flag = i.getStringExtra("flag");

        // Locate the TextViews in singleitemview.xml

        TextView txtpopulation = (TextView) findViewById(ma.beyondcom.sma.R.id.population);

        // Locate the ImageView in singleitemview.xml
        ImageView imgflag = (ImageView) findViewById(ma.beyondcom.sma.R.id.flag);

        // Set results to the TextViews

        txtpopulation.setText(population);

        // Capture position and set results to the ImageView
        // Passes flag images URL into ImageLoader.class
        imageLoader.DisplayImage(flag, imgflag);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(ma.beyondcom.sma.R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == ma.beyondcom.sma.R.id.navigate) {
            startActivity(new Intent(this,MenuActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}

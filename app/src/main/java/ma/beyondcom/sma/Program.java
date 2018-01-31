package ma.beyondcom.sma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Program extends AppCompatActivity {

    private  static ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ma.beyondcom.sma.R.layout.activity_program);
        Toolbar toolbar = (Toolbar) findViewById(ma.beyondcom.sma.R.id.toolbar);
        setSupportActionBar(toolbar);

        clickprg();
        clickrprginf();
    }
    public void clickprg()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.prog);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Programme");
                startActivity(intent);
            }
        });

    }
    public void clickrprginf()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.proginf);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Programmeinf");
                startActivity(intent);
            }
        });


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
            startActivity(new Intent(this, ma.beyondcom.sma.Activities.MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }


}

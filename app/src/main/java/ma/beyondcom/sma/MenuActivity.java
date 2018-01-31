package ma.beyondcom.sma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import ma.beyondcom.sma.Activities.RecycleActivities;

public class MenuActivity extends AppCompatActivity {

    private  static  ImageView img ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ma.beyondcom.sma.R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(ma.beyondcom.sma.R.id.toolbar);
        setSupportActionBar(toolbar);

       // getSupportActionBar().setHomeButtonEnabled(true);
        //   getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        click();
        clickmp();
        clickmb();
        clickprg();
        clickexp();
        clickinter();
        clickinfo();
        clickv();
        clickrecherche();
    }
    public void clickrecherche()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.v);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("SplashActivity");
                startActivity(intent);
            }
        });

    }
    public void clickv()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.v);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RecycleActivities.class);
                startActivity(intent);
            }
        });

    }

    public void clickinfo()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.info);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Info_Pratiques");
                startActivity(intent);
            }
        });

    }





    public void clickinter()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.inter);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Exposants");
                startActivity(intent);
            }
        });

    }

    public void clickexp()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.exp);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Eposters");
                startActivity(intent);
            }
        });

    }

    public void clickprg()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.prg);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Intervenants");
                startActivity(intent);
            }
        });

    }
    public void click()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("MotPresident");
                startActivity(intent);
            }
        });

    }
    public void clickmp()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.mp);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("MembreBureau");
                startActivity(intent);
            }
        });

    }
    public void clickmb()
    {
        img = (ImageView)findViewById(ma.beyondcom.sma.R.id.mb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("Programme");
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
            startActivity(new Intent(this,MenuActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

}

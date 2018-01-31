package ma.beyondcom.sma2018;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import ma.beyondcom.sma2018.Activities.RecycleActivities;

public class MenuActivity extends AppCompatActivity {

    private  static  ImageView img ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
        img = (ImageView)findViewById(R.id.v);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Activities.SplashActivity");
                startActivity(intent);
            }
        });

    }
    public void clickv()
    {
        img = (ImageView)findViewById(R.id.v);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, RecycleActivities.class);
                startActivity(intent);
            }
        });

    }

    public void clickinfo()
    {
        img = (ImageView)findViewById(R.id.info);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Info_Pratiques");
                startActivity(intent);
            }
        });

    }


    public void clickcomm()
    {
        img = (ImageView)findViewById(R.id.com);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Communications");
                startActivity(intent);
            }
        });

    }


    public void clickinter()
    {
        img = (ImageView)findViewById(R.id.inter);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Exposants");
                startActivity(intent);
            }
        });

    }

    public void clickexp()
    {
        img = (ImageView)findViewById(R.id.exp);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Eposters");
                startActivity(intent);
            }
        });

    }

    public void clickprg()
    {
        img = (ImageView)findViewById(R.id.prg);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Intervenants");
                startActivity(intent);
            }
        });

    }
    public void click()
    {
        img = (ImageView)findViewById(R.id.home);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.MotPresident");
                startActivity(intent);
            }
        });

    }
    public void clickmp()
    {
        img = (ImageView)findViewById(R.id.mp);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.MembreBureau");
                startActivity(intent);
            }
        });

    }
    public void clickmb()
    {
        img = (ImageView)findViewById(R.id.mb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent("ma.beyondcom.sma2018.Programme");
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.navigate) {
            startActivity(new Intent(this,ma.beyondcom.sma2018.Activities.MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

}

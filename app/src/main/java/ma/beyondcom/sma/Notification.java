package ma.beyondcom.sma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Notification extends AppCompatActivity
       {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ma.beyondcom.sma.R.layout.activity_notification);
        Toolbar toolbar = (Toolbar) findViewById(ma.beyondcom.sma.R.id.toolbar);
        setSupportActionBar(toolbar);

    }


}

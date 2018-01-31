package ma.beyondcom.sma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Info_Pratiques extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ma.beyondcom.sma.R.layout.activity_info__pratiques);
        Toolbar toolbar = (Toolbar) findViewById(ma.beyondcom.sma.R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = (WebView) findViewById(ma.beyondcom.sma.R.id.webview);

        webView.getSettings().setUseWideViewPort(true);
        webView.setInitialScale(1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://printempsdecardiologie.ma/smaandroid/info.php");
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


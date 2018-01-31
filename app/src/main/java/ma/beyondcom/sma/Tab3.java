package ma.beyondcom.sma;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by pc hp on 05/07/2017.
 */

public class Tab3 extends Fragment {
    private static  final  String TAG = "Tab1Fragment";
    private Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(ma.beyondcom.sma.R.layout.tab3p, container, false);
         WebView webView = (WebView) view.findViewById(ma.beyondcom.sma.R.id.webview);

         webView.getSettings().setUseWideViewPort(true);
         webView.setInitialScale(1);
           webView.getSettings().setJavaScriptEnabled(true);
     webView.getSettings().setBuiltInZoomControls(true);
         webView.getSettings().setDisplayZoomControls(false);
            webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://printempsdecardiologie.ma/smaandroid/prgj3.php");
        return view;
    }
}

package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper8);
        String url = "https://drive.google.com/open?id=11FC1Ts8mLV68RLLnL_cGKtSDH_iglflp";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay12);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

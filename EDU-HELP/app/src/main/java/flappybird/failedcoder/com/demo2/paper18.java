package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper18);
        String url = "https://drive.google.com/open?id=1264FUXSoqvhYxIM1CYpZJOZTCqa3-HUC";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay22);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


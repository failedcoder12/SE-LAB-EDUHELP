package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper4);
        String url = "https://drive.google.com/open?id=0B_6HKlnL1uUrdjFwX01HclRQQms";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay8);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper7);
        String url = "https://drive.google.com/open?id=1qlaI7Qe3bBiITMl7-ct73u5FJdIxE3k8";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay11);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
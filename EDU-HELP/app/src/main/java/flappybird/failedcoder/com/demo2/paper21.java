package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper21);
        String url = "https://drive.google.com/open?id=1Z8XHh3svGQc-h99NWwPSnfaST0PxP6R0";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay25);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


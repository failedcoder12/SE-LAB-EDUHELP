package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper20);
        String url = "https://drive.google.com/open?id=132pPvinUXM-WfYEU7p2780RwcEocefn8";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay24);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


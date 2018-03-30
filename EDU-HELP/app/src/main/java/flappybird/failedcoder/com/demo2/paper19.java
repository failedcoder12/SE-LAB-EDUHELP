package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper19);
        String url = "https://drive.google.com/open?id=1oBtrkam1w9W459fBmphxMnwD4-CaeENx";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay23);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


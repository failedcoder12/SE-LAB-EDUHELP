package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper2);
        String url = "https://drive.google.com/open?id=0B_6HKlnL1uUrc2ltNm0xQ0p5b2M";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay6);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

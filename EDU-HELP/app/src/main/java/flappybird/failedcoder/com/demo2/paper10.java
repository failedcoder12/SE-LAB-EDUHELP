package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper10);
        String url = "https://drive.google.com/open?id=1CRC39ePtntMPyMzf0Kbfkv7f14S6fzKv";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay14);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

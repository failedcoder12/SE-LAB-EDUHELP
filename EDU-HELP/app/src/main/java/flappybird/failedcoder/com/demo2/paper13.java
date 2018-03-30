package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper13);
        String url = "https://drive.google.com/open?id=0Bx1Xnx-IdXxZTlk3eUw4V2JIcUU";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay17);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

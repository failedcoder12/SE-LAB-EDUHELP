package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper17);
        String url = "https://drive.google.com/open?id=0Bx1Xnx-IdXxZQm90Z2ZzVGpMWU0";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay21);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper5);
        String url = "https://drive.google.com/open?id=1ecRjsP5M6R2SHWmBFD39qZV6CiczvU_u";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay9);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
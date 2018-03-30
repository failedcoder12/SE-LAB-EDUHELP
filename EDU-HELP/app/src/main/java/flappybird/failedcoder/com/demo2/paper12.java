package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper12);
        String url = "https://drive.google.com/open?id=1g_4ZNy2DJT7vQnsjrA28vlQOEsZ1i2Iw";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay16);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


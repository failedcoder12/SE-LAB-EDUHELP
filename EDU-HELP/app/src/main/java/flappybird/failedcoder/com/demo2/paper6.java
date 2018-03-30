package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper6);
        String url = "https://drive.google.com/open?id=0B8fY5tFZhFvfN0gzdTNiVTBEMmc";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay10);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
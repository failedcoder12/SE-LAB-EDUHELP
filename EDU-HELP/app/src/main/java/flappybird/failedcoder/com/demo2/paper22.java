package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper22);
        String url = "https://drive.google.com/open?id=1oFKkeMLqvn3x3ljNMk7VKgvxfQEt7pz_";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay26);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}


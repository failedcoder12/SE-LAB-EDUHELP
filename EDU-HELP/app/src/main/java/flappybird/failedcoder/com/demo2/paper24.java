package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper24);
        String url = "https://drive.google.com/open?id=18kg8f67vKqV4MzJweLiH88o2KXg45aa9";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay28);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

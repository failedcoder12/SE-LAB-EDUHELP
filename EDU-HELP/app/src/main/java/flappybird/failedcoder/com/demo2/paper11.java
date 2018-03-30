package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper11);
        String url = "https://drive.google.com/open?id=1hiz6wYRzS2HabpHJB4gsDZsQvwVvkcXs";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay15);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

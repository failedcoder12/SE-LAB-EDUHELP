package flappybird.failedcoder.com.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paper23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper23);
        String url = "https://drive.google.com/open?id=1BTgV99uWLJrNg2xyHtwU2F-V8g_lFrhu";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay27);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

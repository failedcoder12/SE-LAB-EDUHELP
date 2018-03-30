package flappybird.failedcoder.com.demo2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class paper1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper1);
        String url = "https://drive.google.com/open?id=0By_nqh2XhihQSnNzdmVDY2o0NG8";
        WebView view= (WebView)this.findViewById(R.id.Bdisplay5);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}

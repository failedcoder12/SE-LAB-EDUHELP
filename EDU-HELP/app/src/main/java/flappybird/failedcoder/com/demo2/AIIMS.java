package flappybird.failedcoder.com.demo2;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AIIMS extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiims);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bdisplay5) {
            Intent i = new Intent(AIIMS.this, paper1.class);
            startActivity(i);
        }
        else if (v.getId()== R.id.Bdisplay6){
            Intent i =new Intent(AIIMS.this,paper2.class);
            startActivity(i);
        }
        else if (v.getId()== R.id.Bdisplay7) {
            Intent i = new Intent(AIIMS.this, paper3.class);
            startActivity(i);
        }
        else if (v.getId()== R.id.Bdisplay8) {
            Intent i = new Intent(AIIMS.this,paper4.class);
            startActivity(i);
        }
        else if (v.getId()== R.id.Bdisplay9) {
            Intent i = new Intent(AIIMS.this,paper5.class);
            startActivity(i);
        }
        else if (v.getId()== R.id.Bdisplay10) {
            Intent i = new Intent(AIIMS.this,paper6.class);
            startActivity(i);
        }

    }

}

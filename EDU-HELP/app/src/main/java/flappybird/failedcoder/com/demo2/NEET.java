package flappybird.failedcoder.com.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NEET extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bdisplay11) {
            Intent i = new Intent(NEET.this, paper7.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay12) {
            Intent i = new Intent(NEET.this, paper8.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay13) {
            Intent i = new Intent(NEET.this, paper9.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay14) {
            Intent i = new Intent(NEET.this, paper10.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay15) {
            Intent i = new Intent(NEET.this, paper11.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay16) {
            Intent i = new Intent(NEET.this, paper12.class);
            startActivity(i);
        }

    }
}

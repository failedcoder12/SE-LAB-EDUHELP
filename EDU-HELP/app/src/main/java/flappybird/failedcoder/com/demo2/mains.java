package flappybird.failedcoder.com.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mains extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bdisplay17) {
            Intent i = new Intent(mains.this, paper13.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay18) {
            Intent i = new Intent(mains.this, paper14.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay19) {
            Intent i = new Intent(mains.this, paper15.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay20) {
            Intent i = new Intent(mains.this, paper16.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay21) {
            Intent i = new Intent(mains.this, paper17.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay22) {
            Intent i = new Intent(mains.this, paper18.class);
            startActivity(i);
        }
    }
}
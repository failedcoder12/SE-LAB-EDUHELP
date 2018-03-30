package flappybird.failedcoder.com.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Advance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.Bdisplay23) {
            Intent i = new Intent(Advance.this, paper19.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay24) {
            Intent i = new Intent(Advance.this, paper20.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay25) {
            Intent i = new Intent(Advance.this, paper21.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay26) {
            Intent i = new Intent(Advance.this, paper22.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay27) {
            Intent i = new Intent(Advance.this, paper23.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bdisplay28) {
            Intent i = new Intent(Advance.this, paper24.class);
            startActivity(i);
        }
    }

}



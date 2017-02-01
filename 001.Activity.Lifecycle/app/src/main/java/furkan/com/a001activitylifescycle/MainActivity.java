package furkan.com.a001activitylifescycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w("MainActivity#onCreate" , "onCreate worked. activity object is created.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("MainActivity#onResume" , "onResume worked. activity came to front on the stack.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MainActivity#onDestroy" , "onDestroy worked.activity object is destroyed ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MainActivity#onPause","onPause worked. activity went to background on the stack");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("MainActivity#onRestart","onRestart worked.activity worked again");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("MainActivity#onStart","onStart worked . activity worked.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MainActivity#onStop","onStop worked.activity stopped.");
    }
}

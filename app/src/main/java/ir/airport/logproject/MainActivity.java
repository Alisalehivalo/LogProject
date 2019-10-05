package ir.airport.logproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyAppLog", "onCreate: LogProject");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyAppLog", "onStart: LogProject");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyAppLog", "onResume: LogProject");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyAppLog", "onStop: LogProject");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyAppLog", "onPause: LogProject");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyAppLog", "onDestroy: LogProject");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MyAppLog", "onRestart: LogProject");
    }
}

package info.slidingmenu.model.my.button_exercises.app;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private View mColorRegion;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorRegion = findViewById(R.id.color_region);
        Button red = (Button) findViewById(R.id.red);
        Button blue = (Button) findViewById(R.id.blue);
        Button yellow = (Button) findViewById(R.id.yellow);
        RadioButton redRad = (RadioButton) findViewById(R.id.redRadio);
        RadioButton blueRad = (RadioButton) findViewById(R.id.blueRadio);
        RadioButton yellowRad = (RadioButton) findViewById(R.id.yellowRadio);
        red.setOnClickListener(new ColorSetter(Color.RED, this));
        blue.setOnClickListener(new ColorSetter(Color.BLUE, this));
        yellow.setOnClickListener(new ColorSetter(Color.YELLOW, this));
        redRad.setOnClickListener(new ColorSetter(Color.RED, this));
        blueRad.setOnClickListener(new ColorSetter(Color.BLUE, this));
        yellowRad.setOnClickListener(new ColorSetter(Color.YELLOW, this));

    }

    private class Button1Listener implements View.OnClickListener {
        @Override
        public void onClick(View clickedButton) {

            String pushStr = "Stop Pushing Me!";
            Toast tempMsg;
            tempMsg = Toast.makeText(MainActivity.this, pushStr, Toast.LENGTH_SHORT);
            tempMsg.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void setRegionColor(int color){
        mColorRegion.setBackgroundColor(color);
    }
}

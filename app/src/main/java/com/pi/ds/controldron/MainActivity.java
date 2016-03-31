package com.pi.ds.controldron;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.pi.ds.controldron.configuracion.SettingsActivity;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
 private Button buttonConfiguracion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonConfiguracion = (Button)findViewById(R.id.btnConfiguracion);
        buttonConfiguracion.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnConfiguracion:

                //startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                Log.e("eso","mismo");
                Intent pref = new Intent(this, SettingsActivity.class);
                startActivity(pref);




                break;
            default:break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

package com.example.roberto.actividaddint3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    MainActivityEvents events;
    fragmentPrincipal fragmentPrincipal;
    MainActivityFragment mainActivityFragment;
    MainActivityFragment2 mainActivityFragment2;
    MainActivityFragment3 mainActivityFragment3;
    FloatingActionButton btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentPrincipal = (fragmentPrincipal) getSupportFragmentManager().findFragmentById(R.id.fragmentFinal);

        btn = this.findViewById(R.id.btn);

        events = new MainActivityEvents(this);
        btn.setOnClickListener(events);

          FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
          transaction.hide(fragmentPrincipal);
          transaction.commit();
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

    /**
     * Commit final
     * Testeo final de la app en el samsung 8 de Roberto
     * funciona ok
     */
}

package com.example.roberto.actividaddint3;

import android.view.View;

/**
 * Created by roberto on 21/1/18.
 */

public class MainActivityEvents implements View.OnClickListener{

    MainActivity mainActivity;


    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {

    if (mainActivity.fragmentPrincipal.isHidden()){
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.show(mainActivity.fragmentPrincipal);
        transaction.commit();

    }else{
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(mainActivity.fragmentPrincipal);
        transaction.commit();

    }
    }
}

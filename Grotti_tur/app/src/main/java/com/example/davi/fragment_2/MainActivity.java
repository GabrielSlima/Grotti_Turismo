package com.example.davi.fragment_2;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //CRIAR INSTANCIAS DO FRAGMENT
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //INSTACIANDO O FRAGMENT1
        fragment = new Fragment1();

        //INSTANCIANDO O FRAGMENT MANNAGER
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        //ft.replace(fragmentID,fragment instace );
        fragmentTransaction.replace(R.id.fragment_place, fragment);
        fragmentTransaction.commit();
    }


    public void mudar_fragmento(View view) {

        //CHECANDO QUAL BOTÃO FOI CLICADO
        if(view == findViewById(R.id.btn1))  // SE BTN1
        {
            //INSTACIANDO O FRAGMENT1
            fragment = new Fragment1();

            //INSTANCIANDO O FRAGMENT MANNAGER
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
//            ft.replace(fragmentID,fragment instace );
            fragmentTransaction.replace(R.id.fragment_place, fragment);
            fragmentTransaction.commit();
        }

        if(view == findViewById(R.id.btn2))
        {
            fragment = new Fragment2();
            //INSTANCIANDO O FRAGMENT MANNAGER
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
//            ft.replace(fragmentID,fragment instace );
            fragmentTransaction.replace(R.id.fragment_place, fragment);
            fragmentTransaction.commit();
        }
    }
}

package org.tinybag.www.android_mvc_mvp_mvvm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.tinybag.www.android_mvc_mvp_mvvm.mvc.MVCActivity;
import org.tinybag.www.android_mvc_mvp_mvvm.mvp.MVPActivity;
import org.tinybag.www.android_mvc_mvp_mvvm.mvvm.MVVMActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openLayout(View view) {
        try{

            switch (view.getId()){
                case  R.id.MVC:
                    startActivity(new Intent(MainActivity.this,MVCActivity.class));
                    break;
                case  R.id.MVP:
                    startActivity(new Intent(MainActivity.this,MVPActivity.class));
                    break;
                case  R.id.MVVM:
                    startActivity(new Intent(MainActivity.this,MVVMActivity.class));
                    break;
            }

        }catch (Exception ex){

        }
    }
}

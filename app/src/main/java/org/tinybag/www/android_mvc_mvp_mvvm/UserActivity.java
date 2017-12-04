package org.tinybag.www.android_mvc_mvp_mvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        if(this.getIntent().getBundleExtra("User") != null){

            ModelForMvcMvpMvvmUser modelForMvcMvpMvvmUser = (ModelForMvcMvpMvvmUser) this.getIntent().getBundleExtra("User").getSerializable("User");

            ((TextView) findViewById(R.id.uservalid)).setText(modelForMvcMvpMvvmUser.isValidUser().toString());
            ((TextView) findViewById(R.id.userfrom)).setText(modelForMvcMvpMvvmUser.getUserFrom().toString());
            ((TextView) findViewById(R.id.username)).setText(modelForMvcMvpMvvmUser.getUsername().toString());

        }else{
            this.finish();
        }


    }







}

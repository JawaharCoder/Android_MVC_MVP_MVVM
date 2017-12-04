package org.tinybag.www.android_mvc_mvp_mvvm.mvc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.tinybag.www.android_mvc_mvp_mvvm.R;
import org.tinybag.www.android_mvc_mvp_mvvm.UserActivity;

public class MVCActivity extends AppCompatActivity implements View.OnClickListener {

    MVCController mvcController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        mvcController = new MVCController();
        findViewById(R.id.mvcbutton).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(mvcController.authenticateTheUser(
                ((EditText)findViewById(R.id.mvcedtusername)).getText().toString(),
                ((EditText)findViewById(R.id.mvcedtpassword)).getText().toString()
        )){
            mvcController.getModelForMvcMvpMvvmUser().setUserFrom("MVC");
            Intent intent = new Intent(MVCActivity.this, UserActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("User", mvcController.getModelForMvcMvpMvvmUser());
            intent.putExtra("User", bundle);
            startActivity(intent);

        }else{
            Toast.makeText(getApplicationContext(),"Not A Valid User", Toast.LENGTH_LONG).show();
        }

    }
}

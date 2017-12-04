package org.tinybag.www.android_mvc_mvp_mvvm.mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.tinybag.www.android_mvc_mvp_mvvm.R;
import org.tinybag.www.android_mvc_mvp_mvvm.UserActivity;
import org.tinybag.www.android_mvc_mvp_mvvm.mvc.MVCActivity;

public class MVPActivity extends AppCompatActivity implements  MVPPreView{

    MVPPresenter mvpPresenter = new MVPPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        mvpPresenter.setView(this);
        findViewById(R.id.mvpbutton).setOnClickListener(this);
    }

    @Override
    public String getUserName() {
        return ((EditText)findViewById(R.id.mvpedtusername)).getText().toString();
    }

    @Override
    public String getUserPassword() {
        return ((EditText)findViewById(R.id.mvpedtpassword)).getText().toString();
    }

    @Override
    public void onClick(View v) {
        if(mvpPresenter.onAuthenticateUser()){
            mvpPresenter.getModelForMvcMvpMvvmUser().setUserFrom("MVP");
            Intent intent = new Intent(MVPActivity.this, UserActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("User", mvpPresenter.getModelForMvcMvpMvvmUser());
            intent.putExtra("User", bundle);
            startActivity(intent);

        }else{
            Toast.makeText(getApplicationContext(),"Not A Valid User", Toast.LENGTH_LONG).show();
        }

    }
}

package org.tinybag.www.android_mvc_mvp_mvvm.mvvm;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;


import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import org.tinybag.www.android_mvc_mvp_mvvm.CommonCheckCredential;
import org.tinybag.www.android_mvc_mvp_mvvm.InterfaceAuthenticate;
import org.tinybag.www.android_mvc_mvp_mvvm.ModelForMvcMvpMvvmUser;
import org.tinybag.www.android_mvc_mvp_mvvm.UserActivity;

import java.util.Objects;

/**
 * Created by developer.chn3 on 4/12/2017.
 */



public class MVVMViewModel extends BaseObservable implements InterfaceAuthenticate, BindActivity {

    private ModelForMvcMvpMvvmUser modelForMvcMvpMvvmUser = new ModelForMvcMvpMvvmUser();
    public ObservableField<String> Username = new ObservableField<>();
    public ObservableField<String> Password = new ObservableField<>();

    public TextWatcher watcherUsername = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override public void afterTextChanged(Editable s) {
            if (!Objects.equals(Username.get(), s.toString())) {
                Username.set(s.toString());

            }

        }
    };

    public TextWatcher watcherPassword = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override public void afterTextChanged(Editable s) {
            if (!Objects.equals(Password.get(), s.toString())) {
                Password.set(s.toString());

            }
        }
    };

    private Activity activity;
    public void OnButtonClick(View view){
        if(authenticateTheUser(this.Username.get(), this.Password.get())){
            getModelForMvcMvpMvvmUser().setUserFrom("MVVM");
            Intent intent = new Intent(activity, UserActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("User", getModelForMvcMvpMvvmUser());
            intent.putExtra("User", bundle);
            activity.startActivity(intent);

        }else{
            Toast.makeText(activity.getApplicationContext(),"Not A Valid User", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public Boolean authenticateTheUser(String Username, String Password) {
        if(CommonCheckCredential.authenticateTheUser(this.modelForMvcMvpMvvmUser,Username,Password)){
            return true;
        }
        return false;
    }

    public ModelForMvcMvpMvvmUser getModelForMvcMvpMvvmUser() {
        return modelForMvcMvpMvvmUser;
    }

    @Override
    public Boolean IsValidUser() {
        return modelForMvcMvpMvvmUser.isValidUser();
    }


    @Override
    public void setActivity(MVVMActivity mvvmActivity) {
        this.activity = mvvmActivity;
    }
}



package org.tinybag.www.android_mvc_mvp_mvvm.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.tinybag.www.android_mvc_mvp_mvvm.R;
import org.tinybag.www.android_mvc_mvp_mvvm.databinding.ActivityMvvmBinding;


public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mvvm);
        MVVMViewModel mvvmViewModel = new MVVMViewModel();
        mvvmViewModel.setActivity(this);
        ActivityMvvmBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        binding.setData(mvvmViewModel);
    }
}

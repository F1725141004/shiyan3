package com.example.shiyan3;




import android.widget.TextView;
import android.view.View;
import android.app.Activity;




public class ClickListener implements View.OnClickListener {



    private Activity atv;

    private TextView tev;



    public ClickListener(Activity activity, TextView textView){

        this.atv=activity;

        this.tev=textView;

    }





    @Override

    public void onClick(View view) {

        tev.setText("点击了采用外部类的监听器");

    }

}


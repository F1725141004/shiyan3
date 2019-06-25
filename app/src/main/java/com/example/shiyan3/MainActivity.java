package com.example.shiyan3;



import android.content.Intent;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.support.v7.app.AppCompatActivity;








import butterknife.OnClick;
import butterknife.ButterKnife;
import static com.example.shiyan3.R.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    private Button mbt1;

    private Button mbt2;

    private Button mbt3;

    private Button mbt4;

    private Button mbt5;

    private Button mbt7;

    private Button mbt8;

    private TextView tv1;













    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(layout.activity_main);
        tv1=(TextView)findViewById(id.tv_1);
        mbt4=(Button)findViewById(id.btn_4);
        mbt3=(Button)findViewById(id.btn_3);
        mbt5=(Button)findViewById(id.btn_5);
        mbt2=(Button)findViewById(id.btn_2);
        mbt7=(Button)findViewById(id.btn_7);
        mbt1=(Button)findViewById(id.btn_1);
        mbt8=(Button)findViewById(id.btn_8);



        ButterKnife.bind(this);

        //Acticity作为监听器

        mbt1.setOnClickListener(MainActivity.this);



        //匿名内部类

        mbt2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                tv1.setText("点击了采用匿名内部类的监听器");

            }

        });



        //内部类

        mbt4.setOnClickListener(new OnClick1());



        //外部类

        mbt5.setOnClickListener(new ClickListener(MainActivity.this,tv1));

        mbt7.setOnClickListener(new View.OnClickListener(){



            @Override

            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,imActivity.class);

                startActivity(intent);

            }

        });

        mbt8.setOnClickListener(new View.OnClickListener(){



            @Override

            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,ProgressDialogTest.class);

                startActivity(intent);

            }

        });

    }



    @Override

    public void onClick(View view) {

        switch (view.getId())

        {

            case id.btn_1:

                tv1.setText("点击了采用Activity作为监听器的监听器");

                break;

        }



    }



    class OnClick1 implements View.OnClickListener{



        @Override

        public void onClick(View view) {

            switch (view.getId())

            {

                case id.btn_4:

                    tv1.setText("点击了采用内部类的监听器");

                    break;

            }

        }

    }

    public void Click_1 (View view)

    {

        tv1.setText("点击了采用绑定到标签的监听器");

    }



    @OnClick({R.id.btn_6})

    public void onViewClicked(View view) { tv1.setText("点击了采用ButterKnife绑定的监听器");    }

}




package com.example.hidden.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paic.mhis.authsdk.BaseContext;
import com.paic.mhis.authsdk.main.MySocialCardActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.paic.mhis.authsdk.BaseContext;
import com.paic.mhis.authsdk.main.MySocialCardActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseContext.init(this, false);
        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MySocialCardActivity.class);

                //生产账号
//                intent.putExtra("siappUserId", "2c527f8e1c184c74bd8f90e9a68a7737");
//                intent.putExtra("secondToken", "z7jFhUxZ0MJh8Qz77jLQWXMZrnApWtr3qOynJR7OY4QCLTzdnUGXhE");
//                intent.putExtra("uid", "0102565993");
//                intent.putExtra("identity_number", "53012419890731171X");
//                intent.putExtra("real_name", "毕学明");
//                intent.putExtra("phone_number", "15288275120");
//
//                intent.putExtra("siappUserId", "2c527f8e1c184c74bd8f90e9a68a7737");
//                intent.putExtra("secondToken", "z7jFhUxZ0MJh8Qz77jLQWXMZrnApWtr3qOynJR7OY4QCLTzdnUGXhE");
//                intent.putExtra("uid", "0102565993");
//                intent.putExtra("identity_number", "53012419890731171X");
//                intent.putExtra("real_name", "毕学明");
//                intent.putExtra("phone_number", "15288275120");

                intent.putExtra("siappUserId", "b55e541f68a44a778aefcff7f768048d");
                intent.putExtra("secondToken", "l9VYYROl_t8S5ZXgk4rBugbsTxQi8f7tLsEKpwhDsGFzda0xAoytVY");
                intent.putExtra("uid", "0102660346");
                intent.putExtra("identity_number", "532101198906281616");
                intent.putExtra("real_name", "邬蛟");
                intent.putExtra("phone_number", "18388034034");
//////
//                intent.putExtra("siappUserId", "2c527f8e1c184c74bd8f90e9a68a7737");
//                intent.putExtra("secondToken", "z7jFhUxZ0MJh8Qz77jLQWXMZrnApWtr3qOynJR7OY4QCLTzdnUGXhE");
//                intent.putExtra("uid", "0102565993");
//                intent.putExtra("identity_number", "372922198701014165");
//                intent.putExtra("real_name", "王玉");
//                intent.putExtra("phone_number", "15098997852");

//                intent.putExtra("siappUserId", "ae0f8fe79fcd466a9a98036c933bd106");
//                intent.putExtra("secondToken", "f59f_L6RmMGDApTnSqwc8sx-JAwD7vFIlCglEkObs7aO2qSvD_Xr18");
//    ≤            intent.putExtra("uid", "0102565994");
//                intent.putExtra("identity_number", "533221198908204333");
//                intent.putExtra("real_name", "王金华");
//                intent.putExtra("phone_number", "15288433604");

//                intent.putExtra("siappUserId", "37e14b201a54488197234ea0924f4d2a");
//                intent.putExtra("secondToken", "YHoRg_oPyqJAV2P5y5o1Ps7NUYwpu89IeM3Kfb6ehD6Se6P1BQStJc");
//                intent.putExtra("uid", "000001");
//                intent.putExtra("identity_number", "532331199107222840");
//                intent.putExtra("real_name", "饶桂梅");
//                intent.putExtra("phone_number", "15301064543");

//                intent.putExtra("siappUserId", "69f1c3a6359a433186b5195ae8be2b94");
//                intent.putExtra("secondToken", "N9rxjv2ribuR6F3cW2I8hzH4eggNfYJP2AJchx_86TizPAnpNhd5BQ");
//                intent.putExtra("uid", "7");
//                intent.putExtra("identity_number", "530111197403214426");
//                intent.putExtra("real_name", "李文");
//                intent.putExtra("phone_number", "18501780006");

//                intent.putExtra("siappUserId", "41d3efbdb6a042de83c4234e4913484f");
//                intent.putExtra("secondToken", "YHoRg_oPyqJAV2P5y5o1Ps7NUYwpu89IeM3Kfb6ehD6Se6P1BQStJc");
//                intent.putExtra("uid", "123456123456215");
//                intent.putExtra("identity_number", "370830198811071315");
//                intent.putExtra("real_name", "立冬");
//                intent.putExtra("phone_number", "18721228619");
                startActivity(intent);

            }
        });



        //ooiweiorwsdfsfslkdfjsljf
        //dsfsdfsf
        //qwrwgsdf

    }
}


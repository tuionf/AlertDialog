package com.example.tuionf.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


  }

    public void dialog(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setIcon(R.drawable.aaa);
        dialog.setTitle("提示：");
        dialog.setMessage("确定退出吗？");
        dialog.setView(new EditText(this));
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
                finish();
            }
        });

        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
            }
        });

        dialog.setNeutralButton("呵呵", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"你说呢？",Toast.LENGTH_SHORT).show();
            }
        });

        dialog.create().show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            dialog();
        }
        return false;
    }
}

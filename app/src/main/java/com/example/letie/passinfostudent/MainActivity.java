package com.example.letie.passinfostudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtHoTenSV;
    private Button btnXacNhan;
    public static final String HOTENSV="HOTENSV";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHoTenSV=(EditText) findViewById(R.id.edtHoTenSV);
        btnXacNhan=(Button)findViewById(R.id.btnXacNhan);

        btnXacNhan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String hoTenSV=edtHoTenSV.getText().toString();
                byExtras(hoTenSV);
            }
        });

    }
    public void byExtras(String hoTenSV){
        Intent intent = new Intent(MainActivity.this,StudentActitvity.class);
        intent.putExtra(HOTENSV,hoTenSV);
        startActivity(intent);
    }
}

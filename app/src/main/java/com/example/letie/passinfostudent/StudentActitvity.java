package com.example.letie.passinfostudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StudentActitvity extends AppCompatActivity {
    private TextView txvHoTenSV;
    private EditText edtQueQuan;
    private EditText edtNgaySinh;
    private EditText edtGioiTinh;
    private EditText edtLop;
    private EditText edtKhoaHoc;
    private Button btnXacNhan;

    private InfoStudent infoStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_actitvity);
        txvHoTenSV=(TextView) findViewById(R.id.txvHoTenSV);
        edtQueQuan=(EditText)findViewById(R.id.edtQueQuan);
        edtNgaySinh=(EditText)findViewById(R.id.edtNgaySinh);
        edtGioiTinh=(EditText)findViewById(R.id.edtGioiTinh);
        edtLop=(EditText)findViewById(R.id.edtLop);
        edtKhoaHoc=(EditText)findViewById(R.id.edtKhoaHoc);
        btnXacNhan=(Button)findViewById(R.id.btnXacNhan);
        setDataByExtras();

        btnXacNhan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String hoTenSV=txvHoTenSV.getText().toString();
                String queQuan=edtQueQuan.getText().toString();
                String ngaySinh=edtNgaySinh.getText().toString();
                String gioiTinh=edtGioiTinh.getText().toString();
                String lop=edtLop.getText().toString();
                String khoaHoc=edtKhoaHoc.getText().toString();
                sendDataByParcelable( hoTenSV, queQuan, ngaySinh, gioiTinh, lop, khoaHoc);

            }
        });
    }
    public void setDataByExtras(){
        Intent intent=getIntent();
        String hoTenSV=intent.getStringExtra(MainActivity.HOTENSV);
        txvHoTenSV.setText(hoTenSV);
    }
    public void sendDataByParcelable(String HoTenSV,String QueQuan,String NgaySinh,String GioiTinh,String Lop,String KhoaHoc){
        Intent intent = new Intent(StudentActitvity.this,StudentInforActivity.class);
        infoStudent= new InfoStudent( HoTenSV, QueQuan, NgaySinh, GioiTinh, Lop, KhoaHoc);
        intent.putExtra("infoStudent",infoStudent);
        startActivity(intent);
    }
}

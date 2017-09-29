package com.example.letie.passinfostudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {

    private TextView txvHoTenSV;
    private TextView txvQueQuan;
    private TextView txvNgaySinh;
    private TextView txvGioiTinh;
    private TextView txvLop;
    private TextView txvKhoaHoc;
    private InfoStudent infoStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        txvHoTenSV=(TextView) findViewById(R.id.txvHoTenSV);
        txvQueQuan=(TextView)findViewById(R.id.txvQueQuan);
        txvNgaySinh=(TextView)findViewById(R.id.txvNgaySinh);
        txvGioiTinh=(TextView)findViewById(R.id.txvGioiTinh);
        txvLop=(TextView)findViewById(R.id.txvLop);
        txvKhoaHoc=(TextView)findViewById(R.id.txvKhoaHoc);
        setDataByParcelable();
    }
    public void setDataByParcelable(){
        Intent intent=getIntent();
        infoStudent=intent.getParcelableExtra("infoStudent");
        txvHoTenSV.setText(infoStudent.getHoTenSV());
        txvQueQuan.setText(infoStudent.getQueQuan());
        txvNgaySinh.setText(infoStudent.getNgaySinh());
        txvGioiTinh.setText(infoStudent.getGioiTinh());
        txvLop.setText(infoStudent.getLop());
        txvKhoaHoc.setText(infoStudent.getKhoaHoc());
    }
}

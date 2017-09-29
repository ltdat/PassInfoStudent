package com.example.letie.passinfostudent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by letie on 09/29/2017.
 */

public class InfoStudent implements Parcelable {
    private String HoTenSV,QueQuan, NgaySinh,GioiTinh,Lop,KhoaHoc;
    public String getHoTenSV(){
        return HoTenSV;
    }
    public String getQueQuan(){
        return QueQuan;
    }
    public String getNgaySinh(){
        return NgaySinh;
    }
    public String getGioiTinh(){
        return GioiTinh;
    }
    public String getLop(){
        return Lop;
    }
    public String getKhoaHoc(){
        return KhoaHoc;
    }
    public InfoStudent(String HoTenSV,String QueQuan,String NgaySinh,String GioiTinh,String Lop,String KhoaHoc){
        this.HoTenSV=HoTenSV;
        this.QueQuan=QueQuan;
        this.NgaySinh=NgaySinh;
        this.GioiTinh=GioiTinh;
        this.Lop=Lop;
        this.KhoaHoc=KhoaHoc;
    }
    protected InfoStudent(Parcel in){
        this.HoTenSV=in.readString();
        this.QueQuan=in.readString();
        this.NgaySinh=in.readString();
        this.GioiTinh=in.readString();
        this.Lop=in.readString();
        this.KhoaHoc=in.readString();
    }
    public static final Creator<InfoStudent> CREATOR= new Creator<InfoStudent>() {
        @Override
        public InfoStudent createFromParcel(Parcel in) {
            return new InfoStudent(in);
        }

        @Override
        public InfoStudent[] newArray(int size) {
            return new InfoStudent[size];
        }
    };
    public int describeContents(){
        return 0;
    }
    public void writeToParcel(Parcel parcel, int i){
        parcel.writeString(HoTenSV);
        parcel.writeString(QueQuan);
        parcel.writeString(NgaySinh);
        parcel.writeString(GioiTinh);
        parcel.writeString(Lop);
        parcel.writeString(KhoaHoc);
    }

}

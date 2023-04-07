/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author HELLO
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemLyThuyet;
    private float diemThucHanh;
    private float diemTrungBinh;



    public SinhVien(String maSV, String hoTen, float diemLyThuyet, float diemThucHanh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.diemTrungBinh = (diemLyThuyet + diemThucHanh) / 2;
    }



    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(float diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public float getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(float diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        diemLyThuyet = sc.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        diemThucHanh = sc.nextFloat();
        diemTrungBinh = (diemLyThuyet + diemThucHanh) / 2;
    }

    @Override
    public String toString() {
        return "Sinh vien ma: " + maSV + ", ho ten: " + hoTen + ", diem ly thuyet: " + diemLyThuyet + ", diem thuc hanh: " + diemThucHanh + ", diem trung binh: " + diemTrungBinh;
    }
}


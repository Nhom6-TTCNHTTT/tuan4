package Bai4_Phieu5_41_UongVanNhat;

import java.util.Scanner;

public class Hang {
    private String tenHang;
    private float soLuong, donGia;
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập vào tên hàng: ");
        tenHang=sc.nextLine();
        System.out.print("Nhập vào số lượng hàng: ");
        soLuong=sc.nextFloat();
        System.out.print("Nhập vào đơn giá hàng: ");
        donGia=sc.nextFloat();
    }

    public String getTenHang() {
        return tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }
    
    public float tinhTongTien(){
        return soLuong*donGia;
    }
    static void inTieuDe(){
        System.out.println("===========THÔNG TIN CÁC MẶT HÀNG============");
    }
    public void inDL(){
        System.out.print(tenHang+"\t"+"\t"+donGia+"\t"+"\t"+soLuong+"\t"+"\t"+tinhTongTien());
    }
}

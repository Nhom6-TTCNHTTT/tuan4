/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/* Xây dựng lớp: Bài toán Nhân viên và hàm thành phần.
Viết hàm main để kiểm tra lớp NhanVien theo yêu cầu sau:
- Tạo 2 nhân viên với các thuộc tính cho người dùng nhập vào.
- Xuất ra các thông tin của họ, gồm mã, số sản phẩm, lương, tổng kết và cho biết
nhân viên có vượt chuẩn không. */

/**
 *
 * @author HELLO
 */
public class NhanViendemo {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    NhanVien nv1 = new NhanVien();
    System.out.print("Nhập mã nhân viên 1: ");
    nv1.setMaNV(sc.nextLine());
    System.out.print("Nhập số sản phẩm nhân viên 1: ");
    nv1.setSoSP(sc.nextInt());

    NhanVien nv2 = new NhanVien();
    System.out.print("Nhập mã nhân viên 2: ");
    sc.nextLine();
    nv2.setMaNV(sc.nextLine());
    System.out.print("Nhập số sản phẩm nhân viên 2: ");
    nv2.setSoSP(sc.nextInt());

    NhanVien[] dsNhanVien = {nv1, nv2};
    NhanVien.xuatTieuDe();

    for (NhanVien nv : dsNhanVien) {
      System.out.println(nv);
      if (nv.coVuotChuan()) {
        System.out.println("Nhân viên " + nv.getMaNV() + " vượt chuẩn");
      }
    }

    System.out.println("Danh sach nhan vien vuot chuan:");
    NhanVien.xuatTieuDe();
    for (NhanVien nv : dsNhanVien) {
      if (nv.coVuotChuan()) {
        System.out.println(nv);
      }
    }

}
}

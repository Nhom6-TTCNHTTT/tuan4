/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhucDinh;
    import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author HELLO
 */
public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = 3;
    SinhVien[] sv = new SinhVien[n];

    // Tạo đối tượng sinh viên sv1
    sv[0] = new SinhVien("SV001", "Nguyen Van A", 7, 8);
 sv[0].nhap();
    // Tạo đối tượng sinh viên sv2
    sv[1] = new SinhVien("SV002", "Nguyen Van B", 9, 10);

    // Tạo đối tượng sinh viên sv3
    sv[2] = new SinhVien("SV003", "Nguyen", 5, 5);

    sv[2].setMaSV("SV003");
    sv[2].setHoTen("Nguyen Van C");
    

    // Xuất thông tin sinh viên và kết quả học tập
    for (int i = 0; i < n; i++) {
      System.out.println(sv[i].toString());
      if (sv[i].getDiemTrungBinh() >= 5) {
        System.out.println("Ket qua hoc tap: Dau");
      } else {
        System.out.println("Ket qua hoc tap: Rot");
      }
      System.out.println("");
    }

    // Sắp xếp danh sách sinh viên theo tên và điểm lý thuyết
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (sv[i].getHoTen().compareTo(sv[j].getHoTen()) > 0) {
          SinhVien temp = sv[i];
          sv[i] = sv[j];
          sv[j] = temp;
        } else if (sv[i].getHoTen().compareTo(sv[j].getHoTen()) == 0) {
          if (sv[i].getDiemLyThuyet() > sv[j].getDiemLyThuyet()) {
            SinhVien temp = sv[i];
            sv[i] = sv[j];
            sv[j] = temp;
          }
        }
      }
    }

    // Xuất danh sách sinh viên đã được sắp xếp
    System.out.println("Danh sach sinh vien sau khi sap xep:");
    for (int i = 0; i < n; i++) {
      System.out.println(sv[i].toString());
      System.out.println("");
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
     
          if (sv[i].getDiemTrungBinh()> sv[j].getDiemTrungBinh()) {
            SinhVien temp = sv[i];
            sv[i] = sv[j];
            sv[j] = temp;
          }
        
      }
    }

    // Xuất danh sách sinh viên đã được sắp xếp
    System.out.println("Sinh vien co diem trung binh thap nhat :");
      System.out.println(sv[0].toString());
   System.out.println("Sinh vien co diem trung binh cao nhat :");
      System.out.println(sv[n-1].toString());
 }
}

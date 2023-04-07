
package Bai4_Phieu5_41_UongVanNhat;

import java.util.Scanner;

public class KhachHang {
    private String hoten, diaChi;
    Scanner sc=new Scanner(System.in);
    
    public void nhap(){
        System.out.print("\nNhập vào tên khách hàng: ");
            hoten=sc.nextLine();
        System.out.print("Nhập vào địa chỉ khách hàng: ");
            diaChi=sc.nextLine();
    }

    @Override
    public String toString() {
        return "\nHọ tên:" + hoten + "\tĐịa chỉ: " + diaChi + "\n";
    }
}

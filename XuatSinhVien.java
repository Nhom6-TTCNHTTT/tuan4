package Bai3_5;

import java.util.Scanner;

public class XuatSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập số lượng sv:");
			n = sc.nextInt();
			if(n<0) {
				System.out.println("Nhập lại số lượng sv:");
				n = sc.nextInt();
			}
		}while(n<0);
		
		SinhVien[] a = new SinhVien[n];
		
		
        for(int i=0; i<n; i++){
        	System.out.println("Sinh viên thứ: " + i);
            a[i] = new SinhVien();
            a[i].Nhap();
        }
        
        for (int i=0; i<n; i++){
            System.out.println(a[i].toString());
        }
        System.out.println("Sinh viên có điểm TB cao nhất:");
        double max = a[0].DiemTrungBinh();
		for(int i = 0 ;i<n;i++) {
			if(a[i].DiemTrungBinh() > max) {
				max = a[i].DiemTrungBinh();
			}
						
		}
		
		for(int i = 0 ;i<n;i++) {			
			
			if (max == a[i].DiemTrungBinh()){
                System.out.println(a[i].toString());
                System.out.println("Điểm Tb: " + a[i].DiemTrungBinh());
            }
		}
	}

}

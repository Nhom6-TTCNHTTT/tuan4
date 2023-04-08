package Bai3_5;

import java.util.Scanner;

public class DiaChi {
	private String Duong;
	private String Quan;
	private String ThanhPho;
	private long MaVung;
	
	
	public DiaChi() {
		super();
	}


	public DiaChi(String duong, String quan, String thanhPho, long maVung) {
		super();
		Duong = duong;
		Quan = quan;
		ThanhPho = thanhPho;
		MaVung = maVung;
	}


	
	public String getDuong() {
		return Duong;
	}


	public void setDuong(String duong) {
		Duong = duong;
	}


	public String getQuan() {
		return Quan;
	}


	public void setQuan(String quan) {
		Quan = quan;
	}


	public String getThanhPho() {
		return ThanhPho;
	}


	public void setThanhPho(String thanhPho) {
		ThanhPho = thanhPho;
	}


	public long getMaVung() {
		return MaVung;
	}


	public void setMaVung(long maVung) {
		MaVung = maVung;
	}
	
	public void NhapDiaChi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duong: ");
        Duong = scanner.nextLine();
        System.out.println("Nhap quan: ");
        Quan = scanner.nextLine();
        System.out.println("Nhap thanh pho: ");
        ThanhPho = scanner.nextLine();
        System.out.println("Nhap ma vung: ");
        MaVung = scanner.nextLong();
    }


	@Override
	public String toString() {
		return "DiaChi [Duong=" + Duong + ", Quan=" + Quan + ", ThanhPho=" + ThanhPho + ", MaVung=" + MaVung + "]";
	}
	
	
	
}

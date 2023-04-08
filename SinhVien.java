package tuan4;

import java.util.Scanner;

public class SinhVien implements ChuyenNganh {
	private String Ho;
	private String Ten;
	private DiaChi DiaChiNha = new DiaChi();
	private DiaChi DiaChiTruong = new DiaChi();
	private double Diem01;
	private double Diem02;
	private double Diem03;
	private String TenCN;
	

	
	@Override
	public String toString() {
		return "SinhVien [Ho=" + Ho + ", Ten=" + Ten + ", DiaChiNha=" + DiaChiNha + ", DiaChiTruong=" + DiaChiTruong
				+ ", Diem01=" + Diem01 + ", Diem02=" + Diem02 + ", Diem03=" + Diem03 + ", TenCN=" + TenCN + "]";
	}

	public String getHo() {
		return Ho;
	}

	public void setHo(String ho) {
		Ho = ho;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public DiaChi getDiaChiNha() {
		return DiaChiNha;
	}

	public void setDiaChiNha(DiaChi diaChiNha) {
		DiaChiNha = diaChiNha;
	}

	public DiaChi getDiaChiTruong() {
		return DiaChiTruong;
	}

	public void setDiaChiTruong(DiaChi diaChiTruong) {
		DiaChiTruong = diaChiTruong;
	}

	public String getTenCN() {
		return TenCN;
	}

	public void setTenCN(String tenCN) {
		TenCN = tenCN;
	}

	public double getDiem01() {
		return Diem01;
	}

	public void setDiem01(double diem01) {
		Diem01 = diem01;
	}

	public double getDiem02() {
		return Diem02;
	}

	public void setDiem02(double diem02) {
		Diem02 = diem02;
	}

	public double getDiem03() {
		return Diem03;
	}

	public void setDiem03(double diem03) {
		Diem03 = diem03;
	}
	
	public void setCotDiem(Integer LoaiDiem, double diem ) {
	 	if (LoaiDiem == 1){
            Diem01 = diem;
        } else if (LoaiDiem == 2) {
            Diem02 = diem;
        } else if (LoaiDiem == 3){
            Diem03 = diem;
        }
	}
	 public Double getCotDiem(Integer loaiDiem){
        if (loaiDiem == 1){
            return Diem01;
        } else if (loaiDiem == 2){
            return Diem02;
        } else if (loaiDiem == 3) {
            return Diem03;
        }else 
        	return -1d;

	}
	public double DiemTrungBinh() {
		double DiemTB;
		return DiemTB = (Diem01 + Diem02 + Diem03)/3;
	}

	@Override
	public void setChuyenNganh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getChuyenNganh() {
		// TODO Auto-generated method stub
		System.out.println(TenCN);
	}
	
	public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ: ");
        Ho = scanner.nextLine();
        System.out.println("Nhập tên: ");
        Ten = scanner.nextLine();
        System.out.println("Nhập địa chỉ nhà: ");
        DiaChiNha.NhapDiaChi();
        System.out.println("Nhập địa chỉ trường: ");
        DiaChiTruong.NhapDiaChi();
        System.out.println("Nhập điểm 1: ");
        Diem01 = scanner.nextDouble();
        System.out.println("Nhập điểm 2: ");
        Diem02 = scanner.nextDouble();
        System.out.println("Nhập điểm 3: ");
        Diem03 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập Tên chuyên ngành: ");
        TenCN = scanner.nextLine();
    }
}

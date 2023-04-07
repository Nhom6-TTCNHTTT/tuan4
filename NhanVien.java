/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author HELLO
 */
class NhanVien {
    private String maNV;
    private int soSP;
    private final int LUONG_CO_BAN = 20000;
    private final int LUONG_VUOT_CHUAN = 30000;
    private final int CHUAN = 500;

    public NhanVien() {}

    public NhanVien(String ma, int sp) {
        setMaNV(ma);
        setSoSP(sp);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String ma) {
        this.maNV = ma;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int sp) {
        if (sp > 0) {
            this.soSP = sp;
        }
    }

    public boolean coVuotChuan() {
        return soSP > CHUAN;
    }

    public String getTongKet() {
        return coVuotChuan() ? "vuot" : "";
    }

    public double getLuong() {
        int luong = soSP * LUONG_CO_BAN;
        if (coVuotChuan()) {
            luong += (soSP - CHUAN) * (LUONG_VUOT_CHUAN - LUONG_CO_BAN);
        }
        return luong;
    }

    public static void xuatTieuDe() {
        System.out.println("Mã nhân viên\tSố sản phẩm\tLương\tTổng kết");
    }

    public String toString() {
        return maNV + "\t\t" + soSP + "\t\t" + getLuong() + "\t\t" + getTongKet();
    }
}

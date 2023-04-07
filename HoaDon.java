package tuan4;

import java.util.Scanner;

public class HoaDon {
    private String soHD,ngayHD;
    private int soMatHang;
    private float T=0;
    private KhachHang kh= new KhachHang();
    private Hang dsHang[];
    private float tongTienHang=0;
    Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.print("\nNhập số hóa đơn: ");
        soHD=sc.nextLine();
        System.out.print("Nhập ngày lập hóa đơn: ");
        ngayHD=sc.nextLine();
        System.out.print("\nNHẬP THÔNG TIN KHÁCH HÀNG:");
        kh.nhap();
        System.out.print("Nhập số mặt hàng: ");
        do{
            soMatHang=sc.nextInt();
            if(soMatHang<=0){
                System.out.print("\nSố lượng hàng không thỏa mãn, nhập lại: ");
            }
        }while(soMatHang<=0);
        dsHang=new Hang[soMatHang];
        System.out.println("\nNHẬP THÔNG TIN CÁC MẶT HÀNG:");
        for(int i=0;i<soMatHang;i++){
            dsHang[i]=new Hang();
            dsHang[i].nhap();
            System.out.print("\n");
        }
        for(int i=0;i<soMatHang;i++){
            tongTienHang+=dsHang[i].tinhTongTien();
            T+=dsHang[i].getSoLuong();
        }
        System.out.println("==============================================================");
    }
    public void inHD(){
        System.out.print("Số hóa đơn: "+ soHD);
        System.out.println("\tNgày lập: "+ngayHD);
        System.out.println(kh.toString());
        Hang.inTieuDe();
        System.out.println("Tên hàng"+"\tĐơn giá"+"\t"+"\tSố lượng"+"\tThành tiền");
        for(int i=0;i<soMatHang;i++){
            dsHang[i].inDL();
            System.out.print("\n");
        }
        System.out.println("\n"+"Tổng tiền: "+"\t\t\t"+T+"\t\t"+tongTienHang);
    }
        public void sapXep(){
            for(int i=0;i<soMatHang;i++){
                for(int j=i+1;j<soMatHang;j++){
                    if(dsHang[i].getTenHang()==dsHang[j].getTenHang()){
                        if(dsHang[i].tinhTongTien()>dsHang[j].tinhTongTien()){
                            Hang tg=dsHang[i];
                            dsHang[i]=dsHang[j];
                            dsHang[j]=tg;
                        }
                    }
                    else if(dsHang[i].getTenHang().compareTo(dsHang[j].getTenHang())>0){
                        Hang tg=dsHang[i];
                        dsHang[i]=dsHang[j];
                        dsHang[j]=tg;
                    }
                }
                
        }
            System.out.print("\n================THÔNG TIN CÁC MẶT HÀNG SAU KHI SẮP XẾP================\n");
            inHD();
    }
}

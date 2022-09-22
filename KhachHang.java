package baitapkhachhangtiendien;

import java.util.Scanner;

public class KhachHang {
    // khai bao bien chua thong tin co ban cua mot khach hang
    protected int MaKH,SoLuong;
    protected double DonGia,ThanhTien;
    protected String NgayHHD,HoTenKH;
    Scanner sc =new Scanner(System.in);

    // tao constructor khong tham so va day du tham so
    public KhachHang() {

    }

    public KhachHang(int maKH, int SoLuong, double donGia, double thanhTien, String NgayHHD, String hoTenKH) {
        this.MaKH = MaKH;
        SoLuong = SoLuong;
        DonGia = donGia;
        ThanhTien = thanhTien;
        NgayHHD = NgayHHD;
        HoTenKH = hoTenKH;
    }

    // tao phuong thuc get set

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        this.MaKH = MaKH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        ThanhTien = ThanhTien;
    }

    public String getNgayHHD() {
        return NgayHHD;
    }

    public void setNgayHHD(String NgayHHD) {
        NgayHHD = NgayHHD;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
        HoTenKH = HoTenKH;
    }

}

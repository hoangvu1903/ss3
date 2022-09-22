package baitapkhachhangtiendien;

public class KhachHangNuocNgoai extends KhachHang{
    // khai bao bien chua thong tin rieng cua khach hang nuoc ngoia
    private String QuocTich;
    // tao constructor day du tham so va khong tham so

    public KhachHangNuocNgoai() {

    }
    public KhachHangNuocNgoai(String QuocTich, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien,NgayHHD,HoTenKH);
        this.QuocTich =QuocTich;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }
    // tao ham tinh tien
    public double TTien() {
        return this.SoLuong * this.DonGia;
    }

}

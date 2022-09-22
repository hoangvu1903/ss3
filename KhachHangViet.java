package baitapkhachhangtiendien;

public class KhachHangViet extends KhachHang {
    private int LoaiKH,DinhMuc;
    // tao constructor
    public KhachHangViet() {

    }
    public KhachHangViet(int LoaiKH, int DinhMuc, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHHD, HoTenKH);
        this.LoaiKH = LoaiKH;
        this.DinhMuc = DinhMuc;
    }

    public int getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(int loaiKH) {
        LoaiKH = loaiKH;
    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        DinhMuc = dinhMuc;
    }
    // tao ham tinh tien
    public double TTien() {
        if (SoLuong <= DinhMuc){
            return this.DonGia * this.SoLuong;
        }else {
            return this.DinhMuc*this.DonGia + (this.SoLuong - this.DinhMuc)*this.DonGia*2.5;
        }
    }

}


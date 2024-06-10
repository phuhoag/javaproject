package edu.pxu.baiquatrinh;

public abstract class DauSi extends NhanVat implements TanCong, DiChuyen {
    private String loaikhien;
    private int capdo;

    public DauSi(String loaikhien, int capdo, String ten, String gioitinh, String id) {
        super(ten, gioitinh, id);
        this.loaikhien = loaikhien;
        this.capdo = capdo;
    }

    public String getLoaikhien() {
        return loaikhien;
    }

    public void setLoaikhien(String loaikhien) {
        this.loaikhien = loaikhien;
    }

    public int getCapdo() {
        return capdo;
    }

    public void setCapdo(int capdo) {
        this.capdo = capdo;
    }

    @Override
    public void sucmanh() {
        System.out.println("bo la trau nhat");
    }

    @Override
    public void hanhdong() {
        System.out.println("nem khien chet no");
    }

    @Override
    public String toString() {
        return "DauSi{" + "loaikhien=" + loaikhien + ", capdo=" + capdo + '}';
    }
    
    
}

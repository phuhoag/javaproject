package edu.pxu.baiquatrinh;

public abstract class KiemKhach extends NhanVat implements TanCong, DiChuyen {
    private String loaikiem;
    private int capdo;

    public KiemKhach(String loaikiem, int capdo, String ten, String gioitinh, String id) {
        super(ten, gioitinh, id);
        this.loaikiem = loaikiem;
        this.capdo = capdo;
    }

    public String getLoaikiem() {
        return loaikiem;
    }

    public void setLoaikiem(String loaikiem) {
        this.loaikiem = loaikiem;
    }

    public int getCapdo() {
        return capdo;
    }

    public void setCapdo(int capdo) {
        this.capdo = capdo;
    }

    @Override
    public void sucmanh() {
        System.out.println("suc manh vo han");
    }

    @Override
    public void hanhdong() {
        System.out.println("lay kiem chem no");
    }

    @Override
    public String toString() {
        return "KiemKhach{" + "loaikiem=" + loaikiem + ", capdo=" + capdo + '}';
    }
    
    
    
}
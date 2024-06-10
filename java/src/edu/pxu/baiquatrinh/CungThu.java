package edu.pxu.baiquatrinh;

public abstract class CungThu extends NhanVat implements TanCong, DiChuyen {
    private String loaicungten;
    private int capdo;

    public CungThu(String loaicungten, int capdo, String ten, String gioitinh, String id) {
        super(ten, gioitinh, id);
        this.loaicungten = loaicungten;
        this.capdo = capdo;
    }

    public String getLoaicungten() {
        return loaicungten;
    }

    public void setLoaicungten(String loaicungten) {
        this.loaicungten = loaicungten;
    }

    public int getCapdo() {
        return capdo;
    }

    public void setCapdo(int capdo) {
        this.capdo = capdo;  
    }

    @Override
    public void sucmanh() {
        System.out.println("cam cung nem");
    }

    @Override
    public void hanhdong() {
        System.out.println("ba do day ma hup");
    }
    
    

    @Override
    public String toString() {
        return "CungThu{" + "loaicungten=" + loaicungten + ", capdo=" + capdo + '}';
    }
    
    
}
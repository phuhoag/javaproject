package edu.pxu.baiquatrinh;

public abstract class Ninja extends NhanVat implements DiChuyen, TanCong {
    private String toche;
    private int capdo;

    public Ninja(String toche, int capdo, String ten, String gioitinh, String id) {
        super(ten, gioitinh, id);
        this.toche = toche;
        this.capdo = capdo;
    }

    public String getToche() {
        return toche;
    }

    public void setToche(String toche) {
        this.toche = toche;
    }

    public int getCapdo() {
        return capdo;
    }

    public void setCapdo(int capdo) {
        this.capdo = capdo;
    }

    @Override
    public void sucmanh() {
        System.out.println("do anh bat duoc em");
    }

    @Override
    public void hanhdong() {
        System.out.println("choi cuc da chet no");
    }

    @Override
    public String toString() {
        return "Ninja{" + "toche=" + toche + ", capdo=" + capdo + '}';
    }
    
    
}

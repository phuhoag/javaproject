package edu.pxu.baiquatrinh;

public class NhanVat {

	
	private String ten;
    private String gioitinh;
    private String id;

    public NhanVat(String ten, String gioitinh, String id) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void hanhdong(){
        System.out.println("okokok");
    }
    public void sucmanh (){
        System.out.println("okokoko");
    }

    @Override
    public String toString() {
        return "NhanVat{" + "ten=" + ten + ", gioitinh=" + gioitinh + ", id=" + id + '}';
    }
    
}

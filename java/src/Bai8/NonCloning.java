package Bai8;

import Bai8.vidu1.SanPham;

public class NonCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SanPham sp1 = new SanPham(12, "Xiaomi");
		System.out.println(sp1);
		//Thuc hien phep gan
		SanPham sp2 = sp1;
		sp2.setTenSanPham("Nokia");
		//Xuat gia tri
		System.out.println(sp1);
		System.out.println(sp2);
	}

}

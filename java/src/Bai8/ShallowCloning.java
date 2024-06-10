package Bai8;

import Bai8.vidu1.SanPham;

public class ShallowCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SanPham sp1 = new SanPham(12, "Xiomi");
		System.out.println(sp1);
		// thuc hien phep gan
		SanPham sp2 = sp1;
		sp2.setTenSanPham("Nokia");
		System.out.println(sp1);
		System.out.println(sp2);
	}

}

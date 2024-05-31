package Bai06;

import Bai6vidu1.HinhChuNhat;
import Bai6vidu1.HinhTron;

public class SuDungHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("khong su dung arrlist");
		HinhTron o1 = new HinhTron(3);
		HinhTron o2 = new HinhTron(4);
		HinhChuNhat n1 = new HinhChuNhat(4, 3);
		HinhChuNhat n2 = new HinhChuNhat(5, 2);
		System.out.println("Dien tich cua hinh tron o1 la: " + o1.tinhDienTich());
		System.out.println("Dien tich cua hinh chu nhat n2 la: " + n2.tinhDienTich());
		// Cach hay hon
		System.out.println("Dung 2 arraylist");
		
	}

}

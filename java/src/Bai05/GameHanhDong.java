package Bai05;

import Bai05vidu.KyBinh;

public class GameHanhDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyBinh  kb = new KyBinh("Phuoc", "IT2005", (byte) 1, 10, true, false, false, false);
		System.out.println(kb);
		kb.hanhdong();
		kb.sucmanh();
	}

}

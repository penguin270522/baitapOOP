package student;

import java.util.ArrayList;

public class DanhSachNhanVien {
	private ArrayList<NhanVien> nhanvien; 
	
	public DanhSachNhanVien() {
		this.nhanvien = new ArrayList<NhanVien>();
	}
	
	public DanhSachNhanVien(ArrayList<NhanVien> nhanvien) {
		this.nhanvien = nhanvien;
	}
	
	public void addNhanVien(NhanVien nv) {
		this.nhanvien.add(nv);
	}
	public void xuatNV() {
		for (NhanVien nhanVien2 : nhanvien) {
			System.out.println(nhanVien2);
		}
	}
	public void timNVName(String name) {
		for (NhanVien nhanVien2 : nhanvien) {
			if(nhanVien2.getFullName().indexOf(name)>=0 ) {
				System.out.println(nhanVien2);
			}
		}
	}
	public boolean kiemtraID(NhanVien nv) {
		return this.nhanvien.contains(nv);
	}
	public boolean xoaNVID(NhanVien nv) {
		return this.nhanvien.remove(nv);
	}
}

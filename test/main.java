package test;

import java.util.Scanner;

import student.DanhSachNhanVien;
import student.NhanVien;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		DanhSachNhanVien dsnv = new DanhSachNhanVien(); 
		do {
			System.out.println("---------------");
			System.out.println("1.add sinhvien");
			System.out.println("2.hien danh sach sv");
			System.out.println("3.tim nhan vien theo ten");
			System.out.println("4.xoa nhan vien theo ten");
			System.out.println("0.exit");
			 a = input.nextInt();input.nextLine();
			switch (a) {
			case 1:
				System.out.println("nhap ma sinh vien: "); 
				String id = input.nextLine();
				System.out.println("nhap full name: "); 
				String fullName = input.nextLine(); 
				System.out.println("nhap dia chi: "); 
				String addRess = input.nextLine();
				System.out.println("nhap so dien thoai: "); 
				int numberPhone = input.nextInt();
				System.out.println("nhap luong: "); 
				float luong = input.nextFloat();
				System.out.println("nhap so nam kinh nghiem: "); 
				float kn = input.nextFloat();
				NhanVien nv = new NhanVien(id, fullName, addRess, numberPhone, luong, kn);
				dsnv.addNhanVien(nv);
				break;
			case 2:
				dsnv.xuatNV();
				break;
			case 3:
				System.out.println("nhap ten nhanvien ban muon tim: "); 
				String name = input.nextLine(); 	
				System.out.println("ket qua tim thay: ");
				dsnv.timNVName(name); 
				break;
			case 4: 
				System.out.println("nhap ma nv ban muon xoa: ");
				String idd = input.nextLine();
				NhanVien nv1 = new NhanVien();
				System.out.println("xoa nhan vien trong danh sach " + dsnv.xoaNVID(nv1));
				break;
			case 0: 
				System.out.println("Exit");
				break;
			default:
				break;
			}
		}while(a != 0);
	}
}

package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		System.out.print("Mời bạn nhập mã nhân viên : ");
		int ma1 = new Scanner(System.in).nextInt();
		System.out.print("Mời bạn nhập tên nhân viên : ");
		String ten1 = new Scanner(System.in).nextLine();
		System.out.print("Mời bạn nhập số SP của nhân viên : ");
		int soSP1 = new Scanner(System.in).nextInt();
		NhanVien nv1 = new NhanVien(ma1, ten1, soSP1);
		System.out.println("Lương của nhân viên 1 là : " + nv1.getLuong());
		
		System.out.print("Mời bạn nhập mã nhân viên : ");
		int ma2 = new Scanner(System.in).nextInt();
		System.out.print("Mời bạn nhập tên nhân viên : ");
		String ten2= new Scanner(System.in).nextLine();
		System.out.print("Mời bạn nhập số SP của nhân viên : ");
		int soSP2 = new Scanner(System.in).nextInt();
		NhanVien nv2 = new NhanVien(ma2, ten2, soSP2);
		System.out.println("Lương của nhân viên là 2 : " + nv2.getLuong());
		
		if (nv1.lonHon(nv2))
		{
			System.out.println("Nhân viên {" + nv1.getTen() + "} có nhiều số SP hơn");
			System.out.println("Cụ thể : "  + (nv1.getSoSP() - nv2.getSoSP()) + " sản phẩm");
		}
		
		if(nv1.getSoSP()>nv2.getSoSP())
		{
			System.out.println("Nhân viên {" + nv1.getTen() + "} có nhiều số SP hơn");
			System.out.println("Cụ thể : "  + (nv1.getSoSP() - nv2.getSoSP()) + " sản phẩm");
		}
	}

}

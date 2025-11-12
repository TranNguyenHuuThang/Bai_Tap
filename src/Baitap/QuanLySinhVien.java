package Baitap;

public class QuanLySinhVien {
	private SinhVien[] danhSach;
	private int soLuong;
	
	public void taoDuLieuMau(){
		danhSach = new SinhVien[5];
		danhSach[0]= new SinhVien("Nguyen Ngoc Le Tan Loc", "2006", 5, 7, 9);
		danhSach[1] = new SinhVien("Doan Minh Dat", "2025", 4, 4, 4);
		danhSach[2] = new SinhVien("Tran Nguyen Huu Thang", "2000", 10, 10, 10);
		danhSach[3] = new SinhVien("Nguyen Minh Quoc", "2100", 9, 8, 10);
		danhSach[4] = new SinhVien("La Kim Ngoc", "9999", 8.5, 7.5, 8);
		soLuong = 5;
	}
	
	public void xuatDanhSach() {
		System.out.println("=====DANH SACH SINH VIEN=====");
		for (int i = 0; i < soLuong; i++) {
	        danhSach[i].xuatThongTin();
	    }
	}
	
	public void diemTBCaoNhat() {
		if(soLuong == 0) return;
		SinhVien max = danhSach[0];
		for (int i = 0; i < danhSach.length; i++) {
			if(danhSach[i].diemTB() > max.diemTB()) {
				max = danhSach[i];
			}
		}
		System.out.println("\n=====SINH VIEN CO DIEM TB CAO NHAT=====");
        max.xuatThongTin();
	}
	
	public void sinhVienYeu() {
		if(soLuong == 0) return;
		for (int i = 0; i < danhSach.length; i++) {
			String loai = danhSach[i].xepLoai();
			if(loai.equalsIgnoreCase("Yếu")) {
				danhSach[i].xuatThongTin();
			}
		}
	}
	
	public void timTheoTen(String ten) {
		for (int i = 0; i < danhSach.length; i++) {
			if(danhSach[i].getTen().equalsIgnoreCase(ten)) {
				danhSach[i].xuatThongTin();
			}
			else {
				System.out.println("Khong tim thay sinh vien co ten: " + ten);
			}
		}
	}
	
	public void timTheoMa(String ma) {
		for (int i = 0; i < danhSach.length; i++) {
			if(danhSach[i].getMaSV().equalsIgnoreCase(ma)) {
				danhSach[i].xuatThongTin();
			}
			else {
				System.out.println("Khong tim thay sinh vien co ma: " + ma);
			}
		}
	}
	
	public void xoaTheoMa(String ma) {
		for (int i = 0; i < danhSach.length; i++) {
			if(danhSach[i].getMaSV().equalsIgnoreCase(ma)) {
				for (int j = i; j < danhSach.length - 1; j++) {
					danhSach[j] = danhSach[j + 1];
				}
				danhSach[soLuong - 1] = null;
				soLuong--;
				System.out.println("Da xoa sinh vien co ma: " + ma);
				return;
			}
		}
		System.out.println("Khong tim thay sinh vien de xoa");
	}
	
	public static void main(String[] args) {
		QuanLySinhVien ql = new QuanLySinhVien();
		
		ql.taoDuLieuMau();
		ql.xuatDanhSach();
		ql.diemTBCaoNhat();
		ql.sinhVienYeu();
		ql.timTheoTen("Ngoc");
		ql.timTheoMa("9999");
		ql.xoaTheoMa("9999");
		
		System.out.println("=====DANH SACH SAU KHI XOA=====");
		ql.xuatDanhSach();
	}
}

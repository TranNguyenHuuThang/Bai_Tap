package Baitap;

public class SinhVien {
	private String ten;
	private String maSV;
	private double toan;
	private double ly;
	private double hoa;
	
	public SinhVien(String ten, String maSV, double toan, double ly, double hoa) {
		setTen(ten);
		if(maSV == null || maSV.isEmpty()) {
			throw new IllegalArgumentException("Ma sinh vien khong hop le");
		}
		this.maSV = maSV;
		setToan(toan);
		setLy(ly);
		setHoa(hoa);
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		if(ten == null || ten.isEmpty()) {
			throw new IllegalArgumentException("Ten khong duoc rong");
		}
		this.ten = ten;
	}
	
	public String getMaSV() {
		return maSV;
	}
	
	public double getToan() {
		return toan;
	}
	
	public void setToan(double toan) {
		if(toan < 0) {
			throw new IllegalArgumentException("Diem toan khong hop le");
		}
		this.toan = toan;
	}
	
	public double getLy() {
		return ly;
	}
	
	public void setLy(double ly) {
		if(ly < 0) {
			throw new IllegalArgumentException("Diem ly khong hop le");
		}
		this.ly = ly;
	}
	
	public double getHoa() {
		return hoa;
	}
	
	public void setHoa(double hoa) {
		if(hoa < 0) {
			throw new IllegalArgumentException("Diem hoa khong hop le");
		}
		this.hoa = hoa;
	}
	
	public double diemTB() {
		return (toan + ly + hoa) / 3;
	}
	
	public String xepLoai() {
		double dtb = diemTB();
		if(dtb >= 9) {
			return "Xuất sắc";
		}
		else if(dtb >= 8) {
			return "Giỏi";
		}
		else if(dtb >= 7) {
			return "Khá";
		}
		else if(dtb >= 6) {
			return "Trung Bình";
		}
		else {
			return "Yếu";
		}
	}
	
	public void xuatThongTin() {
		System.out.println("Ten: " + ten);
		System.out.println("Ma sinh vien: "  + maSV);
		System.out.println("Diem trung binh: " + diemTB());
		System.out.println("Xep loai: " + xepLoai());
	}
	
}

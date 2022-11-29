package student;

public class NhanVien {
	private String maNv;
	private String fullName;
	private String address;
	private int numberPhone;
	private float luong;
	private float soNamKN;
	
	
	public NhanVien() {
		
	}
	public NhanVien(String maNv, String fullName, String address, int numberPhone, float luong, float soNamKN) {
		this.maNv = maNv;
		this.fullName = fullName;
		this.address = address;
		this.numberPhone = numberPhone;
		this.luong = luong;
		this.soNamKN = soNamKN;
	}

	public String getMaNv() {
		return maNv;
	}

	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}

	public float getLuong() {
		return luong;
	}

	public void setLuong(float luong) {
		this.luong = luong;
	}

	public float getSoNamKN() {
		return soNamKN;
	}

	public void setSoNamKN(float soNamKN) {
		this.soNamKN = soNamKN;
	}

	@Override
	public String toString() {
		return "NhanVien [maNv=" + maNv + ", fullName=" + fullName + ", address=" + address + ", numberPhone="
				+ numberPhone + ", luong=" + luong + ", soNamKN=" + soNamKN + "]";
	}
	
	
	
	
}

package communityuni.com.model;

public class NhanVien {
	private int ma;
	private String ten;
	private int soSP;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public NhanVien(int ma, String ten, int soSP) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soSP = soSP;
		if(this.soSP<0)
			this.soSP=0;
	}
	public NhanVien() {
		super();
	}
	
	public double getLuong()
	{
		double luong = 0;
		if (this.soSP > 0 && this.soSP <200)
			luong = this.soSP * 0.5;
		else if(this.soSP >= 200 && this.soSP<400)
			luong = this.soSP * 0.55;
		else if(this.soSP >= 400 && this.soSP<600)
			luong = this.soSP * 0.6;
		else
			luong = this.soSP *0.65;
		return luong;
	}
	
	public boolean lonHon(NhanVien nv2)
	{
		return this.soSP>nv2.soSP;
	}

}

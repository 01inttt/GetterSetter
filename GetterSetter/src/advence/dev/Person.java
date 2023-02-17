package advence.dev;

public class Person {
	private String ten;
	private int tuoi;
	private String diaChi;
	public Person(String ten, int tuoi, String diaChi, String sDT, int diemTrungBinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.sDT = sDT;
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "Person [ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", sDT=" + sDT + ", diemTrungBinh="
				+ diemTrungBinh + ", getTen()=" + getTen() + ", getTuoi()=" + getTuoi() + ", getDiaChi()=" + getDiaChi()
				+ ", getsDT()=" + getsDT() + ", getDiemTrungBinh()=" + getDiemTrungBinh() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	private String sDT;
	private int diemTrungBinh;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		if(tuoi < 0) tuoi = 0;
		this.tuoi = tuoi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public int getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(int diemTrungBinh) {
		if(diemTrungBinh <= 0) diemTrungBinh = 0;
		this.diemTrungBinh = diemTrungBinh;
	}
	
}
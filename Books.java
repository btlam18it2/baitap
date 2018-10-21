package Books;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Books {
	String masach;
	String tensach;
	String namxb;
	String tacgia;
	String theloai;
	float soluong;
	float gia;


	public String getMasach() {
		return masach;
	}


	public void setMasach(String masach) {
		this.masach = masach;
	}


	public String getTensach() {
		return tensach;
	}


	public void setTensach(String tensach) {
		this.tensach = tensach;
	}


	public String getNamxb() {
		return namxb;
	}


	public void setNamxb(String namxb) {
		this.namxb = namxb;
	}


	public String getTacgia() {
		return tacgia;
	}


	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}


	public String getTheloai() {
		return theloai;
	}


	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}


	public float getSoluong() {
		return soluong;
	}


	public void setSoluong(float soluong) {
		this.soluong = soluong;
	}


	public float getGia() {
		return gia;
	}


	public void setGia(float gia) {
		this.gia = gia;
	}


	public Books(String tensach,String masach,String namxb, String tacgia,String theloai, float soluong, float gia) {
		this.tensach = tensach;
		this.masach = masach;
		this.namxb = namxb;
		this.tacgia = tacgia;
		this.theloai = theloai;
		this.soluong = soluong;
		this.gia = gia;
	}
}


package book;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class book {
	String Tensach;
	String Masach;
	String Namxb;
	String Nhaxuatban;
	String Theloai;
	String Tacgia;
	float Soluong;
	float Gia;
	
	public String getTensach() {
		return Tensach;
	}
	public void setTensach(String tensach) {
		Tensach = tensach;
	}
	public String getMasach() {
		return Masach;
	}
	public void setMasach(String masach) {
		Masach = masach;
	}
	public String getNamxb() {
		return Namxb;
	}
	public void setNamxb(String namxb) {
		Namxb = namxb;
	}
	public String getNhaxuatban() {
		return Nhaxuatban;
	}
	public void setNhaxuatban(String nhaxuatban) {
		Nhaxuatban = nhaxuatban;
	}
	public String getTheloai() {
		return Theloai;
	}
	public void setTheloai(String theloai) {
		Theloai = theloai;
	}
	public String getTacgia() {
		return Tacgia;
	}
	public void setTacgia(String tacgia) {
		Tacgia = tacgia;
	}
	public float getSoluong() {
		return Soluong;
	}
	public void setSoluong(float soluong) {
		Soluong = soluong;
	}
	public float getGia() {
		return Gia;
	}
	public void setGia(float gia) {
		Gia = gia;
	}
	
	public book (String Tensach, String Masach, String Nhaxuatban
			, String Theloai, String Tacgia, String namxb, float Soluong, float Gia )
	{
		this.Tensach = Tensach;
		this.Masach = Masach;
		this.Namxb = namxb;
		this.Nhaxuatban = Nhaxuatban;
		this.Theloai = Theloai;
		this.Tacgia = Tacgia;
		this.Soluong = Soluong;
		this.Gia = Gia ;
	}
	}

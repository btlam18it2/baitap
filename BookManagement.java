package Books;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class BookManagement {
	Vector list = new Vector();
	public BookManagement() {
		while(true) {
			System.out.println("Quan ly Sach");
			System.out.println("1. Nhap Sach");
			System.out.println("2. Xem Sach");
			System.out.println("3. Tim Sach");
			System.out.println("4. Thoat");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
				case 3: Timkiem();
				break;
				case 4:
						System.out.println("---Chuong trinh ket thuc---");
				return;
			}	
		}
	}
	
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong sach=");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ten sach: ");
			String tensach = key.nextLine();
			System.out.println("Nhap Ma sach: ");
			String masach = key.nextLine();
			System.out.println("Nam xuat ban");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namxb=key.nextLine();
			System.out.println("Nhap tac gia: ");
			String tacgia = key.nextLine();
			System.out.println("Nhap the loai: ");
			String theloai = key.nextLine();
			System.out.println("Nhap so luong ");
			float soluong=Float.parseFloat(key.nextLine());
			System.out.println("Nhap Gia: ");
			float gia=Float.parseFloat(key.nextLine());
			Books b = new Books (tensach,masach,namxb,tacgia,theloai,soluong,gia);
			list.add(b);
		}	
		
	}
	public void InTT() {
		Enumeration eBook = list.elements();
		int i=1;
		while(eBook.hasMoreElements()) {
			Books book = (Books)eBook.nextElement();
			System.out.println(" Ten Sach: ,"+book.getTensach()+"Ma Sach: ,"
			+book.getMasach()+"Nam XB: ,"+book.getNamxb()+"Tac Gia: ,"+book.getTacgia()+
			"The Loai: ,"+book.getTheloai()+"So Luong: ,"+book.getSoluong()+"Gia: ,"+book.getGia());
		}
	}
	public void Timkiem() 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap ten sach can tim:");
		String tenSach = key.nextLine();
		Enumeration eBook = list.elements();
		System.out.println("\n--Thong tin tim kiem duoc--");
		while (eBook.hasMoreElements())
		{
			Books book = (Books)eBook.nextElement();
			if (book.getTensach().indexOf(tenSach)!=-1)
			{
			System.out.println("Ten sach: "+book.getTensach()+"\nMasach: "+book.getMasach()+ "\nSo luong: "+book.getSoluong()+"\nNam xuat ban: "+book.getNamxb());
		}
		}
		System.out.println("\n------------\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new BookManagement();
			}
}

package Person;
import java.util.Scanner;
class Customer extends Person {
	protected String makh;
	protected String Ten;
	protected String email;
	public void KhachHang(){
			Scanner kh = new Scanner(System.in);
		System.out.println("Nhap ma khach hang");
		this.makh = kh.nextLine();
		System.out.println("Nhap Ten");
		this.Ten = kh.nextLine();
		System.out.println("Nhap email");
		this.email = kh.nextLine();
	}
	public void showCustomer(){
		System.out.println("Ma khach hang : " +this.makh +" Ten " + this.Ten);
	}
}
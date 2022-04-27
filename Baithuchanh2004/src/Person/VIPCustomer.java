package Person;
import java.util.Scanner;
class VIPCustomer extends Person{
	protected String makh;
	protected String Ten;
	public void KhachHangVIP(){
			Scanner kh = new Scanner(System.in);
		System.out.println("Nhap ma khach hang");
		this.makh = kh.nextLine();
		System.out.println("Nhap Ten");
		this.Ten = kh.nextLine();
	}
	public void showCustomer(){
		System.out.println("Ma khach hang : " +this.makh +" Ten " + this.Ten);
	}
}
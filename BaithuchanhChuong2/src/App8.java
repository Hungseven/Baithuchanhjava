import java.util.Scanner;

public class App8 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n;
        float a,tong=0, tbc=0;
        System.out.print("Nhap so phan tu = ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("Nhap so thu " +i+ " = ");
            a =sc.nextFloat();    
            tong+=a;    
        }
        tbc=tong/n; 
        System.out.print("Trung binh cong cua day so = " +tbc);
        sc.close();
    }
}
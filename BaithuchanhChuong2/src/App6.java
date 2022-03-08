import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n,giaiThua=1;
        do{
            System.out.print("Moi ban nhap so bat ki : ");
            n=sc.nextInt();
        }while(n<0);
        for(int i=1 ; i<=n ; i++){
            giaiThua=giaiThua*i;
        }
        System.out.print("Giai thua cua "+n+ " = " +giaiThua);
        sc.close();
    }
}
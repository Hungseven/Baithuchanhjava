import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap vao so bat ky: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print(+n+ " la so chan");
        }else{
            System.out.print(+n+ " la so le");
        }
        sc.close();
    }
}
import java.util.Scanner;
 

public class App6
 {
    private static Scanner scanner = new Scanner(System.in);
     
    
public static void main(String[] args) {
    System.out.print("Nhập n = ");
    int n = scanner.nextInt();
    System.out.printf("Tất cả các số hoàn hảo nhỏ hơn %d là: \n", n);
    if (n >= 2) {
        System.out.print(2);
    }
    for (int i = 3; i < n; i+=2) {
        if (SoNguyen(i)) {
            System.out.print(" " + i);
        }
    }

public static boolean SoNguyen(int n) {
        
    if (n < 2) {
        return true;
    }
    int squareRoot = (int) Math.sqrt(n);
    for(int i=1;i<=a/2;i++){
        if(a%i==0) 
          
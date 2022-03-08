import java.util.Scanner;
public class App12 {
    public static void main(String[] args) throws Exception {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thưoc ma tran: ");
        n= sc.nextInt();
        m= sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Nhap phan tu ma tran: ");
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){

            System.out.println("a["+i+"]["+j+"]= ");
            a[i][j] = sc.nextInt();
          }
        }
        int max=0;
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(a[i][j]>max)
                max=a[i][j];
          }
        }
        System.out.print("Phan tu lon nhat trong ma tran 2 chieu: "+max);
    }
}
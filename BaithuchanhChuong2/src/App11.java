import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n,i,tam=0;
        do{
            System.out.print("Nhap so phan tu cho mang: ");
            n = sc.nextInt();
        }while(n<0);
        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for(i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+i+ " : ");
            A[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau: ");
        for(i=0; i<n; i++){
        System.out.print("\t" +A[i]+ " ");
        }
        
        for(i=0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(A[i]<A[j]){
                    tam = A[i];
                    A[i] = A[j];
                    A[j] = tam;
                }
            }
        }

        System.out.println("\nMang sau khi sap xep la: ");
        for(i = 0; i<n;i++){
            System.out.print("\t" +A[i]+ " ");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String chuoi = new String("");
        char kyTu;
        int dem=0;
        do{
            System.out.print("Nhap chuoi: ");
            chuoi = sc.nextLine();
        }while(chuoi.length()>80);
        System.out.print("Nhap vao mot ky tu bat ky: ");
        kyTu = sc.next().charAt(0);
        for(int i=0;i< chuoi.length();i++){
            if(kyTu == chuoi.charAt(i)){
                dem++;
            }
        }
        System.out.print("So lan xuat hien ky tu \"" +kyTu+ "\" trong chuoi \"" +chuoi+ "\" = " +dem);
        sc.close();
    }
}
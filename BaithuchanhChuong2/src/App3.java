import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String ten= new String("");
        int namSinh, tuoi=0, namHienTai=2022;
        System.out.print("Nhap ten : ");
        ten = sc.nextLine();
        System.out.print("Nhap nam sinh : ");
        namSinh =sc.nextInt();
        tuoi=namHienTai - namSinh;
        if(tuoi<16){
            System.out.println("Ban "+ten+ " o do tuoi vi thanh nien");
        }else{
            if(tuoi>=16 && tuoi<18){
                System.out.println("Ban "+ten+ " o do tuoi truong thanh");
            }else{
                System.out.println("Ban "+ten+ " da gia");
            }
        }
        sc.close();
    }
}
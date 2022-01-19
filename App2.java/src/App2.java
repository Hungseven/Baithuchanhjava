import java.util.Scanner;
public class App2 {
  public static void main(String[] args) throws Exception {
    double hesoA1,hesoB1,hesoC1,hesoA2,hesoB2,hesoC2,dd,dx,dy;
    System.out.println("Nhap A1");
    Scanner mc = new Scanner(System.in);
    hesoA1 = mc.nextDouble();
    System.out.println("Nhap B1");
    hesoB1 = mc.nextDouble();
    System.out.println("Nhap C1");
    hesoC1 = mc.nextDouble();
    System.out.println("Nhap A2");
    hesoA2 = mc.nextDouble();
    System.out.println("Nhap B2");
    hesoB2 = mc.nextDouble();
    System.out.println("Nhap C2");
    hesoC2 =mc.nextDouble();
    dd=hesoA1*hesoB2-hesoB1*hesoA2; dx=hesoC1*hesoB2-hesoB1*hesoC2; dy=hesoA1*hesoC2-hesoA2*hesoC1;
    if(dd==0)
      if(dx==0 && dy==0){
        System.out.println("phuong trinh vo so nghiem");
      }
      else System.out.println("phuong trinh vo nghiem");
    else
      System.out.println("phuong trinh co nghiem duy nhat" + " x=" + (dx/dd) + " va y= " +(dy/dd));
  }
}
importjava.until.Scanner;//Sử dụng lớp Scanner​

để đọc dữ liệu từ bàn phím​

public class SwitchDemo {​

public static void main(String agre[]) {​

Scanner scan=newScanner (system.in);​

int ngay=scan.nextInt();//Đọc vào một số​

nguyên​

switch(ngay){​

Case 0:system.out.println(“Chu nhat”);​

        break;​
        ase 1:system.out.println(“Thu hai”);​

        break;​

Case 2:system.out.println(“Thu ba”);​

        break;​

Case 3:system.out.println(“Thu tu”);​

        break;​

Case 4:system.out.println(“Thu nam”);​

        break;​

Case 5:system.out.println(“Thu sau”);​

        break;​

Case 6:system.out.println(“Thu bay”);​

        break;​

default:system.out.println(“So ngay trong tuan sai”);​

}}}​

​
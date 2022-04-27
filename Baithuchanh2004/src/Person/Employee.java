package Person;
class Employee extends Person{
    private double salary;
     private double rate;
     public void CongViec() {
     }
     public Employee(String name, int age, String address, double salary, double rate) {
    
         this.salary = salary;
         this.rate = rate;
     }
     public double totalSalary(){
         return salary*rate;
     }
     public void hienThiThongTin() {
         System.out.println("\tTong luong: " + totalSalary());
     }
 }
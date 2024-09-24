import java.util.Scanner;

public class EmployeeScanner {

    private String name;
    private int hoursWorked;
    private double grossPay;
    private double hourlyRate;



    public EmployeeScanner(String name, int hoursWorked, double hourlyRate){
    this.name=name;
    this.hoursWorked=hoursWorked;
    this.hourlyRate=hourlyRate;


    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked=hoursWorked;
    }

    public int getHoursWorked(){
        return hoursWorked;

    }

    public double calculateGrossPay(){
    grossPay=hoursWorked * hourlyRate;
    return grossPay;

    }

    public double calculateNetPay(){
        double netPay = 0;
        if( grossPay>=3000){
            netPay=(grossPay-(0.3*grossPay));
        }
        else if(grossPay>=2000 && grossPay<=2999){
            netPay=(grossPay-(0.2*grossPay));
        }
        else if(grossPay>=1000 && grossPay<=1999){
            netPay=(grossPay-(0.1*grossPay));
        }

        else{
           netPay=grossPay;
        }
        return netPay;
    }
    

        public static void main(String[]args){
            Employee[]emp=new Employee[5];

            Scanner scanner = new Scanner(System.in); // scanner for user input


            for (int i=0; i<emp.length; i++){
            System.out.println("Enter detail employee" +(i+1) + ":");
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter you hours Worked: ");
            int hoursWorked = scanner.nextInt();
            System.out.println("Enter hourly Rate: ");
            double hourlyRate = scanner.nextInt();

            scanner.nextLine();//consume new line
            emp[i] = new Employee(name, hoursWorked, hourlyRate);
           
             } 

            /*emp[0] = new Employee("Dina", 160, 50); // 160 hours at $50 per hour
            emp[1] = new Employee("Ali", 150, 40);
            emp[2] = new Employee("Sara", 170, 60);
            emp[3] = new Employee("John", 140, 30);
            emp[4] = new Employee("Anna", 180, 55);*/

        // Loop through the array of employees
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Employee: " + emp[i].getName());
            System.out.println("Gross Pay: " + emp[i].calculateGrossPay());
            System.out.println("Net Pay: " + emp[i].calculateNetPay());
            System.out.println("-------------------");
        }
    }
}


    


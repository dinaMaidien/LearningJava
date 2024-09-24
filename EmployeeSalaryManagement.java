public class EmployeeSalaryManagement{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;


    //consturctor
    public EmployeeSalaryManagement(String name, double baseSalary, double transportAllowance, double healthAllowance){
         this.name=name;
         this.baseSalary=baseSalary;
         this.healthAllowance=healthAllowance;
         this.transportAllowance=transportAllowance;
         this.bonus=0;
    }

    public void setName(String name){    //setter for name
        this.name=name;
    }

    public String getName(){            //getter for name
        return name;
    }

    public void setBaseSalary(double baseSalary){  //setter foe base salary
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary(){    // getter for base salary
        return baseSalary;
    }

    public void setHealthAllowance(double healthAllowance){  //setter for health allowance
        this.healthAllowance=healthAllowance;
    }
    public double getHealthAllowance(){    // getter for health allowace
        return healthAllowance;
    }

    public void setTransportAllowance(double transportAllowance){  //setter for transport allowance
        this.transportAllowance=transportAllowance;
    }
    public double getTransportAllowance(){    // getter for transport allowace
        return transportAllowance;
    }
    
    public double TotalSalary(){
  
        totalSalary = (baseSalary+healthAllowance+transportAllowance+assignBonus());
        return totalSalary;
        }
    
    public double assignBonus(){
        //double bonus = 0;

        if (baseSalary>=50000){
            bonus = (baseSalary*0.1);
        }
        
        else if (baseSalary>=30000 && baseSalary<=50000){
            bonus = (baseSalary*0.5);
        }

        else{
            bonus = 0;
        }

        return bonus;
    }
    public void displayEmployeeOutput() {
        System.out.println("Employee Name: " + name);
        System.out.println("Bonus: " + assignBonus());
        System.out.println("Health Allowance: " + healthAllowance);
        System.out.println("Transport Allowance: " + transportAllowance);
        System.out.println("Total: " + TotalSalary());

        System.out.println();
    }
    public static void main (String[]args){
    EmployeeSalaryManagement[]emp=new EmployeeSalaryManagement[5];

    emp[0]=new EmployeeSalaryManagement("Dina", 80000,100,150);
    emp[1]=new EmployeeSalaryManagement("Diya", 10500, 150,200);
    emp[2]=new EmployeeSalaryManagement("Dinie", 90000,150,200);
    emp[3]=new EmployeeSalaryManagement("Dian", 170000,150,200);
    emp[4]=new EmployeeSalaryManagement("Diana", 90000,500,200);


    for (EmployeeSalaryManagement e: emp){
        e.displayEmployeeOutput();
    }

    }
}
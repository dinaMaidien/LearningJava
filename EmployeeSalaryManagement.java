public class EmployeeSalaryManagement{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;


    //consturctor
    public EmployeeSalaryManagement(String name, double baseSalary, double transportAllowance, double healthAllowance, double bonus){
         this.name=name;
         this.baseSalary=baseSalary;
         healthAllowance=0;
         transportAllowance=0;
         bonus=0;
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
  
        totalSalary = (baseSalary+healthAllowance+transportAllowance+bonus);
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
        System.out.println("Bonus: " + bonus);

        System.out.println();
    }
    public static void main (String[]args){
    EmployeeSalaryManagement[]emp=new EmployeeSalaryManagement[5];

    emp[0]=new EmployeeSalaryManagement("Dina", 8000,100,150, 100);
    emp[1]=new EmployeeSalaryManagement("Diya", 1500, 150,200, 150);
    emp[2]=new EmployeeSalaryManagement("Dinie", 9000,150,200,100);
    emp[3]=new EmployeeSalaryManagement("Dian", 17000,150,200,100);
    emp[4]=new EmployeeSalaryManagement("Diana", 9000,500,200,100);


    for (EmployeeSalaryManagement e: emp){
        e.displayEmployeeOutput();
    }

    }
}

  





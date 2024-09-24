// NURFATHIN DINA BINTI AJAH MAIDIEN
// 22/9/2024 17:46 PM

public class TypeCastingDemo {

    public static void main(String []args){
      
    //declare variable first
    int num1 = 5;  
    double no1 = 5.5d;
    float nombor1 = 6.0f;
    char alp1 = 'g';
    System.out.println("\nThis is number variable: "+ num1+" "+ no1+" "+nombor1+" "+alp1);


    //int to other(int num1 = 5; )
    double no2 = num1;
    float nombor2 = num1;
    char alp2 = (char)num1;
    System.out.println("\nThis is number cast from integer : "+ no2+" "+ nombor2+"  "+alp1);


    //double to other(double no1 = 5.5d;)
    int num3=(int)no1;
    float nombor3=(float)no1;
    char alp3= (char)no1;  //it will give u symbol output why?
    System.out.println("\nThis is number cast from double: "+ num3+" "+ nombor3+"  "+alp3);


    // float to other (float nombor1 = 6.0f;)
    int num4=(int)nombor1;
    double no4=(double)nombor1;
    char alp4=(char)nombor1; //it will give u symbol output why?
    System.out.println("\nThis is number cast from float: "+ num4+" "+ no4+"  "+alp4);


     //char to other(char alp1 = 'g';)
     int num5=(int)alp1;
     double no5=(double)alp1;
     float nombor5=(float)alp1;
     System.out.println("\nThis is number cast from char: "+ num5+" "+ no5+"  "+nombor5);


     //wrapper

     Integer numWr =Integer.valueOf(num1);
     Double noWr = Double.valueOf(no1);
     Float nomborWr = Float.valueOf(nombor1);
     Character alpWr =Character.valueOf(alp1);
     
     System.out.println(" \nWrap for INT is " + numWr);
     System.out.println(" \nWrap for DOUBLE is " + noWr);
     System.out.println(" \nWrap for FLOAT is " + nomborWr);
     System.out.println(" \nAWrap for CHARACTER is " + alpWr);
    }
}
    
    







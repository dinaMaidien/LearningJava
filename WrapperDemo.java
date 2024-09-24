// NURFATHIN DINA BINTI AJAH MAIDIEN
// 22/9/2024 12:15PM


public class WrapperDemo {
    public static void main (String[]args){


        // declare normal
        int num = 5;
        double no = 5.5d;
        float nombor = 6.0f;
        char alp = 'g';
        boolean wrapperfun = true;

        //declare wrapper
        Integer numWr =Integer.valueOf(num);
        Double noWr = Double.valueOf(no);
        Float nomborWr = Float.valueOf(nombor);
        Character alpWr =Character.valueOf(alp);
        Boolean wrapperWr=Boolean.valueOf(wrapperfun);

        //print
        System.out.println(" number for int is " + num);
        System.out.println(" \nno for double is " + no  );
        System.out.println(" \nnumber for float is " + nombor);
        System.out.println(" \ncharachter for alp is " + alp );
        System.out.println(" \nCondition for boolean is " + wrapperfun);

        System.out.println(" \nWrap for INT is " + numWr);
        System.out.println(" \nWrap for DOUBLE is " + noWr);
        System.out.println(" \nWrap for FLOAT is " + nomborWr);
        System.out.println(" \nAWrap for CHARACTER is " + alpWr);
        System.out.println(" \nWrap for BOOLEAN is " + wrapperWr);




    }
  
    
}

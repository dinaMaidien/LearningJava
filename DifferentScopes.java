public class DifferentScopes {
    int instanceVariable = 10;    // int any number w/o decimal
    double instanceVariableDouble = 10.8; // this is double variable
    String instanceVariableString = " This is the string"; // always remember string huruf S besar

    //static int instanceVariableStatic = 20;java

    public void showLocalVariable() {// purpose void clear after finish
    String localStringVariable = "Finish";
    int localVariable = 30;
    System.out.println("My local VAriable is :" +localVariable+" "+localStringVariable);
    
    }

    public static void main (String[]args){ //'main' is necessary for combine or compile the code
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local Variable is :" +example.instanceVariable+" "+example.instanceVariableString);
    }
}



public class Finally {


    public static void main(String[]args){
        try{
            int[] numbers ={1,2,3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("caugt bad" + e.getMessage());
        }finally{
            System.out.println("It will executes anyway");
        }

        System.out.println("Programm is continue");
    }
    
}

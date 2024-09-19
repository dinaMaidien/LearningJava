public class Person {
    private String name;
    private int age;
    private double gpasem1;
    private double gpasem2;
    private double gpaSum;

    public Person(String name, int age){
    this.name = name;
    this.age = age;
    
    }
// tujuan buat method ni kalau banyak dataa so kita nak organised it
    public void displayDetails(){
     // void means finish 
       int maxInt = Integer.MAX_VALUE;
       long maxPLusOne = 62328399220101010L; 
       boolean condition = false;
       System.out.println("Name is" +name);
       System.out.println("Age is" +age);
       System.out.println(maxInt);
       System.out.println(maxPLusOne);
       System.out.println(condition);
       

    }

    public static void main(String[]args){  // static means kena ada value dalam dia, dia adalah the real data. controller outside api  so dia akan hntr ke luar//spring boot
        Person person = new Person("Atok", 17);  // kita kena declare dalam paranthesis sbb kat atas tak declare
        person.displayDetails();}
}
        public static void main (String[]args){
            double gpaSem1 = 5;
            double gpaSem2 = 7.6;

            double sumGpa = gpaSem1 + gpaSem2;
            System.out.println(sumGpa);
        } 
    

   






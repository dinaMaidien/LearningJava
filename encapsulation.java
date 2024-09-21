public class encapsulation {

    private String name;  //variable
    private int age;   //varia


     // Getter for name
    public String getName(){

        return name;
    }
    // Setter for name
    public void setName (String name){
        this.name = name;
    }
    
    // Getter for age
    public int getAge(){
       return age;
    }

    // Setter for age
    public void setAge (int age){
        this.age =age;

    }
     public static void main (String[]args){  //uses void because it does not return any value at all
        encapsulation person = new encapsulation();
        person.setName("Atok");
        person.setAge(17);

        System.out.println(person.getName()+ "  " + person.getAge()+"  " + "years old");

     }
      
}

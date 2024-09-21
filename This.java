//super class
class Animal{
    String name;

    public Animal(String name){  //setter dalam ni takyah getter sbb kat output nnti taknak guna getter daha
        this.name = name;
    }
    

    public void sound(){
        System.out.println(name + " Makes sound");
    }

}

//subclass
class Dog extends Animal{ 
    public Dog (String name) {
        super(name);


    }

    @Override
    public void sound(){
        super.sound();
        System.out.println(name + "  barks");
    }
}

public class This {
    public static void main(String[]args){
        Dog dog = new Dog ("Angeer");
        dog.sound();

    }
}


    

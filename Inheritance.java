
//super class
class Animal{
    public void eat(){
        System.out.println("The animal is eating");
    }
}

//sub class
class Dog extends Animal{
    public void bark(){   
        System.out.println("The dog is barking"); 
    }
}



// this is where  it auto created after name the file
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

    }
    
}

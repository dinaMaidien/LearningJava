
//Superclass
class Animal{
    public void sound(){
        System.out.println("Hop Hop");
    }
}

//Subclass1
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

//Subclass2
class Cow extends Animal{
    @Override
    public void sound(){
        System.out.println("Moo");
    }
}

//Subclass3
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

//created when we 
public class Polymorphism {
    
    public static void main(String[]args){
        Animal myAnimal = new Dog();    // kenapa kat sini ada Animal selepasnya takda ( yg colour hujau tu)? sbb sekali ja guna auto declare dalam bracket ni
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();

        myAnimal = new Animal();
        myAnimal.sound();

    }
}

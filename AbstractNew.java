abstract class Animal{    // abstarct is something like we not insist to be, like can change
    public abstract void sound();  // ni guna time login, kita nak pastikan dua dua login dan password betul baru login, taknak salah satu ja, soo una abstract

    //superclass
    public void sleep(){
        System.out.println("Teh animal is sleeping");


    }
    
    
}

//subclass
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");

    }
}


//main
public class AbstractNew {
    public static void main (String[]args){
        Dog dog = new Dog();
        dog.sleep();
        dog.sound();

    }
    
}

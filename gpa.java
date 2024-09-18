public class gpa {
    private double GPA;
    private int years;


    public gpa(double name, int years){
        this.GPA = GPA;
        this.years = years;
}
    public void display(){         // need to do it like this to organise
        System.out.println ("GPA is :" + GPA);
        System.out.println("Years is :" + years);
    }

    public static void main(String[]args){
        gpa those = new gpa(3.5,3); // kita kena declare dalam paranthesis sbb kat atas tak declare
        those.display();

    }
}

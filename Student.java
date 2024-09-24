import java.util.Scanner;

public class Student {

        private String name ;
        private int scores[]={0,0,0};
        private double aveScore;
        
        //construstor
        public Student(String name, int[] scores){
        this.name = name; 
        this.scores = scores;
        }
    
        // Getter for name
       public String getName(){
        return name;
        }
    
        // Setter for name
        public void setName (String name){
        this.name = name;
        }
        
    
        // Getter for score
        public int[] getScores(){
        return scores;
    }

        // Setter for scores
        public void setScores (int []scores){
        this.scores = scores;
        }
    
         //method calculate
         public double calculateAveScore(){
            int total =0;

            for (int score:scores){
                total = total + score ;
            }
            aveScore=total / 3;
            return aveScore;
         }
       
       // method assigned grade
           public String grade (){
           String grade = " ";
    
            if (aveScore>=90 ){
                  grade= "A";
            }
                else if (aveScore>=80 && aveScore <= 89 ){
                   grade="B";
                }
    
                else if (aveScore>=70 && aveScore <= 79){
                  grade="C";
                }
                else if (aveScore>=60 && aveScore <= 69){
                  grade="D";
                }
                else if ( aveScore<60){
                  grade="F";
                }
                return grade;
            } 

            public static void main(String[] args){
                Student[] students= new Student[5];
         
            for (int i=0; i<=5; i++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter student name : ");

                String name = scanner.nextLine(); //read user input

                int [] scores = new int [3];
                //Scanner student = new Scanner(System.in);
                System.out.printf("Enter  english score for %s: ", name);
                scores[0]=scanner.nextInt();
                System.out.printf("Enter  math score for %s: ", name);
                scores[1]=scanner.nextInt();
                System.out.printf("Enter  science score for %s: ", name);
                scores[2]=scanner.nextInt();

                students[i] = new Student(name, scores);  // akan hntr data to constructor to

                
}
    for (Student student : students) {
    System.out.println("\nStudent Name: " + student.getName());
    System.out.println("Average Score: " + student.calculateAveScore());
    System.out.println("Assigned Grade: " + student.grade());

    }
}}
    
    
        

public class CaloriesAnis {
    public static void main(String[] args) {
        int[] dayOfWeek = {1,2,3,4,5,6,7};
        String dayName;
        int intake= 1200;
        int addedCalories = 100;

        for (int num:dayOfWeek){
            
            switch (num) {
                case 1:
                    dayName = "Monday " + intake;
                    break;
                case 2:
                    dayName = "Tuesday " + intake;
                    break;
                case 3:
                    dayName = "Wednesday "+ (intake = intake + addedCalories);
                    break;
                case 4:
                    dayName = "Thursday "+ (intake = intake + addedCalories);
                    break;
                case 5:
                    dayName = "Friday "+ (intake = intake + addedCalories);
                    break;
                case 6:
                    dayName = "Saturday "+ (intake = intake + addedCalories);
                    break;
                case 7:
                    dayName = "Sunday "+ (intake = intake + addedCalories);
                    break;
                default:
                    dayName = "Invalid Value";
                    break;
            }
            System.out.println(dayName);
    
        } }}


        //first kau kena tahu apa variable dia guna, increament, days, calory
        // anis punya dia declare setiap 


        //apa yang aku belajar dari mistake harini
        //dalam for d++ maksud tambah 1, nak tambha 100 d+100 akan jadi salah so kena d++100 atau d=+100 atau d=d+100

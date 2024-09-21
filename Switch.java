public class Switch {
    public static void main (String[]args){

        int dayOfWeek = 3;
        String dayName;
        

        switch (dayOfWeek){

            case 1 : 
                dayName = "MOnday";
                break;
             case 2 : 
                dayName = "Tuesday";
                break;   
             case 3 : 
                dayName = "Wednesday";
                break;
             case 4 : 
                dayName = "Thurdays";
                break;
             case 5 : 
                dayName = "Friday";
                break;
             case 6 : 
                dayName = "Saturday";
                break;
             case 7 : 
                dayName = "Sunday";
                break;

            default: 
                dayName = "Invalid";
                break;

        }

        System.out.println (dayName);
    }
    
}

// dalam kerja kita lagi banyak guna statement instead switch
// ni nak ajar guna switch 
// untuk case boleh je selain int contoh case false (boolean) atau case tue " string"
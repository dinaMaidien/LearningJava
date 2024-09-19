public class Equals {
    public static void main(String[]args){
    String str1 = "HEllo";
    String str2 = "HEllo";
    String str3 = new String("Hello");
    
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));  // sini kita nk paksaa dia bagi tture

}
}

// output akan jadi true false true true
    // x = 20 ( ni nk cakap equal ni x adalah 20)
// x ==20 
//if put == kita bagi java pikir
// if put (.equals) kita paksa diaa untuk bagi jawapan true


// soalan kenapa first jawapan true second jawapan false??
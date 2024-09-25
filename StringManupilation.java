public class StringManupilation {

    public static void main(String[]args){
        String str = "Hello dina";
        String newStr = str.concat(" World");
        String lowerStr =str.toLowerCase();
        String subStr = newStr.substring(0,5); // dia guna untuk display huruf dari 0 smpai 5 ja
        String replaceString = newStr.replace(" World", "Java");  // dia replace newStr part

        System.out.println(newStr);
        System.out.println(lowerStr);
        System.out.println(subStr);
        System.out.println(replaceString);
        

    }
    
}

public class StringBuilderOne {

    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.delete(5, 6);    //this delete between 5&6,, if we comment this part it will give diff output
        //sb.reverse();                 //if we comment this part it will give diff output, try and print output
        
        System.out.println(sb.toString());

    }
    
}

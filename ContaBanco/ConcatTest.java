package Santander2024.ContaBanco;

public class ConcatTest {
    public static void main(String[] args) {
        //String concat with concat() method
        String string1 = "I learn ";
        String string2 = "concatenation in Java";
        //here we use concat() method to join the two strings above
        String result = string1.concat(string2);
        System.out.println(result);
        //concat() method to join 4 strings
        String myWebSite = "Code".concat("Gym").concat(".cc").concat("/quest");
        System.out.println(myWebSite); 

        System.out.println(myMessage(true));
        //System.out.println(myMessage(true));
    }

    private static String myMessage(boolean b) {   //concat() method with selection statement
        return "I have".concat(b ? " " : "n't ").concat("got it");
    }
}

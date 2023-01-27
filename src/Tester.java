/**
 * @author eduar
 * This is the main class
 */
public class Tester {
    public Tester(){
    }
    public static void main(String[] args) {

        /**
         * Print all details
         */
        WordGames object = new WordGames();
        System.out.println(object.addHelloWord("Nomerandom"));
        System.out.println(object.getFullName("Nomerandom", "Cognomerandom"));
    }

}

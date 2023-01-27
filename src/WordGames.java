/**
 * @author eduar
 * WordGamesclass
 *
 */

public class WordGames {
    public WordGames(){
    }

    /**
     * @param word add the name to the string Hello
     * @return
     */
    public String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     *
     * @param name player name
     * @param surname player surname
     * @return concatenation of name and surname
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}

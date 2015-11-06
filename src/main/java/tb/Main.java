package tb;

import tb.text.*;

import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();
        word.add(new Symbol("A"));

        Sentence sentence = new Sentence();
        sentence.add(word);

        Properties properties = new Properties();
        InputStream in = Main.class.getClassLoader().getResourceAsStream("parser.properties");
        Parser parser = new Parser();
        parser.configure();

        Text text = parser.parse("1287356127836");
        Paragraph paragraph = parser.parse("1287356127836", Paragraph.class);

    }
}

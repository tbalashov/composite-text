package tb.text;

public class Symbol implements Leaf, SentenceToken {
    char c;

    public Symbol(String c) {

    }

    public String toSourceString() {
        return String.valueOf(c);
    }
}

public class Token implements Comparable<Token> {

    public static final int Invalid = Integer.MAX_VALUE;

    private int tokenValue;

    public Token() {
        this(Invalid);
    }

    public Token(int value) {
        this.tokenValue = value;
    }

    public int compareTo(Token other) {
        if (this.tokenValue == other.tokenValue) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

}

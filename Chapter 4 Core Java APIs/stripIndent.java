public class stripIndent {
    public static void main(String[] args) {
        System.out.println("   hello world".stripIndent());
        System.out.println("hello world  ".stripIndent());
        System.out.println("   hello world  ".stripIndent());
    }
}
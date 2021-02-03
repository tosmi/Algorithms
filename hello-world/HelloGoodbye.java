public class HelloGoodbye {
    public static void main(String argv[]) {
	String greeting = String.format("Hello %s and %s.", argv[0], argv[1]);
	System.out.println(greeting);
    }
}

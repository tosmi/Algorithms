import java.util.Scanner;

public class RandomWord {

    private String finalWord;

    public static void main(String[] argv) {
	Scanner scanner = new Scanner(System.in);
	//	scanner.useDelimiter(" ");

	int n = 1;
	while(scanner.hasNext()) {
	   var word = scanner.next("[a-z]*");
	   System.out.println(">>> next word: " + word);

	   var prop = 1 / n;
	   n++;
	}
	scanner.close();
    }
}

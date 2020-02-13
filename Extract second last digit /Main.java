import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int Second_last_digit = (n %100) / 10;
      System.out.println(Second_last_digit);
	}
	}

import java.util.Scanner;
import java.util.Locale;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i <= n && i > 0; i--) {

			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}

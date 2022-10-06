import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int var;

		System.out.println("Input Number : ");
		Scanner Inp = new Scanner(System.in);

		var = Inp.nextInt();
		Inp.close();
		// In block diagram, the if is represented using Diamond Shape Block
		if (var > 100) {
			System.out.println("Omkay_Vro");
		} else {
			System.out.println("Cant Vro HEMLPS");
		}

	}
}
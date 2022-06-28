import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, r, totaln = 1, totalr = 1, totalnr = 1, sonuc;
		Scanner deger = new Scanner(System.in);
		System.out.print("n'in r'lisi icin n giriniz: ");
		n = deger.nextInt();
		System.out.print("n'in r'lisi icin r giriniz: ");
		r = deger.nextInt();
		for (int i = 1; i <= n; i++) {
			totaln *= i;
		}
		for (int j = 1; j <= r; j++) {
			totalr *= j;
		}
		for (int k = 1; k <= n - r; k++) {
			totalnr *= k;
		}
		sonuc = totaln / (totalr * totalnr);
		System.out.print(sonuc);
	}

}

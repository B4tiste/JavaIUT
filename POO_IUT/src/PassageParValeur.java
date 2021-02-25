public class PassageParValeur {

	public static void main(String[] args) {
		int nbCookies = 5;

		mangerDesCookies(nbCookies);

		System.out.println("Il reste " + nbCookies + " cookies !");

	}

	private static void mangerDesCookies(int nbCookies) {
		nbCookies = nbCookies - 2;
		System.out.println("Je viens de manger 2 cookies et il en reste : " + nbCookies);
	}

}

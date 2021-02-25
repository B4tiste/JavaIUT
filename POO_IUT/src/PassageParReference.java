public class PassageParReference {

	public static void main(String[] args) {
		PaquetCookies paquet = new PaquetCookies(5);

		mangerDesCookies(paquet);

		System.out.println("Il reste " + paquet.nbCookies + " cookies !");
	}

	private static void mangerDesCookies(PaquetCookies paquet) {
		paquet.nbCookies = paquet.nbCookies - 2;
		System.out.println("Je viens de manger 2 cookies et il en reste : " + paquet.nbCookies);
	}

}

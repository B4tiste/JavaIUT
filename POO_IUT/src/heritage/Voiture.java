package heritage;

public class Voiture extends Vehicule {

	@Override
      public void setVitesse(double vitesse) {

          if (vitesse > 130) {
              ...
          }

          ...
      }

	@Override
	public void faireDuBruit() {
		super.faireDuBruit();
		System.out.println("Vroom vroom");
	}

}
package de.dhbw.tinf12b3.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		final Handlungsf�hig kern = new Mann();
		final Kontostand geld = new Kontostand(kern);
		final Reinlichkeit sauber = new Reinlichkeit(geld);
		final Reinlichkeit sauber2 = new Reinlichkeit(sauber);
		final Reinlichkeit sauber3 = new Reinlichkeit(sauber2);
		final Humor fr�hlich = new Humor(sauber3);

		final Handlungsf�hig gesch�pf = fr�hlich;
		gesch�pf.handle();
	}

}

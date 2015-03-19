package de.dhbw.tinf12b3.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		final Frau meine = new Frau();
		final Kontostand geld = new Kontostand(meine);
		final Reinlichkeit sauber = new Reinlichkeit(geld);

		final Handlungsf�hig gesch�pf = sauber;
		gesch�pf.handle();
	}

}

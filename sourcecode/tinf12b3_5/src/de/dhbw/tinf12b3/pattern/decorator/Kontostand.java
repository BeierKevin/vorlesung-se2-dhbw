package de.dhbw.tinf12b3.pattern.decorator;

public class Kontostand extends Charakterzug {

	public Kontostand(Handlungsf�hig nachfolger) {
		super(nachfolger);
	}

	@Override
	public void handle() {
		System.out.println("Bezahle Rechnungen.");
		super.handle();
	}
}

package de.dhbw.tinf12b3.pattern.decorator;

public class Reinlichkeit extends Charakterzug {

	public Reinlichkeit(Handlungsf�hig nachfolger) {
		super(nachfolger);
	}

	@Override
	public void handle() {
		super.handle();
		System.out.println("Alles ist sauber und abgesp�lt.");
	}
}

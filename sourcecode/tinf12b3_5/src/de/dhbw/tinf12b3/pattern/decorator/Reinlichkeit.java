package de.dhbw.tinf12b3.pattern.decorator;

public class Reinlichkeit extends Charakterzug {

	public Reinlichkeit(Handlungsf�hig nachfolger) {
		super(nachfolger);
	}

	@Override
	protected void handleDanach() {
		System.out.println("Alles ist sauber und abgesp�lt.");
	}
}

package de.dhbw.tinf12b3.pattern.decorator;

public class Frau extends Handlungsf�hig {

	public Frau() {
		super();
	}

	@Override
	public void handle() {
		System.out.println("Kochen. Putzen. Motzen.");
	}
}

package de.dhbw.tinf12.pattern.decorator;

public class Flugger�t extends Feature {

	public Flugger�t(Staatseigentum sockel) {
		super(sockel);
	}

	@Override
	public void herrsche() {
		System.out.print("Im Flug... ");
		super.herrsche();
	}
}

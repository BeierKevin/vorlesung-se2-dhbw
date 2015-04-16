package de.dhbw.tinf12.pattern.decorator;

public abstract class Feature implements Staatseigentum {

	private final Staatseigentum n�chste;

	public Feature(Staatseigentum n�chste) {
		super();
		this.n�chste = n�chste;
	}

	@Override
	public void herrsche() {
		this.n�chste.herrsche();
	}
}

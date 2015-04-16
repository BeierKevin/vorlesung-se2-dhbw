package de.dhbw.tinf12b3.pattern.decorator;

public abstract class Charakterzug extends Handlungsf�hig {

	private final Handlungsf�hig n�chstes;

	public Charakterzug(Handlungsf�hig nachfolger) {
		super();
		this.n�chstes = nachfolger;
	}

	@Override
	public final void handle() {
		handleVorher();
		this.n�chstes.handle();
		handleDanach();
	}

	protected void handleDanach() {
		// leer
	}

	protected void handleVorher() {
		// leer
	}
}

package de.dhbw.tinf12.pattern.observer;

public class CynicalDecayListener implements DecayListener {

	@Override
	public void notifyOfDecay() {
		System.out.println("Zum Gl�ck ist es weg!");
	}
}

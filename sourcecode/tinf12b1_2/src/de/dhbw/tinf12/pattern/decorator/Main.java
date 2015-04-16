package de.dhbw.tinf12.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Staatseigentum gadget = new Inspector();
		Staatseigentum flyer = new Flugger�t(gadget);
		Staatseigentum eyes = new XRayEyes(flyer);
		Staatseigentum fly2 = new Flugger�t(eyes);

		fly2.herrsche();
	}
}

package ckecked;

/*
 * Esto es un objeto del tipo Exception
 * Por tanto, quien lo reciba no puede desentenderse.
 */

public class CheckedVsUnchecked extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final String mensaje= "Es par!!!";
	
	public CheckedVsUnchecked() {
	}

	public String getMensaje() {
		return mensaje;
	}
	
}

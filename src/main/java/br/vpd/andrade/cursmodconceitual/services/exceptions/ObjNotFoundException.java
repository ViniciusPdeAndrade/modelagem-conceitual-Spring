package br.vpd.andrade.cursmodconceitual.services.exceptions;

public class ObjNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7046784562596358150L;

	public ObjNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjNotFoundException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

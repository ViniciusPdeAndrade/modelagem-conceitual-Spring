package br.vpd.andrade.cursmodconceitual.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 7046784562596358150L;

	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

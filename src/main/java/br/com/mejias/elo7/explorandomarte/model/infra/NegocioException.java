package br.com.mejias.elo7.explorandomarte.model.infra;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = 5594370512393602749L;

	public NegocioException(String message) {
        super(message);
    }
}

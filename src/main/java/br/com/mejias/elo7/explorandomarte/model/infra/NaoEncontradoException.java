package br.com.mejias.elo7.explorandomarte.model.infra;

public class NaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = -4836011236301823395L;

	public NaoEncontradoException(String message) {
        super(message);
    }
}

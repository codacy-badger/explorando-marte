package br.com.mejias.elo7.explorandomarte.model.infra;

import java.io.Serializable;

public class ErroRetorno implements Serializable {

	private static final long serialVersionUID = -8344396301091173331L;
	private final String mensagem;

	public ErroRetorno(String mensagem){
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}

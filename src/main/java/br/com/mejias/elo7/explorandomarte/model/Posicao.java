package br.com.mejias.elo7.explorandomarte.model;

import java.io.Serializable;

public class Posicao implements Serializable{

	private static final long serialVersionUID = 3898945661099609477L;
	private final Integer x;
    private final Integer y;
    private final Sentido sentido;

    public Posicao(Integer x, Integer y, Sentido sentido) {
        this.x = x;
        this.y = y;
        this.sentido = sentido;
    }

	public Integer getX() {
		return x;
	}
	public Integer getY() {
		return y;
	}
	public Sentido getSentido() {
		return sentido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentido == null) ? 0 : sentido.hashCode());
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicao other = (Posicao) obj;
		if (sentido != other.sentido)
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Posicao [x=" + x + ", y=" + y + ", sentido=" + sentido + "]";
	}
}

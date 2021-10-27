package com.kellen.appitau.modelo;

import java.time.LocalDateTime;

public class Transacao {
	private String estabelecimento;
	private Double valor;
	private LocalDateTime data;
	private String tipo;

	public Transacao(String estabelecimento, Double valor, LocalDateTime data, String tipo) {
		super();
		this.estabelecimento = estabelecimento;
		this.valor = valor;
		this.data = data;
		this.tipo = tipo;
	}

	public Transacao(String estabelecimento, Double valor, String tipo) {
		this.estabelecimento = estabelecimento;
		this.valor = valor;
		this.tipo = tipo;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

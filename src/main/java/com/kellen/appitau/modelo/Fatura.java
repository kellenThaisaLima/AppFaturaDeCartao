package com.kellen.appitau.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fatura {
	
	private Conta conta;
	private ArrayList<Transacao> transacoes;
	private Totais totais;
	private Long id;
	
	public Fatura() {
		this.totais = new Totais();
		this.transacoes = new ArrayList<Transacao>();
	}
	
	public Fatura(Conta conta) {
		this.conta = conta;
		this.totais = new Totais();
		this.transacoes = new ArrayList<Transacao>();
	}
	
	public Fatura(Conta conta, Totais totais) {
		this.conta = conta;
		this.totais = totais;
		this.transacoes = new ArrayList<Transacao>();
	}
	
	public void fazerTransacao(Transacao transacao) {
		transacoes.add(transacao);
	}	

	public ArrayList<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(ArrayList<Transacao> transacoes) {
		this.transacoes = transacoes;
	}

	public Totais getTotais() {
		return totais;
	}

	public void setTotais(Totais totais) {
		this.totais = totais;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
		
	public Conta getConta() {
		return this.conta;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
	
//	public void filter() {
//		
//		List<Transacao> filtroTransacao = this.transacoes.stream().filter(
//				transacao -> transacao.getTipo().toLowerCase().equals("nacional")
//				).collect(Collectors.toList());		
//	}
}
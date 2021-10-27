package com.kellen.appitau.modelo;

public class Conta {
	
	
	private String nomeCliente;
	private Double limite;
	private Double saldoAnterior;
	private Double saldoDisponivel;
	private Double totalFatura;
	
	
	
	
	public Conta(String nomeCliente, Double limite) {
		super();
		this.nomeCliente = nomeCliente;
		this.limite = limite;
	}
	
	public Conta(String nomeCliente, Double limite, Double saldoAnterior, Double saldoDisponivel, Double totalFatura) {
		super();
		this.nomeCliente = nomeCliente;
		this.limite = limite;
		this.saldoAnterior = saldoAnterior;
		this.saldoDisponivel = saldoDisponivel;
		this.totalFatura = totalFatura;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public Double getSaldoAnterior() {
		return saldoAnterior;
	}
	public void setSaldoAnterior(Double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}
	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	public void setSaldoDisponivel(Double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	public Double getTotalFatura() {
		return totalFatura;
	}
	public void setTotalFatura(Double totalFatura) {
		this.totalFatura = totalFatura;
	}
}

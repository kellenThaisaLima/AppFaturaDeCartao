package com.kellen.appitau.modelo;


public class Totais {
	private Double totalDebitos;
	private Double totalCreditos;
	
	
	public Totais() {
		this.totalDebitos = 0.0;
		this.totalCreditos = 0.0;
	}
	public Totais(Double totalCreditos, Double totalDebitos) {
		this.totalDebitos = totalDebitos;
		this.totalCreditos = totalCreditos;
	}
	public Double getTotalDebitos() {
		return totalDebitos;
	}
	public void setTotalDebitos(Double totalDebitos) {
		this.totalDebitos = totalDebitos;
	}
	public Double getTotalCreditos() {
		return totalCreditos;
	}
	public void setTotalCreditos(Double totalCreditos) {
		this.totalCreditos = totalCreditos;
	}
}
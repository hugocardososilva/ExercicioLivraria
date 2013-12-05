
package com.example.exerciciolivraria;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Livro> livros;
	Double valorTotal = 0.0;
	Double valor;
	
	public Carrinho( ArrayList<Livro> livros) {
		super();
		
		this.livros = livros;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		valorTotal = valorTotal;
	}
	
	public Double CalcularValor(Double valor){
	 valorTotal = valorTotal + valor;
	return valorTotal;
	}
}

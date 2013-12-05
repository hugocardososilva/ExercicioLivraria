package com.example.exerciciolivraria;

public class Livro {
	String nome,autor,editora;
	Double preco;
	int isbn, imagem;
	
	public Livro(int imagem,String nome, String autor, String editora, double preco,
			int isbn) {
		super();
		this.imagem= imagem;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.preco = preco;
		this.isbn = isbn;
	}
	
	public int getImagem() {
		return imagem;
	}

	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	
	
	
}

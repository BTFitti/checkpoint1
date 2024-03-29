package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_livro")
@SequenceGenerator(name="livro",sequenceName ="SQ_TB_LIVRO",allocationSize= 1)
public class Livro implements Serializable {

	private static final long serialVersionUID= 1L;
	public Livro() {
		this.ativo = true;
		this.dataCadastro = LocalDateTime.now();
		this.dataAtualizacao = LocalDateTime.now();
	}
	
	public Livro(String titulo, String autor,String isbn, String edicao, LocalDate dataPublicacao) {
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
	}
	
	@Override
	public String toString() {
		
		return "\nTitulo: " + this.getTitulo() 
			+ "\nAutor: " + this.getAutor()
			+ "\nISBN: " + this.getIsbn() 
			+ "\nPublica��o: " + this.getDataPublicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

	}

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
private Long id;

@Column(name = "ds_titulo", length = 100, nullable = false)
private String titulo;

@Column(name = "nm_autor", length = 60, nullable = false, unique = true)
private String autor;

@Column(name = "nr_isbn", length = 20, nullable = false, unique = true)
private String isbn;

@Column(name = "ds_edicao",length = 10)
private String edicao;

@Column(name = "dt_publicacao")
private LocalDate dataPublicacao;

@Column(name = "st_ativo")
private Boolean ativo;

@Column(name = "dt_cadastro")
private LocalDateTime dataCadastro;

@Column(name = "dt_atualizacao")
private LocalDateTime dataAtualizacao;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public String getEdicao() {
	return edicao;
}

public void setEdicao(String edicao) {
	this.edicao = edicao;
}

public LocalDate getDataPublicacao() {
	return dataPublicacao;
}

public void setDataPublicacao(LocalDate dataPublicacao) {
	this.dataPublicacao = dataPublicacao;
}

public Boolean getAtivo() {
	return ativo;
}

public void setAtivo(Boolean ativo) {
	this.ativo = ativo;
}

public LocalDateTime getDataCadastro() {
	return dataCadastro;
}

public void setDataCadastro(LocalDateTime dataCadastro) {
	this.dataCadastro = dataCadastro;
}

public LocalDateTime getDataAtualizacao() {
	return dataAtualizacao;
}

public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
	this.dataAtualizacao = dataAtualizacao;
}

}



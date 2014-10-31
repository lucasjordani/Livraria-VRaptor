package livraria_admin;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class Livro implements Estante {
	
	private String titulo;
	private String descricao;
	private BigDecimal preço;
	private Calendar dataPublicacao;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getPreço() {
		return preço;
	}
	
	public void setPreço(BigDecimal preço) {
		this.preço = preço;
	}
	
	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	public void guarda(Livro livro) {
		// TODO Auto-generated method stub
		 
	}
	
	public List<Livro> todosOsLivros() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

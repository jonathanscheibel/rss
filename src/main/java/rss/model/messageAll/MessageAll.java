package rss.model.messageAll;

import rss.model.feedMessage.model.Autor;
import rss.model.feedMessage.model.Descricao;
import rss.model.feedMessage.model.Titulo;

public class MessageAll implements InterfaceMessageAll{

	Titulo titulo;
	Autor autor;
	Descricao descricao;
	
	public MessageAll(Titulo titulo, Autor autor, Descricao descricao) {
		super();
		setTitulo(titulo);
		setAutor(autor);
		setDescricao(descricao);
	}

	@Override
	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;		
	}

	@Override
	public void setAutor(Autor autor) {
		this.autor = autor;
		
	}

	@Override
	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

	@Override
	public Titulo getTitulo() {
		return titulo;
	}

	@Override
	public Autor getAutor() {
		return autor;
	}

	@Override
	public Descricao getDescricao() {
		return descricao;
	}

		
}

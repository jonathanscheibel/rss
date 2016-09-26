package rss.model.messageAll;

import rss.model.feedMessage.model.Autor;
import rss.model.feedMessage.model.Descricao;
import rss.model.feedMessage.model.Titulo;

public interface InterfaceMessageAll {

	public void setTitulo(Titulo titulo);
	public void setAutor(Autor autor);
	public void setDescricao(Descricao descricao);
	
	public Titulo getTitulo();
	public Autor getAutor();
	public Descricao getDescricao();
}

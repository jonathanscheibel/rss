package rss.model.messageAll;

import rss.model.feedMessage.model.Autor;
import rss.model.feedMessage.model.Descricao;
import rss.model.feedMessage.model.Guid;
import rss.model.feedMessage.model.Link;
import rss.model.feedMessage.model.Titulo;

public interface InterfaceMessageAll {

	public void setTitulo(Titulo titulo);
	public void setAutor(Autor autor);
	public void setDescricao(Descricao descricao);
	public void setLink(Link link);
	public void setGuid(Guid guid);
	
	public Titulo getTitulo();
	public Autor getAutor();
	public Descricao getDescricao();
	public Link getLink();
	public Guid getGuid();
}

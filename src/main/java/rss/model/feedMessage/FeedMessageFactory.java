package rss.model.feedMessage;

import rss.model.feedMessage.model.Autor;
import rss.model.feedMessage.model.Descricao;
import rss.model.feedMessage.model.Titulo;

public class FeedMessageFactory {

	final String URL = "http://www.sh3.com.br/atualizacao.html";
	
	public FeedMessage getFeedMessage() {					
		return new FeedMessage();
	}
		
	public FeedMessage getFeedMessage(Titulo titulo, Autor autor, Descricao descricao) {					
		FeedMessage feed = new FeedMessage();
		feed.setTitle(titulo.toString()); 			//"RSSFeed"
		feed.setDescription(descricao.toString()); 	//"This is a description"
		feed.setAuthor(autor.toString()); 			//"nonsense@somewhere.de (Lars Vogel)"
		feed.setGuid(URL);
		feed.setLink(URL);
		return feed;
	}
}


package rss.model.feedMessage;

import rss.model.messageAll.InterfaceMessageAll;

public class FeedMessageFactory {

	final String URL = "http://www.sh3.com.br/atualizacao.html";
	
	public FeedMessage getFeedMessage() {					
		return new FeedMessage();
	}	
	
	public FeedMessage getFeedMessage(InterfaceMessageAll messageAll) {					
		FeedMessage feed = new FeedMessage();
		feed.setTitle(messageAll.getTitulo().getTextMessage()); 			//"RSSFeed
		feed.setAuthor(messageAll.getAutor().getTextMessage()); 			//"nonsense@somewhere.de (Lars Vogel)"
		feed.setDescription(messageAll.getDescricao().getTextMessage()); 	//"This is a description"
		feed.setGuid(URL);
		feed.setLink(URL);
		return feed;
	}
	
}


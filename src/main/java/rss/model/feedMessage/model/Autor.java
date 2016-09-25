package rss.model.feedMessage.model;

import rss.model.message.InterfaceMessage;

public class Autor implements InterfaceMessage{

	private String nomeAutor;
	
	public Autor(String nomeAutor){
		setTextMessage(nomeAutor);		
	}
	
	public String toString(){
		return nomeAutor;
	}

	@Override
	public void setTextMessage(String text) {
		this.nomeAutor = text;
		
	}

	@Override
	public String getTextMessage() {
		return nomeAutor;
	}
	
	
}

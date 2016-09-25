package rss.model.feedMessage.model;

import rss.model.message.InterfaceMessage;

public class Titulo implements InterfaceMessage{

private String nomeTitulo;
	
	public Titulo(String nomeTitulo){
		setTextMessage(nomeTitulo);		
	}

	@Override
	public void setTextMessage(String text) {
		this.nomeTitulo = text;		
	}

	@Override
	public String getTextMessage() {
		return nomeTitulo;
	}


}

package rss.model.feedMessage.model;

import rss.model.message.InterfaceMessage;

public class Descricao  implements InterfaceMessage{

	private String nomeDescricao;
	
	public Descricao(String nomeDescricao){
		setTextMessage(nomeDescricao);
	}
	
	public String toString(){
		return nomeDescricao;
	}

	@Override
	public void setTextMessage(String text) {
		this.nomeDescricao = text;		
	}

	@Override
	public String getTextMessage() {
		return nomeDescricao;
	}
}

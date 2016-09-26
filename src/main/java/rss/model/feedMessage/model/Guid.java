package rss.model.feedMessage.model;

import rss.model.message.InterfaceMessage;

public class Guid implements InterfaceMessage{

	private String guid;
	
	public Guid(String guid) {
		super();
		setTextMessage(guid);
	}

	@Override
	public void setTextMessage(String text) {		
		this.guid = text;
	}

	@Override
	public String getTextMessage() {
		return guid;
	}
	
}

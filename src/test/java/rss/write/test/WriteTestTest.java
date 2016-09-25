package rss.write.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import rss.model.feed.Feed;
import rss.model.feed.FeedFactory;
import rss.model.feedMessage.FeedMessage;
import rss.model.feedMessage.FeedMessageFactory;
import rss.model.feedMessage.model.Autor;
import rss.model.feedMessage.model.Descricao;
import rss.model.feedMessage.model.Titulo;
import rss.model.messageAll.InterfaceMessageAll;
import rss.model.messageAll.MessageAll;
import rss.write.RSSFeedWriter;

public class WriteTestTest {

	final String NOME_FEED = "sh3Atualizacoes.rss";
	final String ARQUIVO = "src/main/webapp/resources/" + NOME_FEED;

//	@Before
//	public void deletarFeed() {
//		new File(ARQUIVO).delete();
//	}

	@Test
	public void testCreateFeed() {

		//Busca da fábrica o rssFeeder que será usado
		Feed rssFeeder = new FeedFactory().getFeedFactory();

		//Criação dos parametros básicos do RSS
		Titulo titulo = new Titulo("Como criar RSS em java2");
		Autor autor = new Autor("jonathansmorais@gmail.com2");
		Descricao descricao = new Descricao("Esta é a minha descrição!2");
		
		//Criação das mensagem com os parametros básicos
		InterfaceMessageAll message = new MessageAll(titulo, autor, descricao);

		//Criação de um novo feed
		FeedMessage newFeed = new FeedMessageFactory().getFeedMessage(message);
		
		//Adicionando este novo feed no rssFeeder
		rssFeeder.getMessages().add(newFeed);
		

		//Escreve o rssFeeder
		RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, ARQUIVO);
		try {
			writer.write();
		} catch (Exception e) {
			fail("Erro ao escrever o feed!");
			e.printStackTrace();
		}
	}

	@Test(expected = FileNotFoundException.class)
	public void testCreateFeedExceptiona() throws Exception {
		Feed rssFeeder = new FeedFactory().getFeedFactory();
		FeedMessage newFeed = new FeedMessageFactory().getFeedMessage();
		rssFeeder.getMessages().add(newFeed);
		RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, "");
		writer.write();
	}

}

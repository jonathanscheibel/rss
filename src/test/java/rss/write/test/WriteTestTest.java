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
import rss.write.RSSFeedWriter;

public class WriteTestTest {

	final String NOME_FEED = "sh3Atualizacoes.rss";
	final String ARQUIVO = "src/main/webapp/resources/" + NOME_FEED;

	@Before
	public void deletarFeed() {
		new File(ARQUIVO).delete();
	}

	@Test
	public void testCreateFeed() {

		Feed rssFeeder = new FeedFactory().getFeedFactory();

		
		

		FeedMessage newFeed = new FeedMessageFactory().getFeedMessage(new Titulo("Titulo1"),
				new Autor("jonathansmorais@gmail.com1"), new Descricao("Esta é a descrição da Atualização1"));
		rssFeeder.getMessages().add(newFeed);


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

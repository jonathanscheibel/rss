package rss.write.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import rss.model.Feed;
import rss.model.FeedMessage;
import rss.write.RSSFeedWriter;

public class WriteTestTest {

	final String NOME_FEED = "sh3Atualizacoes.rss";
	final String ARQUIVO = "src/main/webapp/resources/" + NOME_FEED;

	@Before
	public void deletarFeed(){
		new File(ARQUIVO).delete();
	}
	
	@Test
	public void testCreateFeed() {
		
		// create the rss feed
		String copyright = "Sistemas para gestão pública";
		String title = "Atualizações Web";
		String description = "Descrições de novas atualizações";
		String language = "pt";
		String link = "http://www.sh3.com.br";
		Calendar cal = new GregorianCalendar();
		Date creationDate = cal.getTime();
		SimpleDateFormat date_format = new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
		String pubdate = date_format.format(creationDate);
		Feed rssFeeder = new Feed(title, link, description, language, copyright, pubdate);

		// now add one example entry
		FeedMessage feed = new FeedMessage();
		feed.setTitle("RSSFeed");
		feed.setDescription("This is a description");
		feed.setAuthor("nonsense@somewhere.de (Lars Vogel)");
		feed.setGuid("http://www.vogella.com/tutorials/RSSFeed/article.html");
		feed.setLink("http://www.vogella.com/tutorials/RSSFeed/article.html");
		rssFeeder.getMessages().add(feed);

		// now write the file
		RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, ARQUIVO);
		try {
			writer.write();			
		} catch (Exception e) {
			fail("Erro ao escrever o feed!");
			e.printStackTrace();
		}

	}

}

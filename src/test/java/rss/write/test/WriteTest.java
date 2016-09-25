package rss.write.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import rss.model.Feed;
import rss.model.FeedMessage;
import rss.write.RSSFeedWriter;

public class WriteTest {
	public static void main(String[] args) {
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
		
		FeedMessage feed2 = new FeedMessage();
		feed2.setTitle("Como aprimorar os estudos");
		feed2.setDescription("Aqui a descrição de como aprimorar seus estudos!");
		feed2.setAuthor("jonathanscmorais@gmail.com (Jonathan Scheibel)");
		feed2.setGuid("http://www.sh3.com.br");
		feed2.setLink("http://www.sh3.com.br");
		rssFeeder.getMessages().add(feed2);
		
		// now write the file
		RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, "/home/jonathan/articles.rss");		
		try {
			writer.write();
			System.out.println("?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

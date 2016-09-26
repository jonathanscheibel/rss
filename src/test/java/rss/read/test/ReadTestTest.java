package rss.read.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rss.model.feed.Feed;
import rss.model.feedMessage.FeedMessage;
import rss.read.RSSFeedParser;

public class ReadTestTest {

	@Test
	public void testReadLink() {
		RSSFeedParser parser = new RSSFeedParser("http://localhost:8080/rss/resources/sh3Atualizacoes.rss");		
		Feed feed = parser.readFeed();
		
//		for (FeedMessage message : feed.getMessages()) {
//			System.out.println(message);
//		}

		assertTrue(feed.getMessages() != null);
	}


	
}

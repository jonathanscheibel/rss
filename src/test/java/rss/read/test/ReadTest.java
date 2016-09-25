package rss.read.test;

import rss.model.Feed;
import rss.model.FeedMessage;
import rss.read.RSSFeedParser;

public class ReadTest {

	public static void main(String[] args) {
//		RSSFeedParser parser = new RSSFeedParser("http://www.vogella.com/article.rss");
		RSSFeedParser parser = new RSSFeedParser("/home/jonathan/articles.rss");
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
			System.out.println(message);

		}

	}
}

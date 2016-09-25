package rss.model.feed;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FeedFactory {

	public Feed getFeedFactory(){
		String copyright = "Sistemas para gestão pública";
		String title = "Atualizações Web";
		String description = "Descrições de novas atualizações";
		String language = "pt";
		String link = "http://www.sh3.com.br";
		Calendar cal = new GregorianCalendar();
		Date creationDate = cal.getTime();
		SimpleDateFormat date_format = new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
		String pubdate = date_format.format(creationDate);		
		return new Feed(title, link, description, language, copyright, pubdate);
	}
}

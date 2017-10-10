package edu.uci.ics.crawler4j.crawler;

import edu.uci.ics.crawler4j.url.WebURL;

/**
 * If the CrawlController class's custom data class implements this interface,
 * then it is called when a url is denied by a site's robot.txt file.
 * 
 * 
 * @author John Slankas
 *
 */
public interface RobotsDenyNotice {

	/**
	 * Notifies an object that the url was denied by the robots.txt file.
	 * 
	 * @param webUrl the URL denied by the robots.txt file
	 * @param asSeed set to true if the denial was in setting a seed.
	 */
	public void urlDeniedByRobotsTxt(WebURL webUrl, boolean asSeed);
}

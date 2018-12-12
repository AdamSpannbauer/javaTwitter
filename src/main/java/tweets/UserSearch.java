package tweets;

import java.util.*;
import twitter4j.*;
import twitter4j.conf.*;

public class UserSearch {
  String user;
  List<Status> statuses = new ArrayList();
  ConfigurationBuilder cb = new ConfigurationBuilder();
  
  public UserSearch(String usr) {
    user = usr;

    // replace with your app's keys
    cb.setOAuthConsumerKey("consumerKey");
    cb.setOAuthConsumerSecret("consumerSecret");
    cb.setOAuthAccessToken("accessToken");
    cb.setOAuthAccessTokenSecret("accessTokenSecret");
  }

  public void getTimeline() {
    try {
      Twitter twitter = new TwitterFactory(cb.build()).getInstance();
      statuses = twitter.getUserTimeline(user);
    } catch (TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get timeline: " + te.getMessage());
      System.exit(-1);
    }
  }

  public void printTweets() {
    for (Status status : statuses) {
      System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
    }
  }
}

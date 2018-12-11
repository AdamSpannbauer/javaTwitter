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

    // should've kept these keys/secrets actually secret... but oh well
    cb.setOAuthConsumerKey("mnIP2MrZr12QrWXdv6BEA4NLs");
    cb.setOAuthConsumerSecret("ZxTYwVbvpCpMl7hyU02Cwvz6TTa7zhCORG2A5BWAnMcr7plfPX");
    cb.setOAuthAccessToken("598738534-h3VS7RZjLwQ9jghuuBanL9QOPirdDnMkx8hejujn");
    cb.setOAuthAccessTokenSecret("ndmOEdHOPavV90m6avmiw8Vywp8HE6C8uacBL5nM9F7kt");
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

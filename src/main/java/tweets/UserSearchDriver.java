package tweets;

public class UserSearchDriver {

    public static void main(String[] args) {
    	String user;

    	if (args.length == 1) {
    		user = args[0];
    	} else {
    		user = "madflavor";
    		System.out.println("No user provided; defaulting to @madflavor.");
    	}

        UserSearch userSearch = new UserSearch(user);
        userSearch.getTimeline();
        userSearch.printTweets();
    }
}

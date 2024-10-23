package part3;

public class NewsChannel implements Observer {
    private String channelName;
    private String news;
    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }
    @Override
    public void update(String news) {
        this.news = news;
        System.out.println(channelName + " received: " + this.news);
    }
}
package part3;

public class ObserverShowcase {
    public void showcase() {
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("BBC");
        NewsChannel channel2 = new NewsChannel("CNN");

        System.out.println("Adding news channels: BBC, CNN ");
        agency.addObserver(channel1);
        agency.addObserver(channel2);

        System.out.println("Notification: ");
        agency.setNews("The first news");


        System.out.println("Notification: ");
        agency.setNews("The second news");

        System.out.println("Deleting a news channel: CNN");
        agency.removeObserver(channel2);
    }
}
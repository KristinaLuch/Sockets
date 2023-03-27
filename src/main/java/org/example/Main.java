package org.example;

public class Main {
    private static final Client client = new Client();
    private static final WatcherForBlackIp watcherForBlackIp = new WatcherForBlackIp();

    public static void main(String[] args) {
        Thread watch = new Thread(watcherForBlackIp);
        Thread server = new Thread(watcherForBlackIp.getServer());
        Thread myClient = new Thread(client);
        watch.start();
        server.start();
        myClient.start();
    }

}
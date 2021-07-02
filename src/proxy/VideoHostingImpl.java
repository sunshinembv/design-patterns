package proxy;

import java.util.HashMap;

public class VideoHostingImpl implements VideoHosting {
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("https://www.videohosting.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("https://www.videohosting.com/" + videoId);
        return getSomeVideos(videoId);
    }

    //simulate network activity

    private int random(int min, int max) {
        return min + (int) (Math.random() * (max - min) + 1);
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.println("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> videoMap = new HashMap<>();
        videoMap.put("key1", new Video("1", "Video1"));
        videoMap.put("key2", new Video("2", "Video2"));
        videoMap.put("key3", new Video("3", "Video3"));
        videoMap.put("key4", new Video("4", "Video4"));
        videoMap.put("key5", new Video("5", "Video5"));

        System.out.println("Done!" + "\n");
        return videoMap;
    }

    private Video getSomeVideos(String videoId) {
        System.out.println("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Done!" + "\n");
        return video;
    }
}

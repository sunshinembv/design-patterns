package proxy;

import java.util.HashMap;

public interface VideoHosting {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}

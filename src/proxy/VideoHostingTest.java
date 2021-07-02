package proxy;

public class VideoHostingTest {
    public static void main(String[] args) {
        VideoDownloader naiveDownloader = new VideoDownloader(new VideoHostingImpl());
        VideoDownloader smartDownloader = new VideoDownloader(new VideoHostingCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(VideoDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("key1");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("key2");

        downloader.renderVideoPage("key1");
        downloader.renderVideoPage("key3");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms/n");
        return estimatedTime;
    }
}

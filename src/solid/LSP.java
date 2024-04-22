package solid;

public class LSP {

}

class Video {
    private String title;
    private String category;

    public void play() {
        // Play the video
    }

    public void playAd() {
        // Play the ad
    }
}

class VideoWithoutAds extends Video {
    public void play() {
        // Play the video
    }

    // Violates Liskov Substitution Principle as it does not support playing ads
    public void playAd() {
        throw new UnsupportedOperationException("This video does not support playing ads");
    }
}

// using composition to avoid violating Liskov Substitution Principle
class VideoManager {
    String title;
    String category;

    void play() {
        // Play the video
    }

    void playAd() {
        // Play the ad
    }
}

class VideoWithManager {
    public VideoManager manager;

    void play() {
        manager.play();
    }

    void playAd() {
        manager.playAd();
    }
}


// cherry picking methods to avoid violating Liskov Substitution Principle
class PremiumVideoWithManager {
    public VideoManager manager;

    void play() {
        manager.play();
    }
}



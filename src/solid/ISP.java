package solid;

public class ISP {
    public static void main(String[] args) {
        ISPVideo video = new ISPVideo();
        video.play();
        video.playAd();

        ISPPremiumVideo premiumVideo = new ISPPremiumVideo();
        premiumVideo.play();
    }
}

interface IVideo {
    void play();
    void pause();
    void rewind();
    void fastForward();
}

interface IAd {
    void playAd();
    void skipAd();
}

class ISPVideo implements IVideo, IAd {
    public void play() {
        // Play the video
    }

    public void pause() {
        // Pause the video
    }

    public void rewind() {
        // Rewind the video
    }

    public void fastForward() {
        // Fast forward the video
    }

    public void playAd() {
        // Play the ad
    }

    public void skipAd() {
        // Skip the ad
    }
}

class ISPPremiumVideo implements IVideo {
    public void play() {
        // Play the video
    }

    public void pause() {
        // Pause the video
    }

    public void rewind() {
        // Rewind the video
    }

    public void fastForward() {
        // Fast forward the video
    }
}
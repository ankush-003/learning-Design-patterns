package structuraldp;

import java.util.List;

public class ProxyPattern {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("abc.com");
        internet.connectTo("def.com");
        internet.connectTo("ghi.com");
        internet.connectTo("jkl.com");
    }
}

interface Internet {
    void connectTo(String serverHost);
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}

class ProxyInternet implements Internet {
    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = List.of("abc.com", "def.com", "ghi.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost)) {
            System.out.println("Access Denied");
            return;
        }
        internet.connectTo(serverHost);
    }
}


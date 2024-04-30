package structuraldp;

public class AdapterPattern {
    public static void main(String[] args) {
        IMultiRestoApp zomatoApp = new ZomatoApp();
        zomatoApp.displayMenus("xmlData");
        zomatoApp.displayRecommendations("xmlData");

        FancyUIService fancyUIService = new FancyUIService();
        IMultiRestoApp fancyUIAdapter = new FancyUIAdapter(fancyUIService);
        fancyUIAdapter.displayMenus("xmlData");
        fancyUIAdapter.displayRecommendations("xmlData");

    }
}

interface IMultiRestoApp {
    void displayMenus(String xmlData);
    void displayRecommendations(String xmlData);
}

class ZomatoApp implements IMultiRestoApp {
    @Override
    public void displayMenus(String xmlData) {
        System.out.println("Displaying menus in Zomato app");
    }

    @Override
    public void displayRecommendations(String xmlData) {
        System.out.println("Displaying recommendations in Zomato app");
    }
}

// we have a new requirement to display the data in a fancy UI, but is not compatible with the existing code
class FancyUIService {
    public void displayFancyUI(String jsonData) {
        System.out.println("Displaying fancy UI");
    }

    public void displayFancyRecommendations(String jsonData) {
        System.out.println("Displaying fancy recommendations");
    }
}

// using adapter pattern to make the new code compatible with the existing code
class FancyUIAdapter implements IMultiRestoApp {
    private FancyUIService fancyUIService;

    public FancyUIAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenus(String xmlData) {
        // convert xml to json
        String jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayFancyUI(jsonData);
    }

    @Override
    public void displayRecommendations(String xmlData) {
        // convert xml to json
        String jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayFancyRecommendations(jsonData);
    }

    private String convertXmlToJson(String xmlData) {
        System.out.println("Converting XML to JSON");
        return "json";
    }
}

// class adapter
interface IAdaptee {
    void display(String data);
}

class FancyUIAdapter2 implements IAdaptee, IMultiRestoApp {
    public void display(String data) {
        System.out.println("Displaying fancy UI");
    }

    public void displayMenus(String xmlData) {
        // convert xml to json
        String jsonData = convertXmlToJson(xmlData);
        display(jsonData);
    }

    public void displayRecommendations(String xmlData) {
        // convert xml to json
        String jsonData = convertXmlToJson(xmlData);
        display(jsonData);
    }

    private String convertXmlToJson(String xmlData) {
        System.out.println("Converting XML to JSON");
        return "json";
    }
}


package SingletonPattern;

public class Browser {
    // 1. private static instance of the class
    private volatile static Browser browser;

    //2. Private constructor to parent/avoid instantiation/object
    private Browser() {
    };

    // 3. Public static getInstance method to provide access to the instance/object
    public static Browser getInstance() {
        if (browser == null) {
            synchronized (Browser.class) {
                if (browser == null) {
                    browser = new Browser();
                }
            }
        }
        return browser;
    }

    //4. Individual public method of the class
    public void displayMesg() {
        System.out.println("Browser info");
    }
}

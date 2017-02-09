package inheritancepractice;

/**
 *
 * @author Tatum Thomas
 */
public class Macbook extends Laptop{
    private String macOSVersion;
    private boolean retinaDisplay;
    
    public void loadMacOperatingSystem() {
        System.out.println("Macbook has loaded Mac OS.");
    }
}

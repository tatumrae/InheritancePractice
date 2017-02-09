package inheritancepractice;

/**
 *
 * @author Tatum Thomas
 */
public class Laptop extends Computer{
    private double screenSize;
    private boolean keyboard;
    
    public void bePortable() {
        System.out.println("Laptop is now portable.");
    }
}

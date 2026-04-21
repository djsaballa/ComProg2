package practical2026;

public class Laptop extends Device{
	private int pin;

    public Laptop(String brand, String model, int pin) {
        super(brand, model);
        this.pin = pin;
    }

    @Override
    public void turnOn() {
        super.isOn = true;
        System.out.println("Laptop opening to lockscreen.");
    }

    // Overloaded turnOn method
    public void turnOn(int password) {
        if (password == this.pin) {
            super.isOn = true;
            System.out.println("Access Granted. Welcome back!");
        } else {
            System.out.println("Incorrect PIN. System remains locked.");
        }
    }

}

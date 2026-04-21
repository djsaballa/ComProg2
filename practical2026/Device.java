package practical2026;

public class Device {
	private String brand;
    private String model;
    protected boolean isOn;

    // Constructor with parameters
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOn = false; // Default state
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Device is starting.");
    }

    public void displayPowerStatus() {
        if (this.isOn) {
            System.out.println(brand + " " + model + " is currently: Powered ON");
        } else {
            System.out.println(brand + " " + model + " is currently: Powered OFF");
        }
    }

}

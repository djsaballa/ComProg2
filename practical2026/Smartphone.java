package practical2026;

public class Smartphone extends Device{
	private int batteryPercentage = 100;

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        super.isOn = true;
        System.out.println("Smartphone screen lighting up.");
    }

    public void sendText(String message) {
        this.batteryPercentage -= 1;
        System.out.println("Sending message: " + message + ". Battery now at " + batteryPercentage + "%.");
    }

}

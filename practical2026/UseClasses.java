package practical2026;

public class UseClasses {

	public static void main(String[] args) {
		
		System.out.println("--- Testing Device (Parent) ---");
        Device genericDevice = new Device("Generic", "X100");
        genericDevice.displayPowerStatus();
        genericDevice.turnOn();
        genericDevice.displayPowerStatus();

        System.out.println("\n--- Testing Smartphone (Child) ---");
        Smartphone myPhone = new Smartphone("Apple", "iPhone 15");
        myPhone.displayPowerStatus(); // Inherited method
        myPhone.turnOn();             // Overridden method
        myPhone.sendText("Hello, how are you?"); // Unique method
        myPhone.displayPowerStatus();

        System.out.println("\n--- Testing Laptop (Child) ---");
        Laptop myLaptop = new Laptop("Dell", "XPS 13", 1234);
        myLaptop.displayPowerStatus(); // Inherited method
        
        System.out.print("Standard Power On: ");
        myLaptop.turnOn();             // Overridden method
        
        System.out.print("Login Attempt 1 (Wrong PIN): ");
        myLaptop.turnOn(0000);         // Overloaded method (Fail)
        
        System.out.print("Login Attempt 2 (Right PIN): ");
        myLaptop.turnOn(1234);         // Overloaded method (Success)
        
        myLaptop.displayPowerStatus(); // Inherited method

	}

}

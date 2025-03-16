// Superclass
class Device {
    // Class attributes
    protected String deviceId;
    protected String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        setStatus(status);
    }

    // Method to check device status
    public void setStatus(String status) {
        if(status.equalsIgnoreCase("On") || status.equalsIgnoreCase("Off")) {
            this.status = status;
        }
        else {
            this.status = "Off";
        }
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device Id: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    // Class attributes
    private int temperatureSetting;

    // Subclass constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Calling superclass constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display thermostat status
    @Override
    public void displayStatus() {
        // Calling superclass displayStatus() method
        super.setStatus(status);
        if (status.equalsIgnoreCase("On")) {
            System.out.println("Temperature Setting: " + temperatureSetting + " degrees Celsius");
        }
        else {
            System.out.println("Thermostat is currently Off");
        }
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Device("AB-123", "On");
        System.out.println("Device Details:");
        device.displayStatus();

        Thermostat thermostat = new Thermostat("AC-123", "On", 34);
        System.out.println("Thermostat Status:");
        thermostat.displayStatus();
    }
}

/*
Output:
    Device Details:
    Device Id: AB-123
    Status: On
    Thermostat Status:
    Temperature Setting: 34 degrees Celsius
 */
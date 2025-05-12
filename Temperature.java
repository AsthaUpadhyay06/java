public class Temperature {
    private double celsius;

    // Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter method to convert Celsius to Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // Getter method for Celsius
    public double getCelsius() {
        return celsius;
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature(25); // Example temperature in Celsius
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.getFahrenheit());
    }
}
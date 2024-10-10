// Payment.java
interface Payment {
    void pay(double amount);
}

// Online.java
class Online implements Payment { 
    private String email;
    private String password;

    public Online(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println("Paid using online account: " + amount); 
    }
}

// Mobile.java
class Mobile implements Payment {
    private String number;
    private int pin;
    
    public Mobile(String number, int pin) {
        this.number = number;
        this.pin = pin;
    }

    public void pay(double amount) {
        System.out.println("Paid using mobile account: " + amount);
    }
}

// Cart.java
class Cart {
    private double amount;

    public Cart(double amount) {
        this.amount = amount;
    }

    public void pay(Payment mode) {
        mode.pay(amount);
    }
}

// TestStrategy.java
public class TestStrategy {
    public static void main(String[] args) {
        Cart cart = new Cart(1512.75);
        cart.pay(new Online("septimojhonrealluis@gmail.com", "septimo17"));

        cart = new Cart(375.25);
        cart.pay(new Mobile("09958226162", 1234));
    }
}
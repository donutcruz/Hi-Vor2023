package vinnsla;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vidskiptavinur {
    private StringProperty username = new SimpleStringProperty();
    private StringProperty password = new SimpleStringProperty();

    // Default constructor for the user who is not logged in
    public Vidskiptavinur() {
        this.username.set("");
        this.password.set("");
    }

    // Constructor for the logged-in user
    public Vidskiptavinur(String username, String password) {
        this.username.set(username);
        this.password.set(password);
    }

    // Getters and setters for the username and password fields
    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return password;
    }


    // A default Vidskiptavinur object for the logged-in user
    public static Vidskiptavinur getDefaultUser() {
        return new Vidskiptavinur("Donna", "lover11");
    }
}

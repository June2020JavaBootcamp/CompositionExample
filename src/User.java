import java.util.ArrayList;

public class User extends Person {   // User IS-A Person
    private boolean active;
    private ArrayList<Order> orders;            // User HAS-An Order

    public User() {
    }

    public User(boolean active, ArrayList<Order> orders) {
        this.active = active;
        this.orders = orders;
    }

    public User(String name, String email){
        this.setName(name);
        this.setEmail(email);
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String toString(){
        //return super.toString() + "Active=" + this.active + " Orders=" + this.orders + "\n";
        String msg;
        msg = "User Info:\n" + super.toString() + "Active=" + this.active + " Orders=\n";
        for (Order item : this.orders)
            msg += item.toString() + "\n";

        return msg;
    }

}

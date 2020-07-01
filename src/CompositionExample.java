import java.util.ArrayList;

public class CompositionExample {
    public static void main(String args[]){
        User user = new User("Sue", "sue@domain.com");
        user.setActive(true);
//        user.setName("Sue");
//        user.setEmail("sue@domain.com");

        Order order = new Order("book", 1, 19.99);
        Order order1 = new Order("Software", 1, 99.99);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(order1);

        user.setOrders(orders);
        System.out.println("==================");
        System.out.println(user.toString());

        Customer customer = new Customer();
        Person person = new Person("Foo", "foo@domain.com");
        customer.setPersonInfo(person);
        customer.setOrders(order);

        System.out.println("*********************");
        System.out.println(customer.toString());
    }
}

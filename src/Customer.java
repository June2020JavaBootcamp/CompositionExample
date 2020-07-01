public class Customer {
    Person personInfo;   // Customer HAS-A Person
    Order orders;        // Customer HAS-An Order

    public Customer(){}

    public Person getPersonInfo() {
        return this.personInfo;
    }

    public void setPersonInfo(Person person){
        this.personInfo = person;
    }

    public Order getOrders() {
        return this.orders;
    }

    public void setOrders(Order order) {
        this.orders = order;
    }

    public String toString() {
        return "Customer!!!!\nPerson Info:" + this.personInfo + "Order Info:" + this.orders + "----\n";
    }
}

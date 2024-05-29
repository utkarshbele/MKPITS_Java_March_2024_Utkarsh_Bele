public class Customer implements User {
    private String name;

    public Customer(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

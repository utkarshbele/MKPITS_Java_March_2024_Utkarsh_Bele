package platform;

public class Cart {
    private String p_quantity,p_id, p_name, delete, total_amount, total_items;
    public Cart()
    {
        p_name="Lava Mobile N95";
        p_id="sd87445";
        //...
    }

    public String getP_id() {
        return p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public String getP_quantity() {
        return p_quantity;
    }

    public String getDelete() {
        return delete;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
    //setters as well
}

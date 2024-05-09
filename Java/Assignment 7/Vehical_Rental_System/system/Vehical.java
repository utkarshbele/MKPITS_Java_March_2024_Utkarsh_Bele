package system;

public class Vehical {
    private String make, model, year,brand, type;

    public Vehical()
    {
        make="2018";
        model="Model S Plaid";
        year="2021";
        brand="Tesla";
        type="Sedan";
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}

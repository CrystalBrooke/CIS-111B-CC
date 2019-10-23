package crystal.smith.cis111b;

public class AECars implements Comparable<AECars>
{
    //Fields
    private double price = 0.00;
    protected String fuelSource = "";
    private String manufacturer = "";
    private String modelName = "";

    //Constructor
    /**
    *Constructor for AECars Class
     * @param manufacturer The make of the Alt Energy Car.
     * @param modelName The model of the Alt Energy Car.
    */
    public AECars (String man, String mod)
    {
        manufacturer = man;
        modelName = mod;
    }

    //Setters for all data fields
    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setFuelSource(String fuelSource)
    {
        this.fuelSource = fuelSource;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    //Getters for all data fields
    public double getPrice()
    {
        return price;
    }

    public String getFuelSource()
    {
        return fuelSource;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getModelName()
    {
        return modelName;
    }

    //toString replacing Super toString
    @Override
    public String toString()
    {
        return manufacturer + " " + modelName + " has a fuel source of " + fuelSource + " and a price of $" + price;
    }

    //compareTo method required when making class comparable
    /**
     * compareTo method to replace Super compareTo. Will return comparison of prices.
     * @param aeCars AECars object to be compared.
     * @return int 1, 0, or -1 to compare.
     */
    @Override
    public int compareTo(AECars aeCars)
    {
        if (this.price > aeCars.getPrice())
        {
            return 1;
        }
        else if (this.price < aeCars.getPrice())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
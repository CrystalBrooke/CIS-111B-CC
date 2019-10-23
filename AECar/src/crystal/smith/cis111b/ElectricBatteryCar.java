package crystal.smith.cis111b;

public abstract class ElectricBatteryCar extends AECars
{
    //Electric Car data
    private int rangeInMiles = 0;

    //Constructor
    /**
     * Constructor to call constructor from super class and pass manufacturer and modelName and add fuel source.
     * @param man To hold make of electric car.
     * @Param mod To hold model name of electric car.
     */
    public ElectricBatteryCar (String man, String mod)
    {
        super(man, mod);
        fuelSource = "electric battery";
    }

    //Setter for range
    public void setRangeInMiles(int rangeInMiles)
    {
        this.rangeInMiles = rangeInMiles;
    }

    //Getter for range
    public int getRangeInMiles()
    {
        return rangeInMiles;
    }

    //Battery Charge Method stub set to full battery
    public int batteryCharge()
    {
        return 100;
    }
}

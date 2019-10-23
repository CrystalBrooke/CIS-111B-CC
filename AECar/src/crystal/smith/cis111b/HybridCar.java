package crystal.smith.cis111b;

public abstract class HybridCar extends AECars
{
    //Hybrid Car fields
    private int gasMilageMPG = 0;

    //Constructor
    /**
     * Constructor to call constructor from super class and add fuel source info.
     * @param man To hold make of hybrid car.
     * @param mod To hold model name of hybrid car.
     */
    public HybridCar(String man, String mod)
    {
        super(man, mod);
        fuelSource = "gas and battery";
    }

    //Setter for gas Milage
    public void setGasMilageMPG(int gasMilageMPG)
    {
        this.gasMilageMPG = gasMilageMPG;
    }

    //Gas Milage method
    public int getGasMilageMPG()
    {
        return gasMilageMPG;
    }

    //Add fuel method set to full gas tank.
    public int addFuel()
    {
        return 100;
    }

    //Battery Charge Method stub set to full battery
    public int batteryCharge()
    {
        return 100;
    }
}

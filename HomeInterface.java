public class HomeInterface
{
    private HomeService light, tv, aircon;


    public HomeInterface(HomeService light, HomeService tv, HomeService aircon)
    {
        this.light = light;
        this.tv = tv;
        this.aircon = aircon;
    }
    
    public void turnOnAll()
    {
        light.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }

    public void turnOffAll()
    {
        light.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
}
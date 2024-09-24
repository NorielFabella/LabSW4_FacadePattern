public class HomeApp
{
    public static void main(String[] args)
    {
        Light light = new Light();
        TV tv = new TV();
        AirConditioning aircon = new AirConditioning();
        HomeInterface HomeFacade = new HomeInterface(light, tv, aircon);

        HomeFacade.turnOnAll();
        HomeFacade.turnOffAll();
    }
}
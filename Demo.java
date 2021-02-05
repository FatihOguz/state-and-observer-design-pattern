/**
 * demo class
 * dynamically shows the duration of lights on according to traffic conditions
 */
public class Demo {
    /**
     * main class
     * @param args command A.L
     */
    public static void main(String[] args){
        HiTech hiTech = new HiTech();
        TrafficLight trafficLight = new TrafficLight(hiTech);
        hiTech.registerObserver(trafficLight);
        trafficLight.Start(9);
        hiTech.changeDetected(true);
        trafficLight.Start(9);
        hiTech.changeDetected(false);
        trafficLight.Start(5);
        hiTech.changeDetected(true);
        trafficLight.Start(3);
        hiTech.changeDetected(false);
        trafficLight.Start(2);
    }
}

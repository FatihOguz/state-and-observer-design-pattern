/**
 * red state implements State interface
 */
public class RedState implements State{
    /**
     * trafficLight reference for state pattern
     */
    private TrafficLight trafficLight;
    /**
     * switch second
     */
    private int Second;
    /**
     * state name
     */
    private String name="Red Light";
    /**
     * constructor
     * @param trafficLight is trafficLight reference for state pattern
     * @param second is that switching second
     */
    public RedState(TrafficLight trafficLight,int second){
        this.trafficLight = trafficLight;
        this.Second=second;
    }
    /**
     * get second
     * @return second
     */
    @Override
    public int getSecond() {
        return this.Second;
    }
    /**
     * update switching second
     * @param second is second for switch light
     */
    @Override
    public void setSecond(int second) {
        this.Second=second;
    }
    /**
     * switch operation
     * @param second is second
     */
    @Override
    public void Switch(int second) {

        System.out.println(this.name + "  turns on for " + second + " seconds");

        trafficLight.setState(trafficLight.getGreenState());
    }

}

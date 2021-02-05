/**
 * observable interface for trafficLight system
 */
public interface Observer {
    /**
     * green light changes according to the traffic situation
     * @param second 60 or 90 seconds for green light
     */
    void update(int second);
}

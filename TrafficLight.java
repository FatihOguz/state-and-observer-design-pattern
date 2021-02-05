/**
 * traffic light system implements Observer interface
 * because update green lights when HiTech class notify changed
 */
public class TrafficLight implements Observer {
    /**
     * red state
     */
    private State RedState;
    /**
     * yellow state
     */
    private State YellowState;
    /**
     * green state
     */
    private State GreenState;
    /**
     * HiTech reference for observer
     */
    private Subject HiTech;
    /**
     * current state reference
     */
    private State state ;

    /**
     *
     * constructor
     * @param HiTech  reference for observer
     */
    public TrafficLight(Subject HiTech){
        this.HiTech=HiTech;
        RedState = new RedState(this,15);
        YellowState = new YellowState(this,3);
        GreenState = new GreenState(this,60);
        state = RedState;
    }

    /**
     * get state
     * @return current State
     */
    protected State getState() {
        return state;
    }

    /**
     * get red state
     * @return red state
     */
    protected State getRedState() {
        return RedState;
    }

    /**
     * set red state
     * @param redState red state
     */
    protected void setRedState(State redState) {
        RedState = redState;
    }
    /**
     * get yellow state
     * @return yellow state
     */
    protected State getYellowState() {
        return YellowState;
    }
    /**
     * set yellow state
     * @param yellowState yellow state
     */
    protected void setYellowState(State yellowState) {
        YellowState = yellowState;
    }
    /**
     * get green state
     * @return green state
     */
    protected State getGreenState() {
        return GreenState;
    }
    /**
     * set green state
     * @param greenState green state
     */
    protected void setGreenState(State greenState) {
        GreenState = greenState;
    }

    /**
     * set current state
     * @param state is current state
     */
    protected void setState(State state) {
        this.state = state;
    }

    /**
     * swwitch light
     * @param second is switching light
     * @param LoopSize is size of (red yellow green)
     */
    protected void Switch(int second,int LoopSize) {
       for(int i=0;i<LoopSize;i++)
        state.Switch(state.getSecond());
    }

    /**
     * start traffic light system
     * @param loopSize is size of (red yellow green)
     */
    public void Start(int loopSize){
        Switch(3,loopSize);
    }

    /**
     * update green light time
     * @param second 60 or 90 seconds for green light
     */
    @Override
    public void update(int second) {
        GreenState.setSecond(second);
    }
}

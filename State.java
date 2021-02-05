/**
 * define states methods
 */
public interface State {

    /**
     * switch light
     * @param second is second
     */
    void Switch(int second);

    /**
     * get second
     * @return integer
     */
    int getSecond();

    /**
     * set second
     * @param second is second for switch light
     */
    void setSecond(int second);
}

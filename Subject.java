/**
 * define subject methods
 *
 */
public interface Subject {
    /**
     * register observer
     * @param o observer class
     */
    void registerObserver(Object o);

    /**
     * remove observer
     * @param o observer class
     */
    void removeObserver(Object o);

    /**
     * notify observers for  traffic situation
     * @param flag is that
     * if flag is true, it means the traffic has increased substantially,
     * otherwise (if false), everything is normal,
     */
    void notifyObserver(boolean flag);
}

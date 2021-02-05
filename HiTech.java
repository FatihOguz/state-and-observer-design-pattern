import java.util.ArrayList;

/**
 * subject class is implements subject interface
 */
public class HiTech implements Subject{
    /**
     * holds observers
     */
    private ArrayList observers;

    /**
     * constructor
     */
    public HiTech(){
        observers=new ArrayList();
    }

    /**
     * register observer
     * @param o observer class
     */
    @Override
    public void registerObserver(Object o ) {
        observers.add(o);

    }

    /**
     * remove observer
     * @param o observer class
     */
    @Override
    public void removeObserver(Object o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }

    }

    /**
     * notify observer
     * @param flag is that
     * if flag is true, it means the traffic has increased substantially,
     *             otherwise (if false), everything is normal,
     */
    @Override
    public void notifyObserver(boolean flag) {
            for(int i=0;i<observers.size();i++){
                Observer observer = (Observer) observers.get(i);
                if(flag==true)
                     observer.update(90);
                else
                    observer.update(60);
           }
    }


    /**
     *  change detected
     *  if flag is true, it means the traffic has increased substantially,
     *                otherwise (if false), everything is normal,
     * @param flag is boolean for 90 seconds or 60 seconds time for green lights
     *              is there traffic?
     */
    public void changeDetected(boolean flag){
        notifyObserver(flag);
    }
}

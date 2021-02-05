# state-and-observer-design-pattern


Question:
There is a traffic light on the way to campus. It has three states (initially
RED):
a) RED: switches to GREEN after 15 seconds.
b) YELLOW: switches to RED after 3 seconds.
c) GREEN: switches to YELLOW after 60 seconds (timeout_X).
Draw the state diagram of this traffic light.Draw the class diagram and implement in Java this state diagram using the state design pattern.
Make sure you have a main method where you illustrate every state and every transition with text
outputs on the terminal.
The traffic department has noticed that the roads surrounding the campus are getting sometimes
overwhelmed with traffic due to unexpected events. And the situation is getting worse as they have
to wait at this traffic light. That is why they have installed a MOBESE camera on top of the traffic
light that measures the amount of cars under it. When it detects a lot of traffic timeout_X is
increased from 60 to 90 seconds.
More specifically, whenever the camera detects a change of traffic the method changeDetected of
the class HiTech (provided by the software library of the camera) is called automagically by the
hardware:
public class HiTech{
public void changeDetected(boolean flag){
// ????
}
}
if flag is true, it means the traffic has increased substantially, otherwise (if false), everything is
normal, so timeout_X returns to its initial value. It is up to you to fill the method.
Implement this new component into your existing traffic light code, using the Observer design
pattern and redraw the class diagram. Make sure your traffic light subscribes to the camera’s
software to receive updates on traffic, and set its timeout accordingly. Your main method should
illustrate its functionality.




report:


Only HiTech class reference and update method have been added to the traffic lights class.
Status classes and other methods of the traffic light class remained unchanged.
When the system is the burning of the colors that progress in a regular order for certain periods, a class
is assigned for each color.
With a state reference in the system for instant class information, these states are implemented by
assigning their actions to this reference consecutively.
If a new situation arises, a class that implements the state interface can be created in it and the system
can continue to work over this state reference.An observer design pattern was created in order to provide news flow to the system through the HiTech
class, which informs the traffic situation when the green light duration is desired to change in case of
traffic.
In this pattern, while the HiTech class is subject, the traffic system is in the observer state.
When the traffic increases, the green light time changes with the news from the subject.
Thanks to the observer design pattern, the traffic lights in front of the campus have been made suitable
for control in other spaces.

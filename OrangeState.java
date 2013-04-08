package cz.cvut.fel.cs.ass.state;

/**
 *
 * @author Michal Vlcek <vlcekmi3@fel.cvut.cz>
 */
public class OrangeState extends State {
    public static int time = 1;
    public int times = 0;
    public static boolean red = true;

    public OrangeState() {
        System.out.println("ORANGE");
    }

    @Override
    public void change(Semaphore s) {
        times++;
        if(times >= time) {
            if(red) {
                s.setState(new GreenState());
            } else {
                s.setState(new RedState());
            }
            red = !red;
        } else {
            System.out.println("Remain: "+ (time-times));
        }
    }
    
}

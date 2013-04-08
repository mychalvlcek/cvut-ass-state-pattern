package cz.cvut.fel.cs.ass.state;

/**
 *
 * @author Michal Vlcek <vlcekmi3@fel.cvut.cz>
 */
public class GreenState extends State {
    public static int time = 4;
    public int times = 0;

    public GreenState() {
        System.out.println("GREEN");
    }

    @Override
    public void change(Semaphore s) {
        times++;
        if(times >= time) {
            s.setState(new OrangeState());
        } else {
            System.out.println("Remain: "+ (time-times));
        }
    }
    
}

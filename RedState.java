package cz.cvut.fel.cs.ass.state;

/**
 *
 * @author Michal Vlcek <vlcekmi3@fel.cvut.cz>
 */
public class RedState extends State {
    public static int time = 5;
    public int times = 0;

    public RedState() {
        System.out.println("RED");
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

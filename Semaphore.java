package cz.cvut.fel.cs.ass.state;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Semaphore - State pattern
 * @author Michal Vlcek <vlcekmi3@fel.cvut.cz>
 */
public class Semaphore extends TimerTask {
    private State state;

    public Semaphore() {
        this.state = new RedState();
    }
    
    @Override
    public void run() {
        this.state.change(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public static void main(String[] args) {
        Timer timer = new Timer();
        Semaphore s = new Semaphore();
 
        timer.schedule(s, 0, 1000);
    }

}

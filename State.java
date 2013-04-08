package cz.cvut.fel.cs.ass.state;

/**
 *
 * @author Michal Vlcek <vlcekmi3@fel.cvut.cz>
 */
public abstract class State {
    
    public abstract void change(Semaphore s);
}

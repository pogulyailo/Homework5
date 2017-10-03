public class CarDoor {
    private boolean doorcondition;
    private boolean windowstate;

    public CarDoor

    {
        doorcondition = true;
        windowstate = true;
    }

    public CarDoor(boolean doorcondition, boolean windowstate) {
        this.doorcondition = doorcondition;
        this.windowstate = windowstate;
    }

    public boolean isDoorcondition() {
        return doorcondition;
    }

    public void setDoorcondition(boolean windowstate) {
        this.doorcondition = doorcondition;
    }

    public boolean isWindowstate() {
        return windowstate;
    }

    public void setWindowstate(boolean windowstate) {
        this.windowstate = windowstate;
    }
}

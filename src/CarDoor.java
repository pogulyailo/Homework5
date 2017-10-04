public class CarDoor {
    private boolean doorcondition;
    private boolean windowstate;

    public CarDoor()

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

    public boolean closeDoorcondition() {
        this.doorcondition = false;
        return doorcondition;
    }

    public boolean openDoorcondition() {
        this.doorcondition = true;
        return doorcondition;
    }

    public boolean changeDoorcondition() {
        if (this.doorcondition) {
            return this.doorcondition = false;
        } else {
            return this.doorcondition = true;
        }
    }

    public boolean closeWindow() {
        this.windowstate = false;
        return windowstate;
    }

    public boolean openWidow() {
        this.windowstate = true;
        return windowstate;
    }

    public boolean changeWindowstate() {
        if (this.windowstate) {
            return this.windowstate = false;
        } else {
            return this.windowstate = true;
        }
    }

}
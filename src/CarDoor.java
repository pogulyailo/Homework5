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
    public boolean getDoorcondition() {
        return doorcondition;
    }
    public void setDoorcondition(boolean doorcondition) {
        this.doorcondition = doorcondition;
    }
    public boolean getWindowstate() {
        return windowstate;
    }
    public void setWindowstate(boolean windowstate) {
        this.windowstate = windowstate;
    }
    public void closeDoorcondition() {
        this.doorcondition = false;

    }
    public void openDoorcondition() {
        this.doorcondition = true;

    }
    public void changeDoorcondition() {
        if (this.doorcondition) {
            this.doorcondition = false;
        } else {
            this.doorcondition = true;
        }
    }
    public void closeWindow() {
        this.windowstate = false;

    }

    public void openWidow() {
        this.windowstate = true;

    }
    public void changeWindowstate() {
        if (this.windowstate) {
            this.windowstate = false;
        } else {
            this.windowstate = true;
        }
    }
    public void show(){
        System.out.println(" door condition " + doorcondition);
        System.out.println(" window state " + windowstate);
    }
}
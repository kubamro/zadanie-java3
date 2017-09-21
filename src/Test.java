public class Test {
    public static void main(String[] args) {
        Televiso tv = new Televiso("Television","OFF");

        tv.showStatus();
        tv.turnOn();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();
    }
}




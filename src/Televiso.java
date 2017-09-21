public class Televiso {

    String television;
    String status;

    Televiso(String tv,String st){
        television = tv;
        status = st;

    }

    void showStatus(){
        System.out.println(television + " is " + status);
    }
    void turnOn(){
        status = "ON";
    }
    void turnOff(){
        status = "OFF";
    }
}

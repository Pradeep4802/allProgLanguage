
class Phone {
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class smartPhone extends Phone implements ICamera, IMusicPlayer{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
    public void click() { System.out.println("Smart Phone clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void pause() { System.out.println("Smart Phone pausing music"); }
    public void stop() { System.out.println("Smart Phone stoping music"); }
}

public class interfaceExample {
    public static void main(String[] args) {
        // smartPhone sp = new smartPhone();
        // Phone sp = new Phone();
        // ICamera sp = new smartPhone();
        IMusicPlayer sp = new smartPhone();
        // sp.call();
        // sp.click();
        // sp.play();
        // sp.click();
        sp.play();
    }
}
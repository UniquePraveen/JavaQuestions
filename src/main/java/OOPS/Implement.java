package OOPS;

public class Implement implements Interface {


    public void run() {
        System.out.println("Run");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void speedUp() {
        System.out.println("Speed Up");
    }

    public void slowDown() {
        System.out.println("Slow Down");
    }

    public static void main(String[] args) {

        Implement obj = new Implement();

        obj.run();
        obj.stop();
        obj.speedUp();
        obj.slowDown();

        Implement im = new Implement();

       


    }


}

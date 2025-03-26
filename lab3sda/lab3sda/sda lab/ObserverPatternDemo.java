package observerpatterndemo;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        //Create observers
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");	
        subject.setState(15); 

        //Detaching OctalObserver and BinaryObserver
        subject.detach(octalObserver);
        subject.detach(binaryObserver);
        System.out.println("OctalObserver and BinaryObserver detached");

        System.out.println("Second state change: 10");	
        subject.setState(10); // Only HexaObserver will receive this update

        //Re-attaching BinaryObserver
        subject.attach(binaryObserver);
        System.out.println("BinaryObserver re-attached");

        System.out.println("Third state change: 20");	
        subject.setState(20); // HexaObserver and BinaryObserver will receive this update
    }
}

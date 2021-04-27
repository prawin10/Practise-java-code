package abstraction;

abstract class Bank {
    abstract int getRateOfInterest();
}
 
class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}
 
class HDFC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}
 
class TestBank {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Interest is: " + b.getRateOfInterest() + " %");
        b = new HDFC();
        System.out.println("HDFC Interest is: " + b.getRateOfInterest() + " %");
    }
}
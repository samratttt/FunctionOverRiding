
// make a superclass

class Vechiles{
    //has a default constructor with no ars

    // a general method

    void engine(){
        System.out.println("This is a vechile engine! tada");
    }
}

// making a child class
class Bike extends Vechiles{

    // OverRiding the parent class method

    void engine(){
        System.out.println("This is bike engine! tada");
    }
}


public class Main {

    // decalring main method

    public static void main(String[] args){

        // creating object of vechile class
        Vechiles vechile = new Vechiles();
        vechile.engine();

        // creating object of bike class

        Bike bike = new Bike();
        bike.engine();
    }
}
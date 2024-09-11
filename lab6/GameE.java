// Base class
class Game {
    // Method in the base class
    void type() {
        System.out.println("Indoor & Outdoor games");
    }
}

// Subclass Cricket extending Game
class Cricket extends Game {
    // Overriding the type method
    @Override
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

// Subclass Chess extending Game
class Chess extends Game {
    // Overriding the type method
    @Override
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

// Main class to test Dynamic Method Dispatch
public class GameE {
    public static void main(String[] args) {
        // Reference of base class and object of base class
        Game g;

        // Referring to a Cricket object using the Game reference
        g = new Cricket();
        g.type();  // Cricket's type() is called

        // Referring to a Chess object using the Game reference
        g = new Chess();
        g.type();  // Chess's type() is called
    }
}



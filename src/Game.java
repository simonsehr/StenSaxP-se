public class Game {

    private int nbrOfRounds;

    Game(){
        System.out.println("Ett spel av [Sten, Sax, Påse] har Påbörjats");
    }

    public int getNbrOfRounds(){
        return nbrOfRounds;
    }

    public void setUpGame(int a){
        nbrOfRounds = a;
        System.out.println("Spelet är först till: " + nbrOfRounds + " rundor");
    }
    
}

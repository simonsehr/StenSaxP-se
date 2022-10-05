import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {

        //Skapar spelare
        Scanner scan = new Scanner(System.in);
        System.out.println("Välj användarnamn: ");
        String name = scan.next();
        Player cp = new ComputerPlayer("Computer");
        Player hp = new HumanPlayer(name);


        //Skapar ett spel
        System.out.println("Hur många rundor måste man vinna?");
        int rundor = scan.nextInt();
        Game game = new Game();
        game.setUpGame(rundor);
        WhoWon whoWon = new WhoWon();

        //Ska hålla reda på ställningen
        int hpPoints = 0;
        int cpPoints = 0;

        //Kör spelet tills någon vunnit
        while(whoWon.getHpPoints() < game.getNbrOfRounds() && whoWon.getCpPoints() < game.getNbrOfRounds()){
            //cp och hp välja sina drag
            String a = hp.StenSaxPåse();
            String b = cp.StenSaxPåse();

            //Tittar vem som vann omgången
            whoWon.gameLogic(a, b);
            
            //Tittar och skriver ut ställningen
            hpPoints = whoWon.getHpPoints();
            cpPoints = whoWon.getCpPoints();
            System.out.println("Ställnigen är: " + hp.getPlayerName() + ": " + hpPoints + 
            " - " + cp.getPlayerName() + ": " + cpPoints); 
        }

        if(hpPoints == rundor){
            System.out.println(hp.getPlayerName() + "har vunnit!");
        } else {
            System.out.println(cp.getPlayerName() + " har vunnit!");
        }


        scan.close();
 

    }

    
}

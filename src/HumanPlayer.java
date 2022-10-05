import java.util.Scanner;

public class HumanPlayer extends Player {


    HumanPlayer(String name){
        super(name);
    }

    public String StenSaxPåse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Välj Sten, Sax eller Påse");
        String a = scan.next();
        System.out.println("Du valde: " + a);
        return a;
    }
    
}

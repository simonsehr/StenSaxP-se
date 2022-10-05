import java.util.Random;

public class ComputerPlayer extends Player{

    public ComputerPlayer(String name){
        super(name);
        
    }

    public String StenSaxPåse(){
        Random rand = new Random();
        int a = rand.nextInt(3)+1;

        if(a == 1){
            System.out.println("Datorn valde: Sten");
            return "Sten";
        }
        else if (a == 2){
            System.out.println("Datorn valde: Sax");
            return "Sax";
        } 
        else {
            System.out.println("Datorn valde: Påse");
            return "Påse";
        }

    }
    
}

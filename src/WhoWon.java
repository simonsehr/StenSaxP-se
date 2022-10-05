public class WhoWon {

    private int hpPoints;
    private int cpPoints;

    WhoWon(){

    }

    public void gameLogic(String a, String b){
        //sten/sax
        if(a.equals("Sten") && b.equals("Sax")){
            hpPoints++;
            
        }
        //sten/påse
        else if(a.equals("Sten") && b.equals("Påse")){
            cpPoints++;
        }
        //sten/sten
        else if(a.equals("Sten") && b.equals("Sten")){
            System.out.println("Lika! Omgången spelas om.");
        }

        //sax/sten
        else if(a.equals("Sax") && b.equals("Sten")){
            cpPoints++;
        }
        //sax/påse
        else if(a.equals("Sax") && b.equals("Sax")){
            System.out.println("Lika! Omgången spelas om.");
        }
        //sax/sax
        else if(a.equals("Sax") && b.equals("Påse")){
            hpPoints++;
        }
        //påse/sten 11
        else if(a.equals("Påse") && b.equals("Sten")){
            hpPoints++;
        }
        //påse/sax
        else if(a.equals("Påse") && b.equals("Sax")){
            cpPoints++;
        }
        //påse/påse
        else if(a.equals("Påse") && b.equals("Påse")){
            System.out.println("Lika! Omgången spelas om.");
        }

    }

    public int getHpPoints(){
        return hpPoints;
    }

    public int getCpPoints(){
        return cpPoints;
    }
    
}

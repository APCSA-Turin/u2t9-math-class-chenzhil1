public class CoinFlip {
    public CoinFlip() {

    }

    public String Flip() {
        if((int)(Math.random() * 2) == 0){
            return "heads";
        }
        else{
            return "tails";
        }

    }

    public double Simulate(int numFlips) {
        int numHeads = 0;

        for(int i = 0; i < numFlips;){

            if(Flip().equals("heads")) {
                numHeads ++;
            }
        }
        double percentHeads = numHeads / numFlips;
        return percentHeads;
        
    }
}


package at.fhj.msd.swdesign.exercise.blockchain;

public class BlockChainApp {


    private CoinChain coinChain;
    private GradingChain gradingChain;


    public void setChain(CoinChain coinChain) {
        this.coinChain = coinChain;
    }

    public void setChain(GradingChain gradingChain) {
        this.gradingChain = gradingChain;
    }


    public void addBlock(CoinBlock coin) {
        if (this.coinChain != null) {
            coinChain.addBlock(coin);
        }
    }

    public void addBlock(GradingBlock grading) {
        if (this.gradingChain != null) {
            gradingChain.addBlock(grading);
        }
    }

    public void printOutput() {

        System.out.println("\n=====  Blockchain App  =====");

        if (this.coinChain != null) {
            coinChain.printChain();
            System.out.println("chain valid: " + coinChain.chainIsValid()+"\n");
        }
        if (this.gradingChain != null) {
            gradingChain.printChain();
            System.out.println("chain valid: " + gradingChain.chainIsValid() +"\n");

        }
    }


}

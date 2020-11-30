package at.fhj.msd.swdesign.exercise.blockchain;

public class BlockChainMain {

    public static void main(String[] args) {

        CoinBlock coin1 = new CoinBlock();
        coin1.performPayment("Elmar", "Michael", 50);

        CoinBlock coin2 = new CoinBlock();
        coin2.performPayment("Harald", "Andi", 100);
        CoinBlock coin3 = new CoinBlock();
        coin3.performPayment("Andi", "Elmar", 10);


        BlockChainApp blockChainApp = new BlockChainApp();

        blockChainApp.setChain( new CoinChain());
        blockChainApp.addBlock(coin1);
        blockChainApp.addBlock(coin2);


        GradingBlock gradingBlock = new GradingBlock();
        gradingBlock.doGrading("Elmar", "SWdesign", 2);
        GradingBlock gradingBlock2 = new GradingBlock();
        gradingBlock2.doGrading("Harald", "Scripting", 1);
        GradingBlock gradingBlock3 = new GradingBlock();
        gradingBlock2.doGrading("Andi", "Scrum", 1);


        blockChainApp.setChain( new GradingChain());
        blockChainApp.addBlock(gradingBlock);
        blockChainApp.addBlock(gradingBlock2);
        blockChainApp.addBlock(gradingBlock3);

        blockChainApp.printOutput();

    }
}

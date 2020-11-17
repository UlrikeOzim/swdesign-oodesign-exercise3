package at.fhj.msd.swdesign.exercise.blockchain;

public interface IBlockChain {

    void addBlock(CoinBlock coinBlock);

    void addBlock(GradingBlock gradingBlock);

    boolean chainIsValid();
}

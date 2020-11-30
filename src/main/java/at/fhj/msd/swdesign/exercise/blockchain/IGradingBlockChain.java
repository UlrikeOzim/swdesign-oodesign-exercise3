package at.fhj.msd.swdesign.exercise.blockchain;

public interface IGradingBlockChain extends IBlockChain{
    void addBlock(GradingBlock gradingBlock);
}

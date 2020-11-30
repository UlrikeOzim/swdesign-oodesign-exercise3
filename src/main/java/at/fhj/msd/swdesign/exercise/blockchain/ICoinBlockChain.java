package at.fhj.msd.swdesign.exercise.blockchain;

public interface ICoinBlockChain extends IBlockChain {
    void addBlock(CoinBlock coinBlock);
}

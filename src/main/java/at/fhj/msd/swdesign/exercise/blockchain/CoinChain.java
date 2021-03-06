package at.fhj.msd.swdesign.exercise.blockchain;

import java.util.ArrayList;
import java.util.List;

public class CoinChain implements ICoinBlockChain {

    private List<CoinBlock> coins;

    public CoinChain() {
        initBlock();
    }

    private void initBlock() {
        coins = new ArrayList<CoinBlock>();
        CoinBlock coinBlock = new CoinBlock();
        coinBlock.mineBlock(0);
        coins.add(coinBlock);
    }

    @Override
    public int getLastHash() {
        int lasthash = 0;

        if (coins.size() > 0) {
            lasthash = lasthash = coins.get(coins.size() - 1).getHash();
        }
        return lasthash;
    }

    @Override
    public void addBlock(CoinBlock block) {

            block.mineBlock(getLastHash());
            coins.add(block);

    }

    /*public void addBlock(GradingBlock gradingBlock) {

    }*/

    @Override
    public boolean chainIsValid() {
        boolean isValid = false;
        CoinBlock currentBlock;
        CoinBlock precedingBlock;

        if (coins.size() > 1) {

            for (int i = 1; i < this.coins.size(); i++) {
                currentBlock = this.coins.get(i);
                precedingBlock = this.coins.get(i - 1);

                // System.out.println(currentBlock.getPrevHash() + " =? " + precedingBlock.getHash());

                if (currentBlock.getPrevHash() == precedingBlock.getHash()) {
                    //   System.out.println("OK");
                    isValid = true;
                } else {
                    //   System.out.println("NOT OK");
                    isValid = false;
                    break;
                }
            }
        } else {
            isValid = true;
        }

        return isValid;

    }
    @Override
    public void printChain() {
        for (CoinBlock block : coins) {
            System.out.println(block);
        }
    }


}

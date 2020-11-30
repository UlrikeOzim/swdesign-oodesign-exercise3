package at.fhj.msd.swdesign.exercise.blockchain;

import java.util.ArrayList;
import java.util.List;

public class GradingChain implements IGradingBlockChain {

    private List<GradingBlock> grades;

    public  GradingChain(){
        grades= new ArrayList<GradingBlock>();
    }


    @Override
    public int getLastHash() {
        int lasthash = 0;
        if (grades.size() > 0) {
            lasthash= grades.get(grades.size() - 1).getHash();
        }
        return lasthash;
    }

    @Override
    public void addBlock(GradingBlock block){

        block.mineBlock(getLastHash());
        grades.add(block);

    }
    @Override
    public void printChain() {
        for (GradingBlock block : grades) {
            System.out.println(block);
        }
    }

    @Override
    public boolean chainIsValid() {
        boolean isValid = false;
        GradingBlock currentBlock;
        GradingBlock precedingBlock;

        if (grades.size()>1) {

            for (int i = 1; i < this.grades.size(); i++) {
                currentBlock = this.grades.get(i);
                precedingBlock = this.grades.get(i - 1);

              //  System.out.println(currentBlock.getPrevHash() + " =? " + precedingBlock.getHash());

                if (currentBlock.getPrevHash() == precedingBlock.getHash()) {
                //    System.out.println("OK");
                    isValid = true;

                } else {
                //    System.out.println("NOT OK");
                    isValid = false;
                    break;
                }
            }
        }
        else {
            isValid=true;
        }

        return isValid;

    }
}

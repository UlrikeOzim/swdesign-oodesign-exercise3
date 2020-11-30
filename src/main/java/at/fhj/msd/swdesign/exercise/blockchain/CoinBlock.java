package at.fhj.msd.swdesign.exercise.blockchain;

import java.util.Objects;

public class CoinBlock implements  ICoinBlock{

    private String senderName;
    private String receiverName;
    private double amount;
    private int hash;
    private int prevHash;


    public void performPayment(String senderName, String receiverName, double amount) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
    }


    /*public void doGrading(String name, String course, int grade) {

    }*/


    public boolean mineBlock(int prevHash){
        this.prevHash =prevHash;
        hash = generateHashCode();
        return true;
    }


    public int getHash() {
        return hash;
    }

    public int getPrevHash() {
        return prevHash;
    }

    public int generateHashCode() {
        return Objects.hash(senderName, receiverName, amount,  prevHash);
    }


    @Override
    public String toString() {
        return "Block{ Payment:" +
                senderName + " -> " +receiverName +": "+amount +
                 ", hash=" + hash +
                ", prevHash=" + prevHash +
                '}';
    }

}

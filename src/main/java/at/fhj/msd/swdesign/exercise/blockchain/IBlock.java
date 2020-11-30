package at.fhj.msd.swdesign.exercise.blockchain;

public interface IBlock  {

    boolean mineBlock(int prevHash);

/*    void performPayment(String senderName, String receiverName, double amount);

    void doGrading(String name, String course, int grade);*/

    int generateHashCode();

    int getHash();

    int getPrevHash();
}

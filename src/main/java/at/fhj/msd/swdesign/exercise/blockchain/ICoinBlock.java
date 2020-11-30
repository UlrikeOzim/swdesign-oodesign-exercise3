package at.fhj.msd.swdesign.exercise.blockchain;

public interface ICoinBlock extends IBlock {



    void performPayment(String senderName, String receiverName, double amount);

}

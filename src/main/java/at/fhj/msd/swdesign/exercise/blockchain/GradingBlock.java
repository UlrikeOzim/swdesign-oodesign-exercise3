package at.fhj.msd.swdesign.exercise.blockchain;

import java.util.Objects;

public class GradingBlock implements IBlock {

    private String name;
    private String course;
    private int grade;

    private int hash;
    private int prevHash;


    public void doGrading(String name, String course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public boolean mineBlock(int prevHash) {
        this.prevHash =prevHash;
        hash = generateHashCode();
  return true;
    }

    public void performPayment(String senderName, String receiverName, double amount) {

    }


    public int getHash() {
        return hash;
    }

    public int getPrevHash() {
        return prevHash;
    }

    public int generateHashCode() {
        return Objects.hash(name, course, grade, prevHash);
    }


    @Override
    public String toString() {
        return "Block{" +
                "Grading:" + name + ", " + course + ": " + grade +
                ", hash=" + hash +
                ", prevHash=" + prevHash +
                '}';
    }

}

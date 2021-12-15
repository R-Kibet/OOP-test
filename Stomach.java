package org.exp.Challenge2;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medCondition, boolean isEmpty) {
        super(name, medCondition);
        this.isEmpty = isEmpty;
    }

    public  void digest(){
        System.out.println("Digest start");
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if (this.isEmpty()){
            System.out.println("Feed me");
        }else{
            System.out.println("im full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

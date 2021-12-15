package org.exp.Challenge2;

public class Organ {
    private String name;
    private String medCondition;

    public Organ(String name, String medCondition) {
        this.name = name;
        this.medCondition = medCondition;
    }

    public  void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedCondition());
    }


    public String getName() {
        return name;
    }



    public String getMedCondition() {
        return medCondition;
    }


}

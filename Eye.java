package org.exp.Challenge2;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medCondition, String color, boolean isOpen) {
        super(name, medCondition);
        this.color = color;
        this.isOpen = isOpen;
    }


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("color " + this.getColor());
    }

    public void open(){
        this.setOpen(true);
        System.out.println(this.getName() + "opened");
    }

    public void  closed(){
        this.setOpen(false);
        System.out.println(this.getName() + "Closed");
    }

    public String getColor() {
        return color;
    }



    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}


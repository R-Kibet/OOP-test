package org.exp.Challenge2;

public class Patient {
    private String name;
    private int age;
    private  Eye leftEye;
    private  Eye RightEye;
    private  Heart heart;
    private  Stomach stomach;
    private  Skin skin;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        RightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



    public Eye getLeftEye() {
        return leftEye;
    }



    public Eye getRightEye() {
        return RightEye;
    }



    public Heart getHeart() {
        return heart;
    }



    public Stomach getStomach() {
        return stomach;
    }



    public Skin getSkin() {
        return skin;
    }

    }

package org.exp.Challenge2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Mti", 28, new Eye("Left Eye", "Short S", "red", true),
                new Eye("Right eye", "Normal", "red", false),
                new Heart("Heart", "Noramal", 72),
                new Stomach("Stomache", "Normal", true),
                new Skin("Skin", "rough", "Dark", 30));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age " + patient.getAge());


        Scanner scanner = new Scanner(System.in);

        boolean shouldfinish = false;
        while (!shouldfinish) {
            System.out.println("Choose an Organ: " +
                    "\n\t1. Left Eye " +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. close eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().closed();
                        } else {
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                    }
                }
                break;

                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpen()) {
                        System.out.println("\t\t1. close eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().closed();
                        } else {
                            continue;
                        }
                    } else{
                System.out.println("\t\t1. Open the Eye");
                if (scanner.nextInt() == 1) {
                patient.getRightEye().open();
            } else {
                continue;
            }
        }
        break;

        case 3:
            patient.getHeart().getDetails();
            System.out.println("\t\t1. Chang heart rate");
            if (scanner.nextInt() == 1){
                System.out.println("Enter new Heart rate");
                int newHeartRate = scanner.nextInt();
                patient.getHeart().setRate(newHeartRate);
                System.out.println("Changed to " + patient.getHeart().getRate());
            }else{
                continue;
            }
            break;


        case 4:
            patient.getStomach().getDetails();
            System.out.println("\t\t1. Digest");
            if (scanner.nextInt() == 1){
                patient.getStomach().digest();
            }else{
                continue;
            }
            break;
        case 5:
            patient.getSkin().getDetails();
            break;
        default:
            shouldfinish = true ;
            break;
            }
        }


    }
}

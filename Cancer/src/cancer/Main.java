/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancer;

import cancer.objects.CancerPatient;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancerPatient cp = null;
        Scanner sca = new Scanner(System.in);
        while (true) {
            System.out.println("Cancer patient monitoring:");
            System.out.println("Type 1 to add a patient");
            System.out.println("Type 2 to get informations from the patient");
            System.out.println("Type 3 to add a medication");
            int option = sca.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Type patinent name");
                    String name = sca.next();
                    System.out.println("Type patient adress");
                    String address = sca.next();
                    System.out.println("Type patient phone");
                    String phone = sca.next();
                    System.out.println("Type patient gender");
                    String gender = sca.next();
                    System.out.println("Type patient cancer type");
                    String cancerType = sca.next();
                    System.out.println("Type patient cancer stage");
                    int stage = sca.nextInt();
                    System.out.println("Type patient cancer diagnose date");
                    String diagnosesDate = sca.next();
                    System.out.println("Type patient file number");
                    int filenumber = sca.nextInt();
                    System.out.println("Type patient registration date");
                    String registrationdate = sca.next();
                    cp = new CancerPatient(cancerType, stage, diagnosesDate, name, address, phone, gender, filenumber, registrationdate);
                    break;
                case 2:
                    if (cp == null) {
                        System.out.println("There´s no patient in the system");
                        return;
                    }
                    System.out.println(cp.getInfo());
                    break;
                case 3:
                    if (cp == null) {
                        System.out.println("There´s no patient in the system");
                        return;
                    }
                    while (true) {
                        System.out.println("Type the medication");
                        cp.addMedication(sca.next());
                        System.out.println("Do you want to add another one ? (y/n)");
                        if (sca.next().equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("This option doesn´t exists");
            }
        }
    }

}

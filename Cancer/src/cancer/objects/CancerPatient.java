/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancer.objects;

import java.util.ArrayList;


public class CancerPatient extends Patient {

    public CancerPatient(String cancerType, int stage, String diagnosesDate, String name, String address, String phone, String gender, int filenumber, String registrationdate) {
        super(name, address, phone, gender, filenumber, registrationdate);
        if (stage < 0 || stage > 3) {
            System.out.println("The cancer stage number should be in between 0 and 3!");
            return;
        }
        this.cancerType = cancerType;
        this.stage = stage;
        this.diagnosesDate = diagnosesDate;
    }

    public String getInfo() {
        return "Data about " + this.getName() + ":\n"
                + "- Cancer type: " + this.cancerType + "\n"
                + "- Cancer stage: " + this.stage + ":\n"
                + "- Diagnose Date: " + this.diagnosesDate + ":\n"
                + "- Address" + this.getAddress() + ":\n"
                + "- phone" + this.getPhone() + ":\n"
                + "- gender" + this.getGender() + ":\n"
                + "- File number" + this.getFilenumber() + ":\n"
                + "- Registration date" + this.getRegistration() + ":\n"
                + getMedications();
    }

    public String getCancerType() {
        return cancerType;
    }

    public void setCancerType(String cancerType) {
        this.cancerType = cancerType;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        if (stage < 0 || stage > 3) {
            System.out.println("The cancer stage number should be in between 0 and 3!");
            return;
        }

        this.stage = stage;
    }

    public String getDiagnosesDate() {
        return diagnosesDate;
    }

    public void setDiagnosesDate(String diagnosesDate) {
        this.diagnosesDate = diagnosesDate;
    }

    public void addMedication(String medication) {
        medications.add(medication);
    }

    public String getMedications() {
        String ret = "Medication List:\n";
        for (String medication : medications) {
            ret +=  "- " + medication + "\n";
            
        }
        return ret;
    }

    private String cancerType;
    private int stage;
    private String diagnosesDate;
    private ArrayList<String> medications = new  ArrayList();

}

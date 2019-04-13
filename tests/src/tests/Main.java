/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.Scanner;
import tests.objects.CourseGrades;
import tests.tests.Essay;
import tests.tests.FinalExam;
import tests.tests.LabActivity;
import tests.tests.PassFailExam;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        CourseGrades cg = new CourseGrades();
        System.out.println("Enter the lab activity score");
        cg.setLab(new LabActivity(sca.nextDouble()));
        System.out.println("Enter the pass/fail test score ");
        cg.setPassFailExam( new PassFailExam(sca.nextDouble()));
        System.out.println("Enter the essay score");
        cg.setEssay( new Essay(sca.nextDouble()));
        System.out.println("Enter the final exam score");
        cg.setFinalExam(new FinalExam(sca.nextDouble()));
        System.out.println(cg.print());
    }

}

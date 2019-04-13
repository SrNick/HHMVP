/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.objects;

import tests.tests.Essay;
import tests.tests.FinalExam;
import tests.tests.PassFailExam;

public class CourseGrades {

    private GradedActivity[] grades = new GradedActivity[4];

    public void setLab(GradedActivity Lab) {
        grades[0] = Lab;
    }

    public void setPassFailExam(PassFailExam PassFailExam) {
        grades[1] = PassFailExam;
    }

    public void setEssay(Essay Essay) {
        grades[2] = Essay;
    }

    public void setFinalExam(FinalExam FinalExam) {
        grades[3] = FinalExam;
    }

    public String print() {
        return "Lab Score: " + grades[0] + "Pass/Fail Exam Score: "
                + grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
                + "\nEssay Score: " + grades[2].getScore() + "\t\tGrade: " + grades[2].getGrade()
                + "\nFinal Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();
    }
}

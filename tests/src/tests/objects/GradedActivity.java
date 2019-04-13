/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests.objects;

public abstract class GradedActivity {

    private double score;

    public String getGrade() {

        if (score >= 92) {
            return "A";
        } else {
            if (score >= 84 && score <= 91) {
                return "B";
            } else {
                if (score >= 76 && score <= 83) {
                    return "C";
                } else {
                    if (score >= 68 && score <= 75) {
                        return "D";
                    } else {
                        if (score <= 67) {
                            return "E";
                        }
                    }
                }
            }
        }
        return "Unknow";
    }

    public GradedActivity(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}

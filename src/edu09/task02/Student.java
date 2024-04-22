package edu09.task02;

public class Student {
    private String name;
    private String group;

    private int course;
    private int gradeMath;
    private int gradeChemistry;
    private int gradeEnglish;

    public Student(String name, String group, int course, int gradeMath, int gradeChemistry, int gradeEnglish) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeMath = gradeMath;
        this.gradeChemistry = gradeChemistry;
        this.gradeEnglish = gradeEnglish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    public int getGradeChemistry() {
        return gradeChemistry;
    }

    public void setGradeChemistry(int gradeChemistry) {
        this.gradeChemistry = gradeChemistry;
    }

    public int getGradeEnglish() {
        return gradeEnglish;
    }

    public void setGradeEnglish(int gradeEnglish) {
        this.gradeEnglish = gradeEnglish;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }

    public double getAverageGrade() {
        return (double) (gradeMath + gradeChemistry + gradeEnglish) / 3;
    }

}

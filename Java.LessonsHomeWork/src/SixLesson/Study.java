package SixLesson;

public class Study {
    private String course;

    //TODO
    public Study(String course) {
        this.course = course;
    }
    public String printCourse() {
        return this.course;
    }

}

class JavaProgram {
    public static void main(String[] args) {
        //TODO
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }

}

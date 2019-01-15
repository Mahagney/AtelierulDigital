package lambda;

public class Student {
    private int score;
    private int gradYear;

    public Student(int year, int score){
        this.score=score;
        gradYear=year;
    }

    public int getScore() {
        return score;
    }

    public int getGradYear() {
        return gradYear;
    }
}

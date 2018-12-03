package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private String department;
    private String position;
    private float hourSalary;
    private List<Float> recordingHours = new ArrayList<Float>(31);

    public Employee(int age, String name, int cnp, String department, String position, float hourSalary) {
        super(age, name, cnp);
        this.department = department;
        this.position = position;
        this.hourSalary = hourSalary;
    }

    public boolean addHour( float hours) {

        if (hours > 12 || hours < 0) {
            System.out.println("Number of hours should be larger than 0 and smaller than 12.");
            return false;
        }
        recordingHours.add(hours);
        return true;
    }

    public void resetHours() {
        recordingHours.clear();
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee{" +
                "department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", hourSalary=" + hourSalary +
                ", recordingHours=" + recordingHours +
                '}';
    }

    public float getHourSalary() {
        return hourSalary;
    }

    public List<Float> getRecordingHours() {
        return recordingHours;
    }
}

import java.util.Arrays;

public class Course {
    private String ID, Name;
    private Students students[] = new Students[20];
    private int numOfStudents;

    public Course(String ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void AddStudents(Students student){

        students[numOfStudents] = student;
        numOfStudents++;

    }
    public void DropStudents(Students student){

        int i = 0;
        Students[] temp, temp2;

        if(numOfStudents >= 1) {
            while(student != students[i] && i < numOfStudents) {
                i++;
            }
            //Copies students array to two temporary arrays except for the student that is being dropped
            if(students[i] == student) {
                //Copies until it reaches the target to be removed
                temp = Arrays.copyOfRange(students, 0, i);
                //Copies from after the target till end
                temp2 = Arrays.copyOfRange(students, i+1, numOfStudents+1);
                //Assigns first temp to the original array
                students = Arrays.copyOf(temp, numOfStudents--);
                //Adds second temp to original array from where the target was removed
                System.arraycopy(temp2, 0, students, i, numOfStudents-i);
            }
            else
                System.out.println(student + " does not exist");
        }
        else
            System.out.println("No more students can be removed");
    }

//        numOfStudents = Integer.parseInt(student);
//        students[numOfStudents] = student;
//        numOfStudents--;


    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Students[] getStudents() {
        return students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
}

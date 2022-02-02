import java.util.Arrays;

public class Students {

    private String Name, ID;
    private Course[] courseList = new Course[20];
    private int numOfCourses;

    public Students( String ID, String name) {

        this.ID = ID;
        Name = name;

    }

    public void AddCourse(Course CourseList){

        courseList[numOfCourses] = CourseList;
        numOfCourses++;

    }

    public void DropCourse(Course CourseList){

        int i = 0;
        Course[] temp, temp2;

        if(numOfCourses >= 1) {
            while(CourseList != courseList[i] && i < numOfCourses) {
                i++;
            }
            //Copies students array to two temporary arrays except for the student that is being dropped
            if(courseList[i] == CourseList) {
                //Copies until it reaches the target to be removed
                temp = Arrays.copyOfRange(courseList, 0, i);
                //Copies from after the target till end
                temp2 = Arrays.copyOfRange(courseList, i+1, numOfCourses+1);
                //Assigns first temp to the original array
                courseList = Arrays.copyOf(temp, numOfCourses--);
                //Adds second temp to original array from where the target was removed
                System.arraycopy(temp2, 0, courseList, i, numOfCourses-i);
            }
            else
                System.out.println(CourseList + " does not exist");
        }
        else
            System.out.println("No more students can be removed");

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
}

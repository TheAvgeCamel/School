import java.util.Arrays;

public class Faculty {
    private String Name;
    private int numOfCourses;
    private Course[] courselist = new Course[20];

    public Faculty(String name) {
        Name = name;
    }

    public void AddCourse(Course CourseList){

        courselist[numOfCourses] = CourseList;
        numOfCourses++;

    }

    public void DropCourse(Course CourseList){
        int i = 0;
        Course[] temp, temp2;

        if(numOfCourses >= 1) {
            while(CourseList != courselist[i] && i < numOfCourses) {
                i++;
            }
            //Copies students array to two temporary arrays except for the student that is being dropped
            if(courselist[i] == CourseList) {
                //Copies until it reaches the target to be removed
                temp = Arrays.copyOfRange(courselist, 0, i);
                //Copies from after the target till end
                temp2 = Arrays.copyOfRange(courselist, i+1, numOfCourses+1);
                //Assigns first temp to the original array
                courselist = Arrays.copyOf(temp, numOfCourses--);
                //Adds second temp to original array from where the target was removed
                System.arraycopy(temp2, 0, courselist, i, numOfCourses-i);
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

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public Course[] getCourselist() {
        return courselist;
    }

    public void setCourselist(Course[] courselist) {
        this.courselist = courselist;
    }
}

public class Driver {

    public static void main(String[] args) {


        Faculty f1 = new Faculty("Robert Pattertson");
        Faculty f2 = new Faculty("John Krakinski");

//------------------------------------Add Students to Course 1---------------------------------------------------------------------
        Course c1 = new Course("CISC125","Data Structures");

        Students s1 = new Students("A123", "Rick Ashley");
        Students s2 = new Students("B123", "Riley Ried");
        Students s3 = new Students("C123", "Trever Philips");

        c1.AddStudents(s1);
        c1.AddStudents(s2);
        c1.AddStudents(s3);

//        c1.DropStudents(s2);

        System.out.println("Number of Students in course1 are: "+c1.getNumOfStudents());
        Students[] students = c1.getStudents();
        for (int i = 0; i< c1.getNumOfStudents();i++){
            System.out.print(students[i].getName()+", ");
        }
        System.out.println();
        System.out.println("Course ID: "+c1.getID()+" | Course Name: "+c1.getName());
        System.out.println("Teacher: "+f1.getName());

//-------------------------------------Add Students to Course 2--------------------------------------------------------------------
        Course c2 = new Course("CISC123","I.T");

        c2.AddStudents(s1);
        c2.AddStudents(s2);

        System.out.println();
        System.out.println("Number of Students in course2 are: "+c2.getNumOfStudents());
        Students[] student2 = c2.getStudents();
        for (int i = 0; i< c2.getNumOfStudents();i++){
            System.out.print(student2[i].getName()+", ");
        }
        System.out.println();
        System.out.println("Course ID: "+c2.getID()+" | Course Name: "+c2.getName());
        System.out.println("Teacher: "+f2.getName());

        //c2.DropStudents(s1);

//------------------------------------------Add Students to Course 3---------------------------------------------------------------
        Course c3= new Course("CISC999","Computer Architecture");

        c3.AddStudents(s3);

        System.out.println();
        System.out.println("Number of Students in course2 are: "+c3.getNumOfStudents());
        Students[] student3 = c3.getStudents();
        for (int i = 0; i< c3.getNumOfStudents();i++){
            System.out.print(student3[i].getName()+", ");
        }
        System.out.println();
        System.out.println("Course ID: "+c3.getID()+" | Course Name: "+c3.getName());
        System.out.println("Teacher: "+f1.getName());

//--------------------------------------------Add Course to Student-------------------------------------------------------------

        s1.AddCourse(c1);
        s1.AddCourse(c2);

//        s1.DropCourse(c1);

        System.out.println();
        System.out.println("Number of Courses available to Student are: "+s1.getNumOfCourses());
        Course[] course1 = s1.getCourseList();
        for (int i = 0; i< s1.getNumOfCourses();i++){
            System.out.print(course1[i].getName()+", ");
        }
        System.out.println();
        System.out.println("Student ID: "+s1.getID()+" | Student Name: "+s1.getName());
        System.out.println("Student ID: "+s2.getID()+" | Student Name: "+s2.getName());
//----------------------------------------Add Course That Faculty Teaches-----------------------------------------------------------------
        f1.AddCourse(c3);
        f1.AddCourse(c1);

//        f1.DropCourse(c3);

        System.out.println();
        System.out.println("Number of Courses "+ f1.getName()+" teaches : "+s1.getNumOfCourses());
        Course[] courseF = f1.getCourselist();
        for (int i = 0; i< f1.getNumOfCourses();i++){
            System.out.print(courseF[i].getName()+", ");
        }
    }

}

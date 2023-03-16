public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("it-kg");
        course.setNumber(2);
        course.setTeacher("Azamat");
        course.setDay("06.02.2023");
        Student student = new Student ();
        student.setName("Nurbek");
        student.setAge(15);
        System.out.println("\tCourse\n"+"Name: "+course.getName()+"\nNumber: "+course.getNumber()+
                "\nTeacher: "+course.getTeacher()+"\nDay: "+course.getDay());
        System.out.println("\tStudent\n"+"Name: "+student.getName()+"\nAge: "+student.getAge());
    }
}
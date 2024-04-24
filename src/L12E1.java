public class L12E1 {
    public static void displayStudent(Student thisStudent){
        System.out.format("(%d) %s %s %n",thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }
    public static void main(String[] args) {
        // create student object and display

        Student student1 = new Student();

        Student student2 = new Student();
        student2.id = 30138179;
        student2.firstName = "Charlie";
        student2.surname = "Priestley";
        student2.present = true;

        displayStudent(student1);
        displayStudent(student2);
        // update values of student object and display
        
    }
}

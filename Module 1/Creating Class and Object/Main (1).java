public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();


        s1.setStudentId("IT23049");
        s1.setName("Siam Joadder Shoishob");
        s1.setGrade(85);
        s1.setIsActive(true);

        s1.displayDetails();

        System.out.println("Letter Grade: " + s1.getLetterGrade());
        System.out.println("Passing: " + s1.isPassing());
    }
}

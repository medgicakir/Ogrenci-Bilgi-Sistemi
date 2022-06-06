public class Main {

    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Kerem", "MAT", "54346");
        Teacher t2 = new Teacher("Aslı", "MAT", "63456");
        Teacher t3 = new Teacher("Mert", "KMY", "63467");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Zafer", 4, "4444444", mat, fizik, kimya);
        s1.addBulkExamNote(40, 20, 40, 50, 24, 80);
        s1.isPass();

        Student s2 = new Student("Çiğdem", 4, "777777", mat, fizik, kimya);
        s2.addBulkExamNote(80, 50, 40, 64, 40, 88);
        s2.isPass();

        Student s3 = new Student("Selin", 4, "111111111", mat, fizik, kimya);
        s3.addBulkExamNote(40, 20, 40, 40, 25, 90);
        s3.isPass();
    }
}
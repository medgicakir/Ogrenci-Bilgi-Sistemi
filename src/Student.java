public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    boolean isPass;
    private double average;

    Student(String name, int classes, String stuNo, Course fizik, Course kimya, Course mat) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.fizik = fizik;
        this.kimya = kimya;
        this.mat = mat;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int sozluMat, int sozluFizik, int sozluKimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (sozluMat >= 0 && sozluMat <= 100) {
            this.mat.sozlu = sozluMat;
        }
        if (sozluFizik >= 0 && sozluFizik <= 100) {
            this.fizik.sozlu = sozluFizik;
        }
        if (sozluKimya >= 0 && sozluKimya <= 100) {
            this.kimya.sozlu = sozluKimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matAverage = ((this.mat.note) * 0.8) + ((this.mat.sozlu) * 0.2);
        double fizikAverage = ((this.fizik.note) * 0.7) + ((this.fizik.sozlu) * 0.3);
        double kimyaAverage = ((this.kimya.note) * 0.6) + ((this.kimya.sozlu) * 0.4);
        this.average = (matAverage + fizikAverage + kimyaAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("------------------");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü : " + this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü : " + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü : " + this.kimya.sozlu);
    }
}
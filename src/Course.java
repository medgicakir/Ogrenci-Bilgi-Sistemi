public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int sozlu;
    int note;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.teacher = t;
            System.out.println("Öğretmen Ekleme Başarılı");
        }else{
            System.out.println(t.name + " Bu dersi veremez");
        }
    }

    public void printTeacher(){
        if (teacher != null){
            System.out.println(this.name + " Dersin Akademisyeni : " + teacher.name);
        }else{
            System.out.println(this.name + " Dersine Akademisyen Atanmamıştır");
        }
    }
}

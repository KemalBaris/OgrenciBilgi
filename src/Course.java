public class Course {
    // değişkenler
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
 // kurs için gerekli olan değişkenleri kurucu method oluşturarak yazdım
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        int verbalNote = 0;
    }
// daha sonra bu kurslara öğretmen ekledim.
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
 // bu method ile öğretmenleri yazdırabiliyorum.
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}

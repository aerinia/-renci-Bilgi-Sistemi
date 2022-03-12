public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","999");
        Teacher t2 = new Teacher("Graham Bell", "FZK","555");
        Teacher t3 =new Teacher("Külyutmaz","BIO","111");
        Courses tarih = new Courses("Tarih","101","TRH");
        Courses fizik = new Courses("Fizik","102","FZK");
        Courses biyoloji = new Courses("Biyoloji","101","BIO");
        fizik.addTeacher(t2);
        tarih.addTeacher(t1);
        biyoloji.addTeacher(t3);
        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyoloji);
         s1.addBulkExamNote(100,20,50);
         s1.isPass();
         Student s2 = new Student( "Güdük Necmi","124","4",tarih,fizik,biyoloji);
         s2.addBulkExamNote(100,100,100);
         s2.isPass();


    }
}

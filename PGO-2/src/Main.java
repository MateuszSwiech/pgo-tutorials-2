public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.fname = "Adam";
        st1.lname = "Golab";
        st1.grades = new double[]{4,3,2};
        st1.indexNumber="s30332";

        Student st2 = new Student();
        st2.fname = "Jan";
        st2.lname = "Lasek";
        st2.grades = new double[]{2,5,3};
        st2.indexNumber="s34234";

        StudentGroup stg= new StudentGroup();
        stg.nazwa = "Grupa 1";
        stg.students = new Student[15];

        stg.dodajStudenta(st1);
        stg.dodajStudenta(st2);

        double sr1 =st1.obliczanieSredniej();
        System.out.println(sr1);
        double sr2 =st2.obliczanieSredniej();
        System.out.println(sr2);

    }
}

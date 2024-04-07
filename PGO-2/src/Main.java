
public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.fname = "Adam";
        st.lname = "Golab";
        st.grades = new double[]{4,4,4,3};

        double srednia = 0;
        double[] zaokragloneOceny = {2,2.5,3,3.5,4,4.5,5};
        if (st.grades.length == 0) {
        throw new IllegalArgumentException("Sudent nie ma żadnej oceny");

        } else {
            for (int i = 0; i < st.grades.length; i++) {
                srednia += st.grades[i];

            }
            srednia /= st.grades.length;
            System.out.println(srednia);
        }
    }
}
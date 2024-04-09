public class StudentGroup {
    public String nazwa;

    public Student[] students;
    public int studentCount = 0;
    public void dodajStudenta(Student student) {
        if (studentCount >= 15) {
            throw new IllegalStateException("Grupa jest pełna, max 15 os");
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(student)) {
                throw new IllegalStateException("Ten student został już dodany do grupy.");
            }
        }
        students[studentCount++] = student;
    }

}

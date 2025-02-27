package pt.ipp.isep.dei.esoft.labproject.problem.two.version.three;

public class ProblemTwo {
    public static boolean sortStudentsByAscendingNumber(Student[] students) {
        if (students == null) {
            return false;
        }

        int n = students.length;
        Student temp = new Student();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (students[j].number > students[j + 1].number) {
                    temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }

            }
        }
        return true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }

    public static boolean sortStudentsByDescendingGrade(Student[] students) {
        if (students == null) {
            return false;
        }
        int n = students.length;
        Student temp = new Student();
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - 1; j > 0; j--) {
                if (students[j].grade > students[j - 1].grade) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }

            }
        }
        return true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }
}

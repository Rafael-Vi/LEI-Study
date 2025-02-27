package pt.ipp.isep.dei.esoft.labproject.problem.two.version.two;

public class ProblemTwo {
    public static boolean sortStudentsByAscendingNumber(int[] studentNumbers, String[] studentNames,
                                                        int[] studentGrades) {
        if (studentNumbers == null || studentNames == null || studentGrades == null) {
            return false;
        }
        int arrayLength = studentNumbers.length;

        if (arrayLength != studentNames.length || arrayLength != studentGrades.length) {
            return false;
        }

        int temp = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                if (studentNumbers[j] > studentNumbers[j + 1]) {
                    temp = studentNumbers[j];
                    studentNumbers[j] = studentNumbers[j + 1];
                    studentNumbers[j + 1] = temp;

                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;

                    temp = studentGrades[j];
                    studentGrades[j] = studentGrades[j + 1];
                    studentGrades[j + 1] = temp;
                }
            }
        }
            return true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }
}
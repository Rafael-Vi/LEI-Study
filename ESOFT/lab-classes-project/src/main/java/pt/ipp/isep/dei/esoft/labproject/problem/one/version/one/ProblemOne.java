package pt.ipp.isep.dei.esoft.labproject.problem.one.version.one;

public class ProblemOne {

    /**
     * Sort an array of integers in ascending order. Implementation (1/2).
     *
     * @param array Array of integers.
     * @return Sorted array of integers.
     */
    public static int[] sortArrayAscending(int[] array) {

        if (array == null) {
            return null;
        }
        int temp = 0;
        int arraySize = array.length;
        if (arraySize == 0 || arraySize == 1) {
            return array;
        }
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;


        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }
}
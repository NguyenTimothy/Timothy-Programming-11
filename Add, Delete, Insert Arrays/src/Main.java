public class Main {
    static int[] addArray(int[] array, int integer){
        // Adds an integer to the end of an array of integers.
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        newArray[array.length] = integer;
        return newArray;
    }

    static int[] delArray(int[] array){
        // Deletes the last integer in an array of integers.
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    static int[] insertArray(int[] array, int integer, int index) {
        // Inserts an integer in an array of integers.
        int[] newArray;
        if (index <= array.length) {
            newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++){
                newArray[i] = array[i];
            }
            for (int i = index + 1; i < array.length; i++){
                newArray[i] = array[i];
            }
        } else {
            newArray = new int[index + 1];
            for (int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
        }
        newArray[index] = integer;
        return newArray;
    }

    public static void main(String[] args) {
        // Example of the addArray method
        int[] addEg = {10, 11, 12, 13, 14, 15};
        addEg = addArray(addEg, 16);
        for (int i: addEg){
            System.out.println(i);
        }
        System.out.println("\n");

        // Example of the delArray method
        int[] delEg = {20, 21, 22, 23, 24, 25};
        delEg = delArray(delEg);
        for (int i: delEg){
            System.out.println(i);
        }
        System.out.println("\n");

        // Example of the insertArray method
        int[] insertEg = {30, 31, 32, 34, 35, 36};
        insertEg = insertArray(insertEg, 33, 3);
        insertEg = insertArray(insertEg, 37, 10);
        for (int i: insertEg){
            System.out.println(i);
        }
    }
}

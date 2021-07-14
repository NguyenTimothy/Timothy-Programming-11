public class Main {
    static int[] addArray(int[] a, int b){
        // Adds an integer to the end of an array of integers. The array is 'a' and the integer being added is 'b'
        int[] c = new int[a.length + 1];
        System.arraycopy(a, 0, c, 0, a.length);
        c[a.length] = b;
        return c;
    }

    static int[] delArray(int[] a){
        // Deletes the last integer in an array of integers. 'a' is the array.
        int[] b = new int[a.length -1];
        System.arraycopy(a, 0, b, 0, a.length - 1);
        return b;
    }

    static int[] insertArray(int[] a, int b, int c) {
        // Inserts an integer in an array of integers. 'a' is the array, 'b' is the integer, 'c' is the index position
        int[] d;
        if (c <= a.length) {
            d = new int[a.length + 1];
            System.arraycopy(a, 0, d, 0, c);
            d[c] = b;
            System.arraycopy(a, c, d, c + 1, a.length - c);
        } else {
            d = new int[c + 1];
            System.arraycopy(a, 0, d, 0, a.length);
            d[c] = b;
        }
        return d;
    }

    public static void main(String[] args) {
        // Example of the addArray method
        int[] addEg = {10, 11, 12, 13, 14, 15};
        addEg = addArray(addEg, 16);
        for(int i: addEg){
            System.out.println(i);
        }
        System.out.println("\n");

        // Example of the delArray method
        int[] delEg = {20, 21, 22, 23, 24, 25};
        delEg = delArray(delEg);
        for(int i: delEg){
            System.out.println(i);
        }
        System.out.println("\n");

        // Example of the insertArray method
        int[] insertEg = {30, 31, 32, 34, 35, 36};
        insertEg = insertArray(insertEg, 33, 3);
        insertEg = insertArray(insertEg, 37, 10);
        for(int i: insertEg){
            System.out.println(i);
        }
    }
}

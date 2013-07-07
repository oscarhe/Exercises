// 1.7 - Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

class ArrStr7 {
    
    public static void main(String[] args) {
        
        int[][] arr1 = new int[][] {
            {1,2,3,4},
            {3,0,3,5},
            {1,0,0,4},
        };
        
        printArr(arr1);
        zeroOut(arr1);           
        
    }

    public static void zeroOut(int[][] arr) {

        boolean[] rowTracker = new boolean[arr.length];
        boolean[] columnTracker = new boolean[arr[0].length];

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] == 0) {

                    rowTracker[i] = true;
                    columnTracker[j] = true;
                    
                }

            }

        }

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(rowTracker[i] == true || columnTracker[j] == true) {

                    arr[i][j] = 0;

                }

            }

        }

        printArr(arr);

    }

    public static void printArr(int[][] arr) {

        for(int[] i : arr) {

            for(int j : i) {

                System.out.print(j + " ");

            }

            System.out.println();
    
        }

    }
    
}

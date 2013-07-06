// 1.6 - Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

class ArrStr6 {
    
    public static void main(String[] args) {
        
        int[][] arr1 = new int[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9}  
        };

        int[][] arr2 = new int[][] {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printArr(arr1);

        rotate(arr1);

        printArr(arr2);

        rotate(arr2);
         
    }

    public static void rotate(int[][] arr) {

        for(int i = 0; i < arr.length / 2; ++i) {
            
            int first = i;
            int last = arr.length - 1 - i;
            
            for(int j = first; j < last; ++j) {
                
                int offset = j - first;
                
                int top = arr[first][j];
                
                arr[first][j] = arr[last-offset][first];
                
                arr[last-offset][first] = arr[last][last-offset];
                
                arr[last][last-offset] = arr[j][last];
                
                arr[j][last] = top;   
                
            }
            
        }

        printArr(arr);

    }

    public static void printArr(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }

    }
    
}

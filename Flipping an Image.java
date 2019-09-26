class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
       int [][] e = new int [A.length][A[0].length];
        int k =0;
        
        // reversing the image
        for (int i = 0; i < A.length; i++) {
            k = 0;
            for (int j = A[0].length - 1; j >= 0; j--) {              
                e[i][k] = A[i][j];
                k++;
                
            }
        }
        
            
        // inverting the image
        for (int i = 0; i < A.length; i++) {
            for (int j =0; j < A[0].length; j++) {
                
                if (e[i][j] == 0){
                    e[i][j] = 1 ;      
                } else {
                     e[i][j] = 0;
                }                
            }
        }
        
         return e;
    }
    
   
}
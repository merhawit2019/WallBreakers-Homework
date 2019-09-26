class Solution {
    public int[][] transpose(int[][] A) {
         
        int x = A.length;
        int y = A[0].length;

        
        int [][] transpose = new int [y][x];
        
     
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                transpose[j][i] = A[i][j];
                
            }
            
        }
 
        
        return transpose;
        
        
    }
}
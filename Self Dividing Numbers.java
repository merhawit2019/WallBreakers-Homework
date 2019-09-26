class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> e = new ArrayList<Integer> ();
        int count = 0;
        for (int i = left; i <= right; i++)  {
            if (i < 10) {
                e.add(i);     
            } else {
                while(i>0){
                    if(i != 0 && i % 10 == 0){
                        i = i/10;
                        if (!e.contains(i)){
                             e.add(i);
                        }
                        
                    } else {
                        if(e.contains(i)){
                            e.remove(i);
                        }
                           
                    }
                    
                    
                    
                }
            }
            
            
            
            /*while(i > 9) {
                if(i % 10 == 0 && i != 0) {
                    i = i/10;
                }
                
                
            }*/
            
           // e.add(i);
            
        }
        
        return e;
        
    }
}
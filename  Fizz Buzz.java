class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> e = new ArrayList<>();
        
        int k = 0;
        
        for (int i = 1; i < n; i++) {   
            if(i%3 == 0 && i%5 != 0) {
                e.add(k,"Fizz");
            } else if(i%5 == 0 && i%3 != 0) {
                e.add(k,"Buzz");
            } else if(i%3 == 0 && i%5 == 0) {
                e.add(k,"FizzBuzz");
            } else {
                
                //String x = Integer.toString(i);
                //e.add(String.valueOf(i));
                e.add(k,"hi");
            } 
            
            k++;
        }
        
        return e;
    }
}
class Solution {
    public boolean detectCapitalUse(String word) {
        
        char arr[] = word.toCharArray();
        int top = arr.length-2;
        int bottom = 1;
        boolean caps = false;

        if(arr[0] >= 'a' && arr[arr.length-1] < 'a') return false;
        if(arr[0] < 'a' && arr[arr.length-1] < 'a')caps = true;
        else caps = false;
        
        while(bottom <= top){
            
            if(caps == true && (arr[top] >= 'a' || arr[bottom] >= 'a')) return false;
            if(caps == false && (arr[top] < 'a' || arr[bottom] < 'a')) return false;
            bottom ++;
            top --;
        }
        return true;
        
    }
}
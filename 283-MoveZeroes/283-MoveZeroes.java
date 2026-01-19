// Last updated: 1/19/2026, 10:35:54 PM
public class Solution{
    public void moveZeroes(int []arr){
        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]= temp; 
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

}
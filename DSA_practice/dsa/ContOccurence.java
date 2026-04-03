package DSA_practice.dsa;

public class ContOccurence {
    public static void main(String[] args) {
        int [] arr={0,0,1,1,2,2,2,2,3,4,5,6,7,7,7,7};
        int count=0;
        int target=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}

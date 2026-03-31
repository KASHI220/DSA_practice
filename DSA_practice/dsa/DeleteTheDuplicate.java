package DSA_practice.dsa;

public class DeleteTheDuplicate {
    public static void main(String[] args) {
        int [] array ={0,0,1,1,1,2,4,5,5,6,6,7};
        int k=0;
        if(array.length==0)return;
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[k]){
                array[k+1]=array[i];
                k++;
            }
        }
        for(int i=0;i<=k;i++) {
            System.out.print(array[i]+ (i < k ? ", " : ""));
        }
    }
}

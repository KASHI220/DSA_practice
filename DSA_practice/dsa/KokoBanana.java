package DSA_practice.dsa;

public class KokoBanana {
    public static void main(String[] args) {
        int [] arr = {1,4,5,7,8,9
        };
        int h = 7;
        KokoBanana obj =new KokoBanana();
        int banana=obj.koko(arr,h);
        System.out.println(banana);

    }
    public int koko(int [] arr,int h){
        int low=1;
        long max=0;
        long high=0;
        for(int a :arr){
          if(max<a){
              max=a;
          }
          high=max;
        }
        while(low<=high){
            int mid=(int)(high+low)/2;
            int result=totalH(arr,mid);
            if(result>h){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int totalH(int [] arr,int mid){
        int totalHour=0;
        for(int i=0;i<arr.length;i++){
            totalHour+=(arr[i]+mid-1)/mid;
        }
        return totalHour;
    }
}

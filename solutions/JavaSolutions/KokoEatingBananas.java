public class KokoEatingBananas {
    public static void main(String[] args) {
int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        int low = 1;
        int high = max;
        int answer = max;

    while(low<=high)  {

        int mid = (low+high)/2;

        if(canEatAll(piles,h,mid)){
            answer = mid;
             high = mid -1;
        }else{
            low = mid +1;
        }
    }
return answer;
    }

    private static boolean canEatAll(int[] piles, int h, int mid) {
        int hours = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%mid==0){
                hours += piles[i]/mid;

            }else{
                hours += piles[i]/mid+1;
            }

        }

        return hours <= h;
    }
}

package complete153;

/**
 * @author bo
 * @date Created in 10:40 2019/9/8
 * @description
 **/
public class Solution1 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int shun=0;
        int ni=0;
        for(int i=start;i!=destination;i++){
            i%=distance.length;
            shun+=distance[i];
        }
        for(int i=start;i!=destination;i--){
            i%=distance.length;
            ni+=distance[i-1%distance.length];
        }
        return 0;
    }
}

package complete149;

/**
 * @author bo
 * @date Created in 10:30 2019/8/11
 * @description
 **/
public class Solution1 {
    public int ordinalOfDate(String date) {
        String[] str=date.split("-");
        int[] normalMonth=new  int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int[] spMouth=new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
        int year=Integer.parseInt(str[0]);
        int mouth=Integer.parseInt(str[1]);
        int day=Integer.parseInt(str[2]);
        int result=0;
        System.out.println("mouth:"+mouth);
        mouth=mouth-2;
        if (year%4==0&&year%100!=0||year%400==0){
            while(mouth>=0){
                result+=spMouth[mouth];
            }
            return result+day;
        }else{
            while(mouth>=0) {
                result += normalMonth[mouth];
            }
            return result + day;
        }
    }
}


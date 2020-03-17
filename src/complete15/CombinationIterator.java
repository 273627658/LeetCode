package complete15;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author bo
 * @date Created in 22:44 2019/12/14
 * @description
 **/
public class CombinationIterator {
    char[] characters;
    int combinationLength;
    int curI=0;
    int curJ=1;
    StringBuffer stringBuffer;
    public CombinationIterator(String characters, int combinationLength) {
        this.characters=characters.toCharArray();
        this.combinationLength=combinationLength;
        Arrays.sort(this.characters);
        stringBuffer=new StringBuffer();
    }

    public String next(){
        for (int i=curI;i<=characters.length-combinationLength;i++) {

            stringBuffer.append(this.characters[i]);
            if (stringBuffer.length() == combinationLength) {
                curI++;
                return (stringBuffer.toString());
            }
            for (int j = curJ; j < characters.length; j++) {
                stringBuffer.append(this.characters[j]);
                if (stringBuffer.length() == combinationLength) {
                    curJ++;
                    return stringBuffer.toString();
                }
            }
            curI++;
            curJ=curI+1;
            stringBuffer.setLength(0);
        }
        return "";
    }

    public boolean hasNext() {
       return curI<characters.length-combinationLength;
    }

    public static void main(String[] args) {
        CombinationIterator abc = new CombinationIterator("gkosu", 3);
        System.out.println(abc.next());
        System.out.println(abc.hasNext());
        System.out.println(abc.next());
        System.out.println(abc.hasNext());
        System.out.println(abc.next());
        System.out.println(abc.hasNext());
        System.out.println(abc.next());
        System.out.println(abc.hasNext());
    }
}

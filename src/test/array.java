package test;

public class array {
    public static void main(String[] args) {
        Node test = test();
        System.out.println(test);
        System.out.println(test.i);
    }
    private static Node test(){
        //int  temp=1;
        Node temp =new Node();
        try{
            System.out.println(temp);
            System.out.println(temp.i);
            temp.i++;
            return temp;
        }catch (Exception e){
            System.out.println(temp);
            return temp;
        }finally {
            ++temp.i;
            System.out.println(temp);
            System.out.println(temp.i);
        }
    }
}
class Node{
    int i;

}



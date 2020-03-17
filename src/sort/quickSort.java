package sort;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author bo
 * @date Created in 22:31 2019/10/17
 * @description
 **/
public class quickSort {
    public static void main(String[] args) throws IOException {
        File inFile = new File("1.txt");
        Scanner input = new Scanner(inFile);
        String str=input.nextLine();
        input.close();

        String[] split = str.split(",");
        int[] arr=new int[split.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(split[i]);
        }
        sort(arr,0,arr.length-1);

        File outFile = new File("2.txt");
        try (PrintWriter output = new PrintWriter(outFile);) {
            for (int i=0;i<arr.length;i++){
                if (i==arr.length-1){
                    output.print(arr[i]);
                }else{
                    output.print(arr[i]+",");
                }
            }
            output.close();
        }
    }


    private static void sort(int[] arr, int left, int right) {
        for(int i = 0; i< arr.length - 1; i++) {
            for(int j = 0;j< arr.length - i -1;j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

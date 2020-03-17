package test;

import java.util.Scanner;

/**
 * 给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，
 * 请你计算并返回该日期是当年的第几天。
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，
 * 依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 */
public class date {
    //IAmMemberOfPinganTech AmIPingTanechOMemfber
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] split = str.split(" ");
        String s1=split[0];
        String s2=split[1];
        int[] arr1=new int[255];
        int[] arr2=new int[255];
        if (s1.length()!=s2.length()){
            System.out.println("false");
            return;
        }

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)]++;
            arr2[s2.charAt(i)]++;
        }
        for(int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}

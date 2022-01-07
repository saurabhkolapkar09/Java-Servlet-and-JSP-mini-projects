package com.klp;
import java.io.*;
import java.util.*;
 
public class fungame {
 //   static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter print = new PrintWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(reader.readLine());
        int[] arr = new int[size];
        int beg = 0;
        int last = size - 1;
        String[] nums = reader.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        while (beg < size && last > -1) {
            if (arr[beg] > arr[last]) {
                print.print("1 ");
                last--;
            } else if (arr[beg] < arr[last]) {
                print.print("2 ");
                beg++;
            } else {
                print.print("0 ");
                beg++;
                last--;
            }
        }
        print.flush();
    }
}
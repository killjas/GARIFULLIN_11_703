package HomeWork;

import java.util.Scanner;
//22 a массивы
public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),k=0;
        int [] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=(int) Math.round(Math.random() * 100)-30;
            }
        for (int i=0;i<n-1;i++){
            if (a[i]*a[i+1]<0){
                k++;
            }
        }
        System.out.println(k);
    }
}

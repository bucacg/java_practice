package practice;

import java.util.Scanner;

public class Number {
    public static void main(String args[]){
        int number=0,d5,d4,d3,d2,d1;
        Scanner reader=new Scanner(System.in);
        System.out.println("输入一个1至99999之间的数");
        number=reader.nextInt();
        if (number<=99999&&number>=1)//判断number在1~99999之间的条件
        {
               d5=number/10000;   //计算number的最高位（万位）d5
               d4=number%10000/1000; //计算number的千位d4
               d3=number%1000/100;//计算number的百位d3
               d2=number%100/10;
               d1=number%10;
         if (d5!=0) //判断number是5位数
           {
            System.out.println(number + "是5位数");
            if (d1 == d5 && d2 == d4) {
                System.out.println(number + "是回文数");
            }
            else {
                System.out.println(number + "不是回文数");
            }
        }
        else if(d4!=0) //判断number是4位数
        {
            System.out.println(number + "是4位数");
            if (d1 == d4 && d2 == d3) {
                System.out.println(number + "是回文数");
            }
            else {
                System.out.println(number + "不是回文数");
            }
        }
        else if (d3!=0) //判断number是3位数
        {
            System.out.println(number + "是3位数");
            if (d1 == d3) {
                System.out.println(number + "是回文数");
            }
            else {
                System.out.println(number + "不是回文数");
            }
        }
        else if (d2!=0) //判断number是2位数
        {
            System.out.println(number + "是2位数");
            if (d1 == d2) {
                System.out.println(number + "是回文数");
            }
            else {
                System.out.println(number + "不是回文数");
            }
        }
        else if (d1!=0) //判断number是1位数
         {
             System.out.println(number + "是1位数");
             System.out.println(number + "是回文数");
         }
        }
        else
         {
             System.out.printf("\n%d不在1至99999之间",number);
         }
    }
}

package com.fox.os3;

import java.util.Scanner;

/**
 * @program: FCFS
 * @Date: 2022-10-11 10:51
 * @author: Fox0g
 * @description:
 */
public class PVApproach {

    public static void main(String[] args) {
        hThread2 h2 = new hThread2();


        String context = "";
        //System.out.println("请输入 w/r");
        Scanner scanner = new Scanner(System.in);

        while(!context.equals("exist")){
            System.out.println();
            System.out.println("--------------");
            System.out.println("请输入w/r/exist");
            context = scanner.next();
            if(context.equals("w") ){
                System.out.println("请输入字符:");
                context = scanner.next();
                h2.setText(context);
                h2.write();
            }else if(context.equals("r")){

                h2.read();
            }else {
                System.out.println("已退出");
                break;
            }
        }
    }
}

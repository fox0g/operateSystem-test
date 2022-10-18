package com.fox.os4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: FCFS
 * @Date: 2022-10-18 12:05
 * @author: Fox0g
 * @description:
 */
public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String si = "";

        int count;//总区
        int count1;//总区
        int amount;//分区

        System.out.print("请输入总内存大小：");
        si = scanner.next();
        count = Integer.valueOf(si.substring(0,si.length()-1));
        if(si.contains("G")){
             count = count * 1024;
        }

        System.out.println("----------分区---------");
        ArrayList<Process> processes = new ArrayList<>();
        count1 = count;
        while(!si.equals("y")){
            System.out.print("请输入该区大小：");
            si = scanner.next();
            amount = Integer.valueOf(si.substring(0,si.length()-1));
            if(si.contains("G")){
                count1 = amount * 1024;
            }
            count1 = count1 - amount;
            processes.add(new Process(amount,true));


            System.out.print("是否退出分区？（y/n）：");
            si = scanner.next();
        }
        if(count1 != 0){
            processes.add(new Process(count1,true));
        }

        System.out.println("----------进程---------");
        si = "";
        int tp;
        while(!si.equals("y")){
            System.out.print("请输入进程大小：");
            si = scanner.next();
            tp = Integer.parseInt(si);
            int index = 0;
            boolean change = false;
            for (Process process : processes) {
                if(process.isIs_empty() == true &&  process.getSize() >= tp){
                    if(process.getSize() > tp){
                        processes.add(index+1,new Process(process.getSize()-tp,true));
                    }
                    process.setIs_empty(false);
                    process.setSize(tp);

                    change = true;
                    break;
                }
                index++;
            }
            if(change == false){
                System.out.println("无法分配");
            }

            for (Process process : processes) {
                if(process.isIs_empty() == true){
                    System.out.println("Empty分区   --"+"占用内存："+process.getSize());
                }else if(process.isIs_empty() == false){
                    System.out.println("NotEmpty分区--"+"占用内存："+process.getSize());
                }

            }
        }
    }
}

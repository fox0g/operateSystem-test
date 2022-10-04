package com.fox.os2;

import java.util.ArrayList;

/**
 * @program: FCFS
 * @Date: 2022-10-04 10:58
 * @author: Fox0g
 * @description:
 */
public class BankApproach {
    public static void Bank(ArrayList<Process> processes,Resource available, int index,Resource request){

        for (Process process : processes) {
            available.setR1(available.getR1() - process.getAllocation().getR1());
            available.setR2(available.getR2() - process.getAllocation().getR2());
            available.setR3(available.getR3() - process.getAllocation().getR3());

        }

        if(request.getR1() > processes.get(index).getNeed().getR1() || request.getR2() > processes.get(index).getNeed().getR2() ||request.getR3() > processes.get(index).getNeed().getR3()){
            System.out.println( "request > need");
            return;
        }else{
            if(request.getR1() > available.getR1() || request.getR2() > available.getR2() || request.getR3() > available.getR3()){
                System.out.println("request > available");
                return;
            }else {
                available.setR1(available.getR1() - request.getR1());
                available.setR2(available.getR2() - request.getR2());
                available.setR3(available.getR3() - request.getR3());

                processes.get(index).setAllocation(new Resource(processes.get(index).getAllocation().getR1() + request.getR1(), processes.get(index).getAllocation().getR2() + request.getR2(), processes.get(index).getAllocation().getR3() + request.getR3()));

                processes.get(index).setNeed(new Resource(processes.get(index).getNeed().getR1() - request.getR1(), processes.get(index).getNeed().getR2() - request.getR2(), processes.get(index).getNeed().getR3() - request.getR3()));


                Resource work = new Resource();
                work = available;
                int count = 0;
                for (int i = 0; i < processes.size(); i++) {
                    if (processes.get(i).getNeed().getR1() <= work.getR1() && processes.get(i).getNeed().getR2() <= work.getR2() && processes.get(i).getNeed().getR3() <= work.getR3()) {
                        count++;

                        work.setR1(work.getR1() + processes.get(i).getAllocation().getR1());
                        work.setR2(work.getR2() + processes.get(i).getAllocation().getR2());
                        work.setR3(work.getR3() + processes.get(i).getAllocation().getR3());



                    }
                }
                if (count == processes.size()) {
                    System.out.println("处于安全状态");
                } else {
                    System.out.println("不处于安全状态");
                }
                System.out.println(count);
            }
        }




    }
}

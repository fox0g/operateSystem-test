package com.fox.os2;

import java.util.ArrayList;

/**
 * @program: FCFS
 * @Date: 2022-10-04 10:57
 * @author: Fox0g
 * @description:
 */
public class ProcessTest {

    public static void main(String[] args) {

        ArrayList<Process> processes = new ArrayList<>();
        processes.add(new Process(new Resource(7,5,3),new Resource(0,1,0),new Resource(7,4,3)));
        processes.add(new Process(new Resource(3,2,2),new Resource(2,0,0),new Resource(1,2,2)));
        processes.add(new Process(new Resource(9,0,2),new Resource(3,0,2),new Resource(6,0,0)));
        processes.add(new Process(new Resource(2,2,2),new Resource(2,1,1),new Resource(0,1,1)));



        BankApproach.Bank(processes,new Resource(10,5,7),0,new Resource(1,0,0));

    }
}

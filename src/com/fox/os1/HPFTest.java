package com.fox.os1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: FCFS
 * @Date: 2022-10-03 22:34
 * @author: Fox0g
 * @description:
 */
public class HPFTest {
    public static void main(String[] args) {
        ArrayList<JCB> JCBArr = new ArrayList<JCB>();
        String name;//作业名
        double arriveTime;//提交时间
        double workTime;//运行时间
        int priority;

        Scanner scanner = new Scanner(System.in);
        System.out.println("------请输入1开始输入作业：------");
        String scan = scanner.next();
        int index = 1;
        while(!scan.equals("0")){
            System.out.println("作业名：");
            scan = scanner.next();
            name = scan;

            System.out.println("提交时间：");
            scan = scanner.next();
            arriveTime = Double.valueOf(scan);

            System.out.println("运行时间：");
            scan = scanner.next();
            workTime = Double.valueOf(scan);

            System.out.println("优先级（0--无穷）：");
            scan = scanner.next();
            priority = Integer.valueOf(scan);

            JCBArr.add(new JCB(index++,name,arriveTime,workTime,priority));
            System.out.println("------1 继续 或 0 退出-------");
            scan = scanner.next();
        }

        /*
        JCBArr.add(new JCB("一",1,5));
        JCBArr.add(new JCB("四",4,2));
        JCBArr.add(new JCB("三",5,10));
        JCBArr.add(new JCB("二",10,5));
        */

        double sum1 = 0.0;
        double sum2 = 0.0;



        ArrayList<JCB> hpf = HPFApproach.HPF(JCBArr);

        System.out.println("作业名--开始时刻--完成时刻--周转时间--带权时间");
        for (JCB jcb : hpf) {
            System.out.println(jcb.getName()+"----"+jcb.getBeginTime()+"------"+jcb.getFinishTime()+"------"+(jcb.getFinishTime()-jcb.getArriveTime())+"------"+((jcb.getFinishTime()-jcb.getArriveTime())/jcb.getWorkTime()));
            sum1 = sum1 + jcb.getFinishTime()-jcb.getArriveTime();
            sum2 = sum2 + (jcb.getFinishTime()-jcb.getArriveTime())/jcb.getWorkTime();
        }


        System.out.println("平均周转时间:"+sum1/JCBArr.size());
        System.out.println("平均带权周转时间:"+sum2/JCBArr.size());
        System.out.println("------------------");

    }
}

package com.fox.os1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: FCFSApproach
 * @Date: 2022-09-27 11:37
 * @author: Fox0g
 * @description:
 */
public class test {
    public static void main(String[] args) {
        ArrayList<JCB> JCBArr = new ArrayList<JCB>();
        String name;//作业名
        double arriveTime;//提交时间
        double workTime;//运行时间

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

            JCBArr.add(new JCB(index++,name,arriveTime,workTime));
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


        ArrayList<JCB> fcfs = FCFSApproach.FCFS(JCBArr);
        ArrayList<JCB> sjf = SJFApproach.SJF(JCBArr);

        System.out.println("作业名--开始时刻--完成时刻--周转时间--带权时间");
        for (JCB fcf : sjf) {
            System.out.println(fcf.getName()+"----"+fcf.getBeginTime()+"------"+fcf.getFinishTime()+"------"+(fcf.getFinishTime()-fcf.getArriveTime())+"------"+((fcf.getFinishTime()-fcf.getArriveTime())/fcf.getWorkTime()));
            sum1 = sum1 + fcf.getFinishTime()-fcf.getArriveTime();
            sum2 = sum2 + (fcf.getFinishTime()-fcf.getArriveTime())/fcf.getWorkTime();
        }


        System.out.println("平均周转时间："+sum1/JCBArr.size());
        System.out.println("平均带权周转时间："+sum2/JCBArr.size());


    }
}

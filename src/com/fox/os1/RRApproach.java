package com.fox.os1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: FCFS
 * @Date: 2022-10-03 22:53
 * @author: Fox0g
 * @description:
 */
public class RRApproach {
    public static ArrayList<JCB> RR(ArrayList<JCB> JCBArr,double interval){
        for (int i = 0; i < JCBArr.size(); i++) {
            for (int k = i+1; k < JCBArr.size(); k++) {
                if(JCBArr.get(i).getArriveTime() > JCBArr.get(k).getArriveTime()){
                    Collections.swap(JCBArr,i,k);
                }
            }
        }
        ArrayList<JCB> workArr = new ArrayList<JCB>();

        System.out.println("作业名--开始时刻--完成时刻--周转时间--带权时间");

        int index = 0;
        double lastTime = 0.0;
        while(index < JCBArr.size()){
            JCB j = JCBArr.get(index);
            index ++;
            if(workArr.size() == 0 && !j.getStatus().equals("F")){
                j.setBeginTime(j.getArriveTime() + lastTime);
                lastTime += j.getBeginTime();
            }else if(workArr.size() != 0 && !j.getStatus().equals("F")){
                j.setBeginTime(lastTime);
                lastTime = j.getBeginTime();

            }
            if(j.getWorkTime() <= interval){
                j.setFinishTime(lastTime+j.getWorkTime());
                j.setStatus("F");
                System.out.println(j.getName()+"----"+j.getBeginTime()+"------"+j.getFinishTime()+"------"+(j.getFinishTime()-j.getArriveTime())+"------"+((j.getFinishTime()-j.getArriveTime())/j.getWorkTime()));
                lastTime = lastTime + j.getWorkTime();
                workArr.add(j);
            }else if(j.getWorkTime() > interval){
                j.setWorkTime(j.getWorkTime() - interval);
                j.setStatus("F");
                lastTime +=  interval;



                JCBArr.add(j);
            }

        }
       /* for (JCB j : JCBArr) {
            if(workArr.size() == 0){
                j.setBeginTime(j.getArriveTime());
                if(j.getWorkTime() <= interval){
                    j.setFinishTime(j.getBeginTime()+j.getWorkTime());
                    j.setStatus("F");

                    workArr.add(j);
                }else if(j.getWorkTime() > interval){
                    j.setWorkTime(j.getWorkTime() - interval);
                    JCBArr.add(j);
                }


            }else {
                j.setBeginTime(workArr.get(workArr.size()-1).getFinishTime());
                if(j.getWorkTime() <= interval){
                    j.setFinishTime(j.getBeginTime()+j.getWorkTime());
                    j.setStatus("F");
                    workArr.add(j);
                }else if(j.getWorkTime() > interval){
                    j.setWorkTime(j.getWorkTime() - interval);
                    JCBArr.add(j);
                }
            }

        }*/
        return workArr;
    }
}

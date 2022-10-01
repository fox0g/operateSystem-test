package com.fox.os1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: FCFS
 * @Date: 2022-09-27 22:28
 * @author: Fox0g
 * @description:
 */
public class SJFApproach {
    public static ArrayList<JCB> SJF(ArrayList<JCB> JCBArr){
        for (int i = 0; i < JCBArr.size(); i++) {
            for (int k = i+1; k < JCBArr.size(); k++) {
                if(JCBArr.get(i).getWorkTime() > JCBArr.get(k).getWorkTime()){
                    Collections.swap(JCBArr,i,k);
                }
            }
        }
        ArrayList<JCB> workArr = new ArrayList<JCB>();
        for (JCB j : JCBArr) {
            if(workArr.size() == 0){
                j.setBeginTime(j.getArriveTime());
                j.setFinishTime(j.getBeginTime()+j.getWorkTime());
                j.setStatus("F");
            }else {
                j.setBeginTime(workArr.get(workArr.size()-1).getFinishTime());
                j.setFinishTime(j.getBeginTime()+j.getWorkTime());
                j.setStatus("F");
            }
            workArr.add(j);
        }
        return workArr;
    }
}

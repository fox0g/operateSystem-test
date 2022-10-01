package com.fox.os1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: FCFSApproach
 * @Date: 2022-09-27 10:59
 * @author: Fox0g
 * @description:
 */
public class FCFSApproach {
    public static ArrayList<JCB> FCFS(ArrayList<JCB> JCBArr){
        for (int i = 0; i < JCBArr.size(); i++) {
            for (int k = i+1; k < JCBArr.size(); k++) {
                if(JCBArr.get(i).getArriveTime() > JCBArr.get(k).getArriveTime()){
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

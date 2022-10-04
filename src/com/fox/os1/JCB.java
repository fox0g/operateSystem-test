package com.fox.os1;

/**
 * @program: FCFSApproach
 * @Date: 2022-09-27 10:58
 * @author: Fox0g
 * @description:
 */
public class JCB {




    public double TAT;
    public double WTAT;
    public double serviceTime = 0;

    public int id;
    public String name;//作业名
    public double arriveTime;//提交时间
    public double workTime;//运行时间
    public String status = "W";//状态
    public int priority = 0;

    public double beginTime;
    public double finishTime;

    public JCB(){

    }
    public JCB(int id,String name,double arriveTime,double workTime,int priority){
        this.id = id;
        this.name = name;
        this.arriveTime = arriveTime;
        this.workTime = workTime;
        this.priority = priority;
    }

    public JCB(int id,String name,double arriveTime,double workTime){
        this.id = id;
        this.name = name;
        this.arriveTime = arriveTime;
        this.workTime = workTime;
    }


    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getArriveTime(){
        return arriveTime;
    }
    public void setArriveTime(double arriveTime){
        this.arriveTime = arriveTime;
    }
    public double getWorkTime(){
        return workTime;
    }
    public void setWorkTime(double workTime){
        this.workTime = workTime;
    }
    public String getStatus(){
        return  status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public int getPriority(){
        return priority;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }


    public double getBeginTime(){
        return beginTime;
    }
    public void setBeginTime(double beginTime){
        this.beginTime = beginTime;
    }
    public double getFinishTime(){
        return finishTime;
    }
    public void setFinishTime(double finishTime){
        this.finishTime = finishTime;
    }


}

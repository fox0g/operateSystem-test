package com.fox.os2;

/**
 * @program: FCFS
 * @Date: 2022-10-04 10:53
 * @author: Fox0g
 * @description:
 */
public class Process {

    public Resource max;
    public Resource allocation;
    public Resource need;

    public Process(Resource max,Resource allocation,Resource need){
        this.max = max;
        this.allocation = allocation;
        this.need = need;
    }

    public Resource getMax(){
        return  max;
    }
    public void setMax(Resource max){
        this.max = max;
    }
    public Resource getAllocation(){
        return  allocation;
    }
    public void setAllocation(Resource allocation){
        this.allocation = allocation;
    }
    public Resource getNeed(){
        return  need;
    }
    public void setNeed(Resource need){
        this.need = need;
    }
}

package com.fox.os2;

/**
 * @program: FCFS
 * @Date: 2022-10-04 11:03
 * @author: Fox0g
 * @description:
 */
public class Resource {
    int r1;
    int r2;
    int r3;

    public Resource(){}

    public Resource(int r1,int r2,int r3){
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    public int getR1(){
        return r1;
    }
    public void setR1(int r1){
        this.r1 = r1;
    }
    public int getR2(){
        return r2;
    }
    public void setR2(int r2){
        this.r2 = r2;
    }
    public int getR3(){
        return r3;
    }
    public void setR3(int r3){
        this.r3 = r3;
    }
}

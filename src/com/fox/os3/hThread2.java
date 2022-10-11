package com.fox.os3;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: FCFS
 * @Date: 2022-10-11 11:00
 * @author: Fox0g
 * @description:
 */
public class hThread2   {
    private static String str = "";
    //ReentrantLock lock = new ReentrantLock();
    public String text;

    public hThread2(String text){
        this.text = text;
    }

    public hThread2() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public void write() {

                if(str.length()<20 ){

                    if(text.length() < (20- str.length())){
                        str = str + text;
                        System.out.println("写："+text);
                    }else{

                        str = str + text.substring(0,20-str.length());
                        System.out.println("写："+text.substring(0,20-str.length()));
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("********");
                    System.out.println("缓冲区满！");

                }


    }
    public void read() {
        if(str.length() == 20){

            System.out.println("读："+str);
            str = "";

        }else{
            System.out.println("缓冲区未满！");

        }

    }
}

package com.fox.os4;

/**
 * @program: FCFS
 * @Date: 2022-10-18 10:52
 * @author: Fox0g
 * @description:
 */
public class Process {

    //private String name;
    private int size;
    private boolean is_empty;

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isIs_empty() {
        return is_empty;
    }

    public void setIs_empty(boolean is_empty) {
        this.is_empty = is_empty;
    }

    public Process() {
    }

    public Process(int size, boolean is_empty) {
        this.size = size;
        this.is_empty = is_empty;
    }

    @Override
    public String toString() {
        return "Process{" +
                ", size=" + size +
                ", is_empty=" + is_empty +
                '}';
    }
}

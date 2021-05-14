package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int totalCapacity;
    private int usedCapacity;
    private int availableCapacity;
    private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String name, int totalCapacity, String discType) {
        this.name = name;
        this.totalCapacity = totalCapacity;
        this.discType = discType;
    }

    public void writeData(int kb, ArrayList<String> content){
        if(kb < availableCapacity) {
            usedCapacity += kb;
            availableCapacity = totalCapacity - usedCapacity;
            contents = content;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }


    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", totalCapacity=" + totalCapacity +
                ", usedCapacity=" + usedCapacity +
                ", availableCapacity=" + availableCapacity +
                ", contents=" + contents +
                ", discType='" + discType + '\'' +
                '}';
    }
}

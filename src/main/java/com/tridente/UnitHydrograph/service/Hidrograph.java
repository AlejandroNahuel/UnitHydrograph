package com.tridente.UnitHydrograph.service;

public class Hidrograph {
    private int numberOfFlowIntervals;
    
    private int time[];
    
    private double flow[];
    
    private double peak;
    
    private int peakIndex;
    
    private double directRunoffVolume;
    
    public void setArraysLength(int numberOfIntervals){
        this.time = new int[numberOfIntervals];
        this.flow = new double [numberOfIntervals];
    }
    
    public void setPeak(double flow[]){
        this.peak = 0;
        for(int i=0; i<flow.length; i++){
            if(flow[i]>this.peak){
                this.peak = flow[i];
            }
        }
    }
    
    public double getPeak(){
        return this.peak;
    }
    
    public void setPeakIndex(double flow[]){
        double peak = this.getPeak();
        for(int i=0; i<flow.length; i++ ){
            
        }
    }
    public double setDirectRunoffVolume(){
        
        
        
        return 1;
    }
}

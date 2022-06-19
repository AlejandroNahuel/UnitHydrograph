package com.tridente.UnitHydrograph.service;

import lombok.Data;

@Data
public class Basin {
    private double area;
    
    private int unitTime;
    
    private float nCoefficient;
    
    private float kCoefficient;
    
    //Days from the peak to the end of the recess curve
    private int N;
    
    public int calculateN(float nCoefficient, float kCoefficient, double area){
        this.N = (int)Math.pow((area/kCoefficient),nCoefficient);
        
        return N;
    }
    
    public int setUnitTime(double area){
        if(area<50){
            return -1;
        }
        else if(area<260){
            this.unitTime = 2;
        }
        else if(area<2600){
            this.unitTime = 6;
        }
        else{
            this.unitTime = 12;
        }
        return unitTime;
    }    
}

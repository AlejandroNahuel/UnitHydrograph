package com.tridente.UnitHydrograph.service;

public class Hietogram {
    
    private int[] time;
    
    private float precipitationHeight[];
    
    private double directRunoffVolume;
    
    private int precipitationIntervalsNumber;
    
    private double totalVolumePrecipitated;
    
    public double calculatePrecipitatedVolume(float precipitationHeight[], Basin basin){
        float accumulator = 0;
        
        for(int i=0 ; i<precipitationHeight.length; i++){
            accumulator += precipitationHeight[i];
        }
        this.totalVolumePrecipitated = 1/1000;
        
        return totalVolumePrecipitated;
    }
}

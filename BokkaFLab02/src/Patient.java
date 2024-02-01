/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S571697
 */
public class Patient {
      private int patientId;
    private String patientName;
    private int daysOfStay;
    private double dayCost;
    {
        patientId = 1;
        patientName = "Jack";
        daysOfStay = 0;
        dayCost = 0.0;
    }
    public Patient(int patientId, String patientName, int daysOfStay, double dayCost) {
       this.patientId = patientId;
       this.patientName = patientName;
       this.daysOfStay = daysOfStay;
       this.dayCost = dayCost;        
    }
    public int getpatientId()
    {
        return patientId; 
    }
      public String getpatientName(){
            return patientName;
     }
    public int getdaysOfStay(){
        return daysOfStay;
    }
    public double getdayCost(){
        return dayCost;
    }
    public void setpatientId(int patientId)
    {
        this.patientId = patientId; 
    }
      public void setpatientName(String patientName){
            this.patientName = patientName;
     }
    public void setdaysOfStay(int daysOfStay){
        this.daysOfStay = daysOfStay;
    }
    public void setdayCost(double dayCost){
        this.dayCost = dayCost;
    }
    public double calculateTotalPrice(){
        return daysOfStay * dayCost;
    }
    
}

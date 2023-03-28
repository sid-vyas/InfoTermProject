/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.dataModels;

public class Encounter {
    String patientName;
    int beatsPerMinute;
    int temperature;
    String bloodPressure;
    String overallDiagnosis;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getOverallDiagnosis() {
        return overallDiagnosis;
    }

    public void setOverallDiagnosis(String overallDiagnosis) {
        this.overallDiagnosis = overallDiagnosis;
    }

    @Override
    public String toString() {
        return patientName;
    }
}

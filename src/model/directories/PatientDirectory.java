/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.directories;

import java.util.ArrayList;
import model.dataModels.Patient;

public class PatientDirectory {
    ArrayList<Patient> allPatients;
    
    public PatientDirectory() {
        this.allPatients = new ArrayList<>();
    }

    public ArrayList<Patient> getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(ArrayList<Patient> allPatients) {
        this.allPatients = allPatients;
    }
    
    public void addPatient(Patient newPatient) {
        this.allPatients.add(newPatient);
    }
    
    public void removePatient(Patient patient) {
        this.allPatients.remove(patient);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.directories;

import java.util.ArrayList;
import model.dataModels.Doctor;

public class DoctorDirectory {
    ArrayList<Doctor> allDoctors;
    
    public DoctorDirectory() {
        this.allDoctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getAllDoctors() {
        return allDoctors;
    }

    public void setAllDoctors(ArrayList<Doctor> allDoctors) {
        this.allDoctors = allDoctors;
    }
    
    public void addDoctor(Doctor newDoctor) {
        this.allDoctors.add(newDoctor);
    }
    
    public void removeDoctor(Doctor doctor) {
        this.allDoctors.remove(doctor);
    }
}
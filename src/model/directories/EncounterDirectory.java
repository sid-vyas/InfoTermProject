/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.directories;

import java.util.ArrayList;
import model.dataModels.Encounter;

public class EncounterDirectory {
    ArrayList<Encounter> allEncounters;
    
    public EncounterDirectory() {
        this.allEncounters = new ArrayList<>();
    }

    public ArrayList<Encounter> getAllEncounters() {
        return allEncounters;
    }

    public void setAllEncounters(ArrayList<Encounter> allEncounters) {
        this.allEncounters = allEncounters;
    }
    
    public void addEncounter(Encounter newEncounter) {
        this.allEncounters.add(newEncounter);
    }
    
    public void removeEncounter(Encounter encounter) {
        this.allEncounters.remove(encounter);
    }
}

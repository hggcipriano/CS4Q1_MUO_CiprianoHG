/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_muo_ciprianoHG;

/**
 *
 * @author Lenovo
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;
    
    public Singer(String n, int nOP, double e, Song fS){
        name = n;
        noOfPerformances = nOP;
        earnings = e;
        favoriteSong = fS;
        totalPerformances += noOfPerformances;
    }
    public void performForAudience(int numberOfPeople){
        noOfPerformances += 1;
        totalPerformances +=1;
        earnings += (100 * numberOfPeople);
    }
    public void performForAudience(int numberOfPeople, Singer collabChoice){
        int collabEarnings = (100 * numberOfPeople);
        earnings += collabEarnings/2;
        collabChoice.earnings += collabEarnings/2;
        noOfPerformances += 1;
        collabChoice.noOfPerformances += 1;
        totalPerformances += 1;
    }
    public void changeFavSong(Song newSong){
        favoriteSong = newSong;
    }
}
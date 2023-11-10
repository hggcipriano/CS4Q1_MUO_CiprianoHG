/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_muo_ciprianoHG;

/**
 *
 * @author Lenovo
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, int nOP, double e, Song fS){
        name = n;
        noOfPerformances = nOP;
        earnings = e;
        favoriteSong = fS;
    }
    public void performForAudience(int numberOfPeople){
        noOfPerformances += 1;
        earnings += (100 * numberOfPeople);
    }
    public void changeFavSong(Song newSong){
        favoriteSong = newSong;
    }
}

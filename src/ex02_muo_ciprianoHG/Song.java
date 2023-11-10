/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_muo_ciprianoHG;

/**
 *
 * @author Lenovo
 */
public class Song {
    String title;
    String artist;
    double duration;
    int streams;
    String status = "not playing";
    
    public Song(String t, String a, double d, int s){
        title = t;
        artist = a;
        duration = d;
        streams = s;
    }
    public void play(){
        status = "now playing";
    }
    public void pause(){
        status = "paused";
    }
}

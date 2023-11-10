/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_muo_ciprianoHG;

/**
 *
 * @author Lenovo
 */
public class Song {
    private String title;
    private String artist;
    private double duration;
    private int streams;
    private String status = "not playing";
    
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
    public String getTitle(){
        return title;
    }
}
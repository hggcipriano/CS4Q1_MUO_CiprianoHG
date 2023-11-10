/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_muo_ciprianoHG;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        //instances for Pen
        Pen pen1 = new Pen("Zebra Sarasa Clip", 90, 0.5);
        Pen pen2 = new Pen("Muji Gel Ink Ballpoint Pen", 55, 0.38);
        Pen pen3 = new Pen("Pilot G-Tec", 79, 0.4);
        
        //instances for Song
        Song song1 = new Song("Creep", "Radiohead", 3.97, 1317959997);
        Song song2 = new Song("Everybody Wants to Rule the World", "Tears for Fears", 4.18, 1262247000);
        Song song3 = new Song("Teddy Picker", "Arctic Monkeys", 2.75, 191184496);      
        
        //instance for Singer
        int audience = 12;
        Song title = song2;
        
        Singer singer1 = new Singer("Zild", 50, 250000, song1);
        singer1.performForAudience(audience);
        singer1.changeFavSong(title);
        
        System.out.println("Zild performed to " + audience + " audiences.");
        System.out.println("Zild's favorite song is changed to " + title.title + ".");
    }
}



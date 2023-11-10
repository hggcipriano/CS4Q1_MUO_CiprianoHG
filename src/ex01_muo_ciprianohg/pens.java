/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01_muo_ciprianohg;

/**
 *
 * @author Lenovo
 */
public class pens {
    public static void main(String[] args) {
        String pen1 = "Zebra Sarasa Clip";
        int pen1Price = 90;
        double pen1TipSize = 0.5;
        
        String pen2 = "Muji Gel Ink Ballpoint Pen";
        int pen2Price = 55;
        double pen2TipSize = 0.38;
        
        String pen3 = "Pilot G-Tec";
        int pen3Price = 79;
        double pen3TipSize = 0.4;
        
        System.out.println("Pen 1");
        System.out.println("Name: " + pen1);
        System.out.println("Price: PhP " + pen1Price);
        System.out.println("Tip Size: " + pen1TipSize + " mm\n");
        
        System.out.println("Pen 2");
        System.out.println("Name: " + pen2);
        System.out.println("Price: PhP " + pen2Price);
        System.out.println("Tip Size: " + pen2TipSize + " mm\n");
        
        System.out.println("Pen 3");
        System.out.println("Name: " + pen3);
        System.out.println("Price: PhP " + pen3Price);
        System.out.println("Tip Size: " + pen3TipSize + " mm\n");
        
        int result1 = pen1Price + pen2Price + pen3Price;
        double result2 = (pen1TipSize + pen2TipSize + pen3TipSize)/3;
        boolean result3 = ((pen2Price > pen1Price) || (pen2Price > pen3Price));
        
        System.out.println("Total Price: PhP " + result1);
        System.out.println("Average Tip Size: " + result2 + " mm");
        System.out.println("Muji is the most expensive: " + result3);
    }
}

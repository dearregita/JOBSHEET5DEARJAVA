/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Nita
 */
public class OperatorBitwise {
    public static void main(String [] args) {
       int x = 12 ; //dikonversi ke biner 0000 1100
       int y = 20;  //dikonversi ke biner 0001 1100
       int z;
       
       z = x | y ;
       System.out.println("hasil operasi bitwise OR: " +z);
       
       z = x & y ;
       System.out.println ("hasil operasi bitwise AND: " +z);
       
       z = x ^ y ;
       System.out.println ("hasil operasi bitwise XOR: " +z);
       
       z = ~x;
       System.out.println ("hasil operasi bitwise AND: " +z);
       
       z = x <<3 ;
       System.out.println("hasil dari bitwise shift left: " +z);
       
       z = x >>2 ;
       System.out.println("hasil dari bitwise shift right: " +z);
               
    }
    
    
}

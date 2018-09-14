package edu.escuelaing.arem.logic;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ListCalcs 
{
    public static LinkedList numbers = new LinkedList(); 
    public static double max;
    public static double min;
    public static double sum;
    public static double mul;
    
    public static void main( String[] args ) throws IOException
    { 
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        System.out.println("Sumatoria: "+sum);
        System.out.println("Multiplicatoria: "+mul);
    }
    
    public static double maximo(LinkedList set){
        double maxTemp = 0.0;
        double max = 0.0;
        for (int i = 0; i < set.size()-1; i++){
            double actual = (double) set.get(i);
            double siguiente = (double) set.get(i+1);
            if (actual >= siguiente){
                maxTemp = actual;
            }else{
                maxTemp = siguiente;
            }
            if(maxTemp >= max){
                max = maxTemp;
            }
        }     
        
        //Convierte el maximo a solo dos cifras decimales
        String decimalTemp = String.format("%.2f", max);
        max = Double.parseDouble(decimalTemp);
        
        return max;
    }
    
    public static double minimo(LinkedList set){
        double minTemp = (double) set.get(0);
        double min = (double) set.get(0);
        for (int i = 0; i < set.size()-1; i++){
            double actual = (double) set.get(i);
            double siguiente = (double) set.get(i+1);
            if (actual <= siguiente){
                minTemp = actual;
            }else{
                minTemp = siguiente;
            }
            if(minTemp <= min){
                min = minTemp;
            }
        }     
        
        //Convierte el maximo a solo dos cifras decimales
        String decimalTemp = String.format("%.2f", min);
        min = Double.parseDouble(decimalTemp);
        
        return min;
    }
    
    public static double sumatoria(LinkedList set){
        double sum = 0.0;
        for (int i = 0; i < set.size(); i++){
            sum += (double) set.get(i);
        }     
        
        //Convierte el maximo a solo dos cifras decimales
        String decimalTemp = String.format("%.2f", sum);
        sum = Double.parseDouble(decimalTemp);
        
        return sum;
    }
    
    public static double multiplicatoria(LinkedList set){
        double mul = 1.0;
        for (int i = 0; i < set.size(); i++){
            mul *= (double) set.get(i);
        }     
        
        //Convierte el maximo a solo dos cifras decimales
        String decimalTemp = String.format("%.2f", mul);
        mul = Double.parseDouble(decimalTemp);
        
        return mul;
    }
    
    public static LinkedList readInput(String set) {
        
        numbers.clear();
        for (String singleString: set.split(" ")){
            Double singleNumber = Double.parseDouble(singleString);
            numbers.add(singleNumber);
        }
        
        return numbers;
    }
    
    
}

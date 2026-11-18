/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    
    //First method to calculate the total product sales
    
    public int TotalProductSales(int[] sales) {
        
        int total = 0;
        
        for (int i= 0; i < sales.length; i++) {
        
        total += sales[i];
        
    }
        return total;
    }
    
    // Second method to calculate average products sold
    public double AverageSales(int[] sales) {
        
        int total = 0;
        
        for (int i = 0; i < sales.length; i++) {
            
            total += sales[i];
            
        }
        
        return (double) total/ sales.length;
    }
    
    // Third method to determine the most popular product
    public String PopularProduct(String[] sales, int[] totalSales) {
        
        int popular = totalSales[0];
        
        int index = 0;
        
        for (int i = 1; i < totalSales.length; i++) {
            
            if (totalSales[i] > popular) {
                
                index = i;
                
            }
        }
        
        return sales[index];
    }
}

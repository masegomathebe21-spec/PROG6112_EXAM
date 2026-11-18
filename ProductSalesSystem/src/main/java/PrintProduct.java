/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    public static void main(String[] args) {

    
        //Making object
        ProductSales ps = new ProductSales();
        
        //Showing report heading
        System.out.println("PRODUCT SALES REPORT - 2026");
        
        System.out.println();
        
        //Showing month heading
        System.out.printf("%-15s %10s %10s %10s%n",
                "PRODUCTS", "month 1", "month 2", "month 3" );
        
        System.out.println("-----------------------------------");
        
        //Showing product names and monthly sales
        for (int i = 0; i < products.length; i++) {
            
            System.out.printf("%-15s" , products[i]);
            
            for (int j = 0; j < productSales[i].length; j++) {
                
                System.out.printf("%10d", productSales[i][j]);
                
            }
            
            System.out.println();
            
            //Showing total,average, and the most popular product
            for (int i = 0; i < products.length; i++) {
                
                System.out.println("Product: " + products[i]);
                
                System.out.ptintln("Total sales: " + ps.ProductSales(sales[i]));
                
                System.out.printf("Average sales: %.2f%n" , ps.AverageSales(productSales[i]));
                
                System.out.println("Most popular product: " + ps.PopularProduct(products, totalSales));
                
                
                
            }
            
        }
        
    }

    
}

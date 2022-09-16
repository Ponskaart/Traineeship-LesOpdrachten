package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
       for (int x = 1; x < 11; x++) {
           System.out.println(x + " x 7 = " + (x * 7));
       }
        System.out.println("\n");
    }

    @Test
    public void tafelVan7WithWileLoop() {
        int counter = 1;
        int max = 10;

        while (counter <= max) {
            System.out.println(counter + " x 7 = " + (counter * 7));
            counter++;
        }
    }

    @Test
    public void executeMethod() {
        calculateTable(7);
        calculateTable(8);
    }

    public void calculateTable(int number){
        for (int x = 1; x < 11; x++) {
            System.out.println(x + " x " + number + " = " + (x * number));
        }
    }


}

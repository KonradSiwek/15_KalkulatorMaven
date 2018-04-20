/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;


public class LogikaKalkulatora {
        public static double oblicz(double i ,double j , String operacja){
        double wynik;
        switch(operacja){
          case "+":     return i+j;
          case "-":     return i-j;
          case "*":     return i*j;
          case "/":     return i/j;
          default :     return 0;
      
        }
        }
}

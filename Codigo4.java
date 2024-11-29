package com.generation;
import java.util.Scanner;
//Comenzamos en  agregar un metodo  main que hace la encapsulacion de la logica lo cual nos permite organizar y agrupar las funciones, la clase dentro del metodo la reutlizacion delas condicionales que las manda a llamar
//en  la entrada e solicita al jugador 1 y jugador 2 sus elecciones en la comparación: Se determina el ganador o empate.
//en la salida se agrega el break despues de cada caondicional  Se imprime el resultado y se cierra el scanner
  // Se agrego un metodo main para encapsular la logica
  public class Codigo4 {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
   
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();toLowerCase(); //agregamos toLowerCase para evitar problemas con mayusculas minusculas
     // Se elimino la repeticion de scanner en el de jugador 2
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j2 = s.next()toLowerCase();
     
    if (j1.equals(j2)){
      System.out.println("Empate");
    } else { // elige al ganador
      int g = 2; // jugador 2
      
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { //agregamos equals
            g = 1;
          }
        break; //agregamos break para romper y la condicional y separar los resultados
        case "papel":
          if (j2.equals("piedra") ) {
            g = 1;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break; // se agrega break igual que a los previos condicionales
        default:
      }
      //imprimir resultado
      System.out.println("Esa no es una opcion");  //se le pone men  saje por default
      return;

      System.out.println("Gana el jugador " + g);
    
  	


    }
    s.close(); //se cierra scanner
  }
    
  }
  
}
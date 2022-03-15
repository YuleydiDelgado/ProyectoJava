
package Demostracion;


public class Ejercicio1 {

   
    public static void main(String[] args) {
            Scaner leer;
        leer = new Scaner (System.in);
      System.out.println("Ingrese el valor de n1");
      int x= leer.nextInt();
      System.out.println("Ingrese el valor de n2");
      int y= leer.nextInt();
      
      Ejemplo1.sumar(x, y);
      
      int resta = restar(x, y);
      System.out.println("La resta es: " + resta);
      
      Ejemplo1.multiplicando(12, 5, "Mario");
      
    }
    
    private static void sumar(int a, int b,){
        
  
        int suma= a+b;
        System.out.println("La suma es: "+ suma);
    }
    
    private static int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }
    
    private static void multiplicar(int paco, int mario, String nombre) {
        int mul = paco * mario;
        System.out.println("La multiplicacion es: " + mul);
        System.out.println("Su nombre es: " + nombre);
    }

    private static class Ejemplo1 {

        
        }

        private static void multiplicando(int i, int i0, String mario) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        }
    
      
        
    
    

    

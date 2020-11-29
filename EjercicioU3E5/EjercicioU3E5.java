package ejerciciou3e5;
import java.util.Scanner;
public class EjercicioU3E5 {
        public static void main(String[] args) {
        EjercicioU3E5 metodo = new EjercicioU3E5();
        Pilas p = new Pilas();
        Pilas p2 = new Pilas();
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int dato;
        do {
            salir = false;
             System.out.println("Metodo de una pila");
             System.out.println("1.- Insertar");
             System.out.println("2.- Sacar");
             System.out.println("3.- Mostrar Cima");
             System.out.println("4.- Generar Números");
             System.out.println("5.- Vaciar Pila");
             System.out.println("6.- ¿La Pila Esta Vacia?");
             System.out.println("7.- Mostrar Pila");
             System.out.println("8.- Tamaño Pila");
             System.out.println("9.- Salir");
             
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese un numero");
                    dato = leer.nextInt();
                    metodo.insertar(p, p2, dato);
                    break;
                case 2:
                    if (!p.isEmpty()) {
                        System.out.println("Numero elimidado: " + p.pop());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 3:
                    if (!p.isEmpty()) {
                        System.out.println("Ultimo numero agregado: " + p.peek());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 4:
                    metodo.Random(p, p2);
                    System.out.println("Numeros random generados");
                    break;
                case 5:
                    p.Empty();
                    break;
                case 6:
                    if (p.isEmpty()) {
                        System.out.println("La pila esta vacia");
                    } else {
                        System.out.println("La pila tiene " + p.size());
                    }
                    break;
                case 7:
                    if (!p.isEmpty()) {
                        System.out.println("Pila 1: ");
                        p.Mostrar();
                        System.out.println("\nPila 2: ");
                        p2.Mostrar();
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 8:
                    System.out.println("Tamaño de la pila: " + p.size());
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("");
        } while (!salir);
    }
    
    public void Random(Pilas p, Pilas p2) {
        
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 500) + 50;
            insertar(p, p2, n);
        }
    }
    
    public void insertar(Pilas p, Pilas p2, int d) {
        if (p.isEmpty()) {
            p.push(d);
        } else {
            int cima = p.pop();
            if (d >= cima) {
                p.push(cima);
                p.push(d);
            } else {
                p.push(cima);
                p2.push(d);
            }
        }
    }
    

    
    
}

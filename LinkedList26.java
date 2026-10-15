import java.util.Scanner;

public class LinkedList26 {
    public static void main(String[] args) {
        linkedList ll=new linkedList(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.printList();
        System.out.println("DATOS ADICIONALES");
        ll.getHead();
        ll.getTail();
        ll.getLength();
        System.out.println("Probando REMOVE 50");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 40");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 30");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 20");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 10");
        System.out.println( ll.removeLast().value );
        System.out.println("Probando REMOVE vacio");
        System.out.println( ll.removeLast() );
        ll.append(100);
        System.out.println("IMPRIME LISTA CON 100");
        ll.printList();
        ll.append(200);
        System.out.println("IMPRIME LISTA CON 100 Y 200");
        ll.printList();
        // prepend 
        System.out.println("Probando PREPEND con N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ll.prepend(n);
        System.out.println("Nueva lista");
        ll.printList();
       
        // removeFirst
        System.out.println("Probando RemoveFirst");
        System.out.println(ll.RemoveFirst().value);
        
        //Insert
        System.out.println("Probando Insert con indice 2, valor 100");
        System.out.println(ll.insert(2, 100));
        System.out.println("nueva lista:");
        ll.printList();
        
        //REMOVE 
        
        System.out.println("Probando Remove");
        System.out.println("Remove:"+ ll.Remove(2).value);
        System.out.println("nueva lista:");
        ll.printList();
        
        // MEDIO - 2 punteros sin usar length
       System.out.println("Probando MEDIO");
       System.out.println("Valor:");
       System.out.println(ll.medio().value);
       System.out.println("Lista:");
       ll.printList();


      // REVERSE - con 3 apuntadores
      System.out.println("Probando REVERSE");
      ll.reverse();
      System.out.println("Lista al reves:");
      ll.printList();
    }
   
}
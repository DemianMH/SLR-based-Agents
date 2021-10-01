//Demian Mora Hernandez
//SIMULACION
//Hands-on 5: SLR-based Agents
//30_09_21
package simpjade;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;

public class SimpJade extends Agent{
Scanner scanner= new Scanner(System.in);
    
@Override
public void setup (){
    Metslr slr = new Metslr();
    //Pedir cuantos datos tiene el usuario
       
    System.out.println("Cantidad de datos: ");
    int n= scanner.nextInt();
    int numx[]=new int [n];
       int numy[]=new int [n];
       slr.arrX(numx);
       slr.arrY(numy);
       
       double xpory=slr.Opemult(numx, numy);
       double x1=slr.OpeX1(numx);
       double x2=slr.OpeX2(numx);
       double y1=slr.OpeY1(numy);
       
       double y =y1/n;
       double x =x1/n;
       
       double b1=((n*xpory)-(x1*y1))/((n*x2)-(x1*x1));
       double b0= y-(b1*x);
       System.out.println("Valor de Beta 1: "+b1);
       System.out.println("\nValor de Beta 0: "+b0);

       addBehaviour(new MyOneshotBehaviour());
}  

private class MyOneshotBehaviour extends OneShotBehaviour {

        @Override
        public void action() {
            System.out.println("Agente ejecutado");
        }

        @Override
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}

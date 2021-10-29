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
    
//Matrices
     int x[]={23,26,30,34,43,48,52,57,58};
    int y[]={651,762,856,1063,1190,1298,1421,1440,1518};
    
@Override
public void setup (){
    Opeslr slr = new Opeslr();
    Betas betas = new Betas();
    int n= 9;
   
       
       double xpory=slr.Opemult(x, y);
       double x1=slr.OpeX1(x);
       double x2=slr.OpeX2(x);
       double y1=slr.OpeY1(y);
       
       double y =y1/n;
       double x =x1/n;
       
       double b1 = betas.beta1(n, xpory, x1, y1, x2);
        double b0 = betas.beta0(y, b1, x);
        
       System.out.println("Beta 0: "+b0);
       System.out.println("\nBeta 1: "+b1);

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

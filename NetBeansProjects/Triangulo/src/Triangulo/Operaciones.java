package Triangulo;
import java.util.*;
/**
 *
 * @author Stivenson
 */
public class Operaciones {
    private double l1,l2,l3;
    private double[] retorna;
    public  Operaciones (double p1,double p2,double p3){
     l1=p1;l2=p2;l3=p3;
     retorna=new double[3];
     retorna[0]= l1;
     retorna[1]= l2;
     retorna[2]= l3;
     Arrays.sort(retorna);
    }

     public String getTipo(){
        if(l1==l2 || l2==l3 || l1==l3)
            if(l1==l2 && l2 == l3)
                return("Equilatero");
            else
                return("Isósceles");
        else
            return("Escaleno");
      }


      public double gethipotenusa(){return retorna[2];}
      public double getCatetoOpuesto(){return retorna[1];}
      public double getCatetoAdyacente(){return retorna[0];}
      public double getAnguloAlfa(){
       double x = retorna[0];
       double y = retorna[1];

	double r = Math.hypot(x, y);
	double aRad = Math.atan2(y, x);
	double a = Math.toDegrees(aRad);

	return(a);
      }
       public double getAnguloTeta(){
       double x = retorna[1];
       double y = retorna[0];

	double r = Math.hypot(x, y);
	double aRad = Math.atan2(y, x);
	double a = Math.toDegrees(aRad);

	return(a);
      }
      public String getSeno(){return (String.valueOf(retorna[1])+"/"+String.valueOf(retorna[2]));}
      public String getCoseno(){return (String.valueOf(retorna[0])+"/"+String.valueOf(retorna[2]));}
      public String getTangente(){return (String.valueOf(retorna[1])+"/"+String.valueOf(retorna[0]));}
      public String getSecante(){return (String.valueOf(retorna[2])+"/"+String.valueOf(retorna[0]));}
      public String getCosecante(){return (String.valueOf(retorna[2])+"/"+String.valueOf(retorna[1]));}
      public String getCotangente(){return (String.valueOf(retorna[0])+"/"+String.valueOf(retorna[1]));}

}

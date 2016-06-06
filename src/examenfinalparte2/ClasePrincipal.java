
package examenfinalparte2;

public class ClasePrincipal {

    public static boolean p = false;
    
    public static void main(String arg[])
        {
        int dig=2;
        int ndig=0;
        if(dig<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        for(int w = 1; w <= 99999; w++ )
        {
            int aux = w;
 
            int contador=0;
 
            while (aux != 0)
        {
            aux = aux / 10;
            contador++;
        }
        ndig=contador;
            
            
            if(ndig==dig){
                   if (w < 4) p = true;
            else
            {
            if (w % 2 == 0) p = false; 
                else
                {
                    int contador1 = 0;  
                    int i1 = 1; 
                    int k = (w - 1) / 2; 
                    if  (k % 2 == 0) k--;  
             
                    while(i1 <= k)
                    {
                        if (w % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = k + 1;
                    }
 
        if (contador1 == 1) p = true;
            } 
        } 
     
                if (p == true) 
                    System.out.println(w);    
            }
        }
        }
 
       
 
    
}


package examenfinalparte2;

public class ClasePrincipal {

    public static boolean p = false;
    
    public static void main(String arg[])
        {
        int digitos=2;
        int numeroDigitos=0;
        introducirNumDigitos(digitos);
        for(int w = 1; w <= 99999; w++ )
        {
            int auxiliar = w;
 
            int contador=numContador(auxiliar);
        numeroDigitos=contador;
            
            
            if(numeroDigitos==digitos){
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
     
                resultado(w);    
            }
        }
        }

    public static int numContador(int auxiliar) {
        int contador=0;
        while (auxiliar != 0)
        {
            auxiliar = auxiliar / 10;
            contador++;
        }
        return contador;
    }

    public static void resultado(int w) {
        if (p == true)
            System.out.println(w);
    }

    public static void introducirNumDigitos(int digitos) {
        if(digitos<=0)
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
    }
 
       
 
    
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner.*;
public class NumerosPrimos{
    public static void main(String[] args) {
        int limite;
        int NumerosP[];
        ArrayList<Integer> primos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("______________________________________________________________");
            System.out.print("Ingrese el limite en el que esta buscando los numeros primos \n Recuerda que este debe de ser un numero positivo\nNumero: ");
            limite = sc.nextInt();
        }while(limite<=0);
        System.out.println("__________________________________________________________________");

        NumerosP = new int[limite];
        for(int i=0;i<limite;i++){
            NumerosP[i]=0;
        }
        for(int i=2;i<limite;i++){
            if(NumerosP[i]==0){
                for(int j=2*i;j<limite;j=j+i){
                    NumerosP[j]=1;
                }
            }
        }
        for(int i=2;i<limite;i++){
            if(NumerosP[i]==0){
                primos.add(i);
            }
        }
        System.out.println("Los numeros primos son: ");
        for(int i=0;i<primos.size();i++){
            if(i!=(primos.size()-1)){
                System.out.print(primos.get(i)+", ");
            }
            else{
                System.out.print(primos.get(i)+".");
            }
        }
    }
 
 //Powered by EN-Coders
}

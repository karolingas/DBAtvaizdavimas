import com.pamokos.db.atvaizdavimas.Atvaizdavimas;



public class Main {



    public static void main(String[] args) {

        Atvaizdavimas objektas= new Atvaizdavimas();

        objektas.pasisveikink();
        while (true) {

            objektas.paklausk();

            objektas.nuspresk();
        }
        // write your code here

    }

}
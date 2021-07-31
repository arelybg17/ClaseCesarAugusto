package co.edu.utp.misiontic2022.c2.cdiaz;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;

//import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // var nombre = "César";
        // System.out.println(saludo(nombre));

        //var input = new Scanner(System.in);

        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Por favor ingrese un número: ");

        //var numero = input.nextInt();

        // var entrada = input.readLine();
        // var numero = Integer.parseInt(entrada);

        //System.out.printf("el número tiene %d cifras\n ", numDigitos(numero));

        //var entrada = JOptionPane.showInputDialog(null, "Por favor ingrese un número");
        //var numero = Integer.parseInt(entrada);

        //JOptionPane.showMessageDialog(null, String.format("El número tiene %d cifras\n", numDigitos(numero)));

        //input.close();

        System.out.println(numeroSuerte("12/07/1980"));
        System.out.println(numeroSuerte("29/05/1980"));

    }

    public static String saludo(String nombre) {
        return "Hola " + nombre + " ! ";

    }

    public static int numDigitos(int numero) {

        var contador = 0;

        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    public static int numeroSuerte(String fechaNacimiento) { //"dd/MM/yyyy"->"12/07/1980"
        var indiceSeparador = fechaNacimiento.indexOf('/');
        var dia = Integer.parseInt(fechaNacimiento.substring(0, indiceSeparador));
        var indiceSeparadorMes = fechaNacimiento.indexOf('/', ++indiceSeparador);
        var mes = Integer.parseInt(fechaNacimiento.substring(indiceSeparador, indiceSeparadorMes++));
        var ano = Integer.parseInt(fechaNacimiento.substring(indiceSeparadorMes));
        /*
        var datos = fechaNacimiento.split("/");
        dia = datos[0];
        mes = datos[1];
        ano = datos[2];
        */

        var suma = dia + mes + ano;
        var resultado = 0;
        while (suma != 0) {
            resultado += suma % 10;
            suma /= 10;
        }

        return resultado;
    }

}

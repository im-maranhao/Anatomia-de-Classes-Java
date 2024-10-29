package edu.miriam.segundaSemana;

public class MinhaClasse{

    public static void main(String [] args){
        
        // System.out.print("Olá Mundo");
        String primeiroNome = "Miriam";
        String segundoNome = "Maranhão";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
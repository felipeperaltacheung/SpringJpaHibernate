package com.educandoweb.springjpahibernate;

import java.util.Optional;

public class OptionalTeste {
    public static void main(String[] args) {

        String s = "ExemploComString";
        Optional<Integer> numero = converteEmNumero(s);
        System.out.println(numero); //Optional[1]

    }

    public static Optional<Integer> converteEmNumero(String numeroStr){ //metodo para retornar um numero
        try{
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(Integer);
        }catch(Exception e){
            return Optional.empty();
        }
    }
}

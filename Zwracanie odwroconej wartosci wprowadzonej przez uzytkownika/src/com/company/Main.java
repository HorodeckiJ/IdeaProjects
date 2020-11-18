package com.company;
import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Wpisz wartość, która ma zostać odwrócona:");
        String input = scan.nextLine();


        StringBuilder input1 = new StringBuilder();

        //dodajesz string do StringBuildera input1
input1.append(input);

// robisz odwrotnego StringBuildera input1
        input1 = input1.reverse();
        // drukuj odwrócony string
        System.out.println(input1);

//metoda druga za pomocą konwersji String na Byte
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Wpisz wartość, która ma zostać odwrócona (Metoda nr.2):");
        String input2 = scan1.nextLine();
        //metoda getBytes() do konwersji stringa na byte[]
        byte[] strAsByteArray = input2.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        //Zastosuj odwrotny wynik w result byte[]

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length -i-1];

        System.out.println(new String(result));





    }
}

package javaBasico;

public class array {
    public static void main(String[] args) {


        // String inicializam como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        /*
        System.out.println(ninja[5]);
        */

        // Redeclarar array
        String[] ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }



        // Int inicializam como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);

        // Boolean inicializam como Falss
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Double inicializam como 0.0

        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    

    }
}

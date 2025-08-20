package Dados;

import java.util.Scanner;
import java.util.Random;
public class GirarDados {
    public static void main(String[] args) {
        Random random = new Random();
        int opc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual dado você gostaria de girar?");
        System.out.println("4   --> D4");
        System.out.println("6   --> D6");
        System.out.println("8   --> D8");
        System.out.println("10  --> D10");
        System.out.println("12  --> D12");
        System.out.println("20  --> D20");
        System.out.println("100 --> D100");
        System.out.println();
        opc = scanner.nextInt();
        System.out.println();

        switch (opc) {
            case 4:
                System.out.println(d4(random));
                break;
            case 6:
                System.out.println(d6(random));
                break;
            case 8:
                System.out.println(d8(random));
                break;
            case 10:
                System.out.println(d10(random));
                break;
            case 20:
                System.out.println(d20(random));
                break;
            case 100:
                System.out.println(d100(random));
                break;
        }
    }

    public static int d4(Random random){
        int randomNum4 = random.nextInt(4);
        return randomNum4 + 1;
    }

    public static int d6(Random random) {
        int randomNum6 = random.nextInt(6);
        return randomNum6 + 1;
    }

    public static int d8(Random random) {
        int randomNum8 = random.nextInt(8);
        return randomNum8 + 1;
    }

    public static int d10(Random random) {
        int randomNum10 = random.nextInt(10);
        return randomNum10 + 1;
    }
     public static int d12(Random random) {
        int randomNum10 = random.nextInt(10);
        return randomNum10 + 1;
    }
    public static int d20(Random random) {
        int randomNum20 = random.nextInt(20);
        return randomNum20 + 1;
    }

    public static int d100(Random random) {
        int randomNum100 = random.nextInt(100);
        return randomNum100 + 1;
    }



}


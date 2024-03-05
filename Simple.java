import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        String newline = System.lineSeparator();

        System.out.println("Wybierz wzór : " + newline + "1) Obwód kwadratu" + newline + "2) Pole kwadratu");
        Scanner choice = new Scanner(System.in);
        int option = choice.nextInt();

        

        switch (option) {
            case 1, 6 -> {
                System.out.println("Podaj bok kwadratu aby wyliczyć jego obwód");
                Scanner sc = new Scanner(System.in);
                int sideLength =  sc.nextInt();
                System.out.println("Obwód kwadratu : " + (sideLength * 4));
                break;
            }
                
                
            case 2 -> {
                System.out.println("Podaj bok kwadratu by wyliczyć jego pole");
                Scanner pk = new Scanner(System.in);
                int pole = pk.nextInt();
                System.out.println("Pole kwadratu : " + (Math.pow(pole, 2)));
                break;
            }

            default -> {
                System.out.println("Wybraną inną opcje");
                break;
            }
                
        }


        // if(option == 1){
        //     System.out.println("Podaj bok kwadratu aby wyliczyć jego obwód");
        //     Scanner sc = new Scanner(System.in);
        //     int sideLength =  sc.nextInt();
        //     System.out.println("Obwód kwadratu : " + (sideLength * 4));
        // }
        // else {
        //     System.out.println("Podaj bok kwadratu by wyliczyć jego pole");
        //     Scanner pk = new Scanner(System.in);
        //     int pole = pk.nextInt();
        //     System.out.println("Pole kwadratu : " + (Math.pow(pole, 2)));
        // }
    }
}


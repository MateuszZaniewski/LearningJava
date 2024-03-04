public class PrimitiveCompare {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("A: " + a);
        int b = 3;
        System.out.println("B: " + b);
    
        System.out.println(a == b); // true
        System.out.println(a == 3); // true
        System.out.println(a == '3'); // false

        Integer c = 300;
        Integer d = 300;
        // Za kazdym razem gdy tworzymy nowy Integer powyżej 128 to rezerowana jest dla niego nowe miejsce w stosie!
        // Gdy weżmiemy mniejsza liczbę niż 128 to obie liczby będą miały te same referencje w stosie i będą takie same!
        System.out.println(c == d); // false

        // W tym wypadku obie liczby są takie same, poniważ mają zarezerwowaną te same miejsce pamięci!
        Integer e = 100;
        Integer f = 100;
        System.out.println(e == f); // true

        // Metodą 'equals' sprawdza realną wartość zmiennej, nie patrzy na to w którym miejscu jest ona zarezerwowana z stosie, dlatego też obie c jest równe d!
        System.out.println(c.equals(d));

        // Tworzymy dwa string, które posiadają taką samą referncję w stosie dlatego są równoważne.
        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println(s1 == s2); // true

        String s3 = new String("Cat");

        // Tworzy się nowy string w String poolu i rezerwuje nowy adres w pamieci stosu, dlatego wartości nie są takie same.
        System.out.println(s1 == s3); //false
    }
}

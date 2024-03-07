
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);

        // System.out.println(array.get(0));

        int[] array2 = new int[10];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[8] = 8;

        Arrays.sort(array2);
        // System.out.println(Arrays.toString(array2));

        String[] tablica = {"Mateusz", "Tadeusz", "Paulina"};
        
        // for(int i = 0; i < tablica.length; i++){
        //     System.err.println(tablica[i]);
        // }

        ArrayList<String> wyrazy = new ArrayList<>();
        wyrazy.add(0, "Mateusz" );
        wyrazy.add(1, "Tadeusz" );
        wyrazy.add(2, "Paulina" );
        wyrazy.addLast("Ostatni element");
        wyrazy.addFirst("Pierwszy element");
        // System.out.println(wyrazy.contains("Mateusz"));
        wyrazy.forEach((element) -> {
            System.err.println(element);
        });

        // for(int i = 0; i < wyrazy.size() ; i++){
        //     System.out.println(wyrazy.get(i));
            
        // }



    //    int[] array1 = {1,2,3,4};
    //    for(int i = 0; i < array1.length; i++){
    //     System.out.println(array1[i]);
    //    }
    // int x = 0;
    //    while (x < 10) {
    //     System.out.println("X ma wartość: " + x);
    //     x++;
    //    }
    }
}

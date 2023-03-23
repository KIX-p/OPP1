import napoje.Napoje;
import napoje.Sok;
import napoje.Woda_gazowana;
import napoje.Woda_mineralna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    /*
    2. Stwórz klasę abstrakcyjną Napoje, która zawiera pole tekstowe nazwa oraz metodę abstrakcyjną pij().

3. Stwórz 3 klasy dziedziczne (dziedziczące po klasie Napoje). Każda klasa powinna zawierać
charakterystyczne dla siebie metody/pola.

4. W main stwórz listę przechowywująca po jednym obiekcie z każdej klasy dziedziczącej
po klasie Napoje. Przeiteruj po liście i wykonaj na każdym obiekcie metodę pij

5. Posortuj listę alfabetycznie polu nazwa, a drugorzędnie po nazwie klasy. Wykorzystaj
metodę sort oraz koncepcję klas anonimowych lub wyrażenie lambda.

6. Stwórz interfejs KochajacyProgramowac mający metodę programuj().

7. Stwórz obiekt klasy anonimowej implementującej interfejs KochajacyProgramowac.

8. Stwórz wyrażenie lambda przyjmujące Stringa i zwracające jego długość. Wykorzystaj odpowiedni
predefiniowany interfejs funkcyjny. Wywołaj lambdę.

9. Stwórz wyrażenie lambda przyjmujące int i wyświetlające na ekranie „Dostanę ocenę: <<ocena>>” .
Wykorzystaj odpowiedni predefiniowany interfejs funkcyjny. Wywołaj lambdę.

10. Stwórz wyrażenie lambda które przyjmie na wejście dwie liczby całkowite pomnoży je ze sobą i
zwróci iloczyn. Wykorzystaj odpowiedni predefiniowany interfejs funkcyjny. Wywołaj lambdę.

11. Zacommituj zmiany.
     */
    public static ArrayList<Napoje> napojes = new ArrayList<>();
    public static void main(String[] args) {
        //zad4
        napojes.add(new Woda_gazowana("mocny"));
        napojes.add(new Sok("bananowy"));
        napojes.add(new Woda_mineralna("cecha"));
        System.out.println(napojes);
        for (Napoje napoje : napojes)
        {
            napoje.pij();
        }
        //zad5
        Comparator<String> n = (o1,o2) -> o1.length() - o2.length();
        napojes.sort(n);

        //zad7
        KochajancyProgramowac kochajancyProgramowac=new KochajancyProgramowac() {
            @Override
            public void programuj() {

            }
        };
        //zad8
        String napis="adsfgdfhg";
        Function<String, Integer> dl = (String x) -> x.length();
        System.out.println(dl.apply(napis));



        //zad9
        int ocena=4;
        Consumer<Integer> oc = (Integer f) -> System.out.println("dostane ocene: " + ocena);
        oc.accept(ocena);

        //zad10
        int a1=4;
        int b2=5;
        BiFunction<Integer,Integer,Integer> mnoz = (Integer x, Integer v) -> x*v;
        System.out.println(mnoz.apply(a1,b2));
    }


}
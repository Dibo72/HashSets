import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();

        lista.add("Pepe");
        lista.add("Jose");
        lista.add("Pepe");
        lista.add("Ana");

        for(String s: lista){
            System.out.println(s);
        }
    }
}
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet <String> hash = new HashSet<String>();

        hash.add("Laimer");
        hash.add("Davies");
        hash.add("Kimmich");
        hash.add("Goretzka");

        hash.remove("Laimer");
//        hash.clear();

        System.out.println(hash);
        System.out.println(hash.size());
        System.out.println(hash.contains("Davies"));





    }
}
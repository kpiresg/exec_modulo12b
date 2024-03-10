import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pegaNome();
    }

    private static void pegaNome() {

        Scanner scanName = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();
        String name;
        String[] names;

        System.out.println("Digite nomes separados por virgula: (Exemplo: Lucas,Maria,Joao...)");
        name = scanName.nextLine();
        scanName.close();
        names = name.split(",");

        for(int i = 0; i < names.length; i++) {
            nameList.add(names[i]);
        }
        
        Collections.sort(nameList);
        
        for (String nome : nameList) {
            System.out.println(nome);
        }
    }
}

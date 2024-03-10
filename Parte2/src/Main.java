import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static Person person = new Person(null, null);
    public static Map<String, List<Person>> listPeaplo = new TreeMap<>();
    public static List<Person> peaploListM = new ArrayList<>();
    public static List<Person> peaploListF = new ArrayList<>();
    
    public static void main(String[] args) {
        
        System.out.println("\n" + "Digite o nome e depois '-F' ou '-M' para definir o sexo. (Exemplos: Lucas-M, Sophia-F, Joao-M...)");
        inputPeaplo();
        repeatPeaplo();
        getGender();
        
        listPeaplo.put("M", peaploListM);
        listPeaplo.put("F", peaploListF);
    }
    
    private static List<Person> inputPeaplo() {
        
        Scanner scanPerson = new Scanner(System.in);
        Scanner scanGender = new Scanner(System.in);
        
        String name = scanPerson.nextLine();
        String[] ref = name.split("-");
        
        Person person = new Person(ref[0], ref[1]); 
        
        if (ref[1].equals("M")) {
            peaploListM.add(person);
            return peaploListM;
        } else {
            peaploListF.add(person);
            return peaploListF;
        }
    }
    
    private static void repeatPeaplo() {

        Scanner scanVerifyRepeat = new Scanner(System.in);
        Scanner scanVerifyRepeatString = new Scanner(System.in);
        
        System.out.println("\n" + "Deseja adicionar mais? (Se sim, digite 'sim')");
        String verifyRepeatString = scanVerifyRepeatString.nextLine();

        if (verifyRepeatString.equalsIgnoreCase("sim")) {
            System.out.println("\n" + "Digite o numero de pessoas que deseja adicionar:");
            int scanVerify = scanVerifyRepeat.nextInt();
            for (int i = 0; i < scanVerify; i++) {
                System.out.println("Adicione: ");
                inputPeaplo();
            }
        }
    }

    private static void getGender() {

        Scanner scanLetter = new Scanner(System.in);
        
        System.out.println("\n" + "Para ver lista de Masculino, digite 'M'. Para ver de Feminino, digite 'F'.");
        String Letter = scanLetter.nextLine();
        
        if (Letter.equalsIgnoreCase("M")) {
            showPeaploM();
        } else {
            showPeaploF();
        }
    }
    
    

    private static void showPeaploM() {

        System.out.println("");
        for (Person person : peaploListM) {
        System.out.println(person);
       }
    }
    
    private static void showPeaploF() {

        System.out.println("");
        for (Person person : peaploListF) {
         System.out.println(person);
        }
     }
}

import java.util.ArrayList;
import java.util.Scanner;

public class SectionNine {
    public static void main(String[] args) {

        Player iain = new Player("Iain", 10, 15);
        System.out.println(iain.toString());
        saveObject(iain);

        iain.setHp(99);
        System.out.println(iain);
        iain.setWeapon("Buster Sword");
        saveObject(iain);
        loadObject(iain);
        System.out.println(iain);

        ISaveable werewolf = new Monster("Werewolf", 20, 50);
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter String\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = s.nextInt();
            switch(choice) {
                case 0: quit = true; break;
                case 1:
                    System.out.print("Enter a String: ");
                    String stringInput = s.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject (ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i)
            + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}



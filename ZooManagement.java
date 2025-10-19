package zoo;

public class ZooManagement {
    public static void main(String[] args) {
        //instantiation de chaquue
        Zoo myZoo = new Zoo("Parc Animalier", "Tunis");

        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 4, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        Dolphin dolphin = new Dolphin("Mammifère", "Flipper", 3, true, "océan", 25.5f);
        Penguin penguin = new Penguin("Oiseau", "Pingouin", 2, false, "bassin", 10f);

        myZoo.addAnimal(dolphin);
        myZoo.addAnimal(penguin);

        System.out.println("Animaux du zoo :");
        myZoo.displayAnimals();

        System.out.println("\nRecherche Lion : " + myZoo.searchAnimal(lion));
        System.out.println("Recherche un autre Lion : " + myZoo.searchAnimal(new Animal("Félidé", "Lion", 5, true)));

        System.out.println("\nTest swim:");
        dolphin.swim();
        penguin.swim();
    }
}

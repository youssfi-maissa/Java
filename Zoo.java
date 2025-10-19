package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String city;
    private final int MAX_CAGES = 25;
    private List<Animal> animals = new ArrayList<>();
// tab pour les animaux aquatiques
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals;




    public Zoo() {}
// methode pour ajouter animal aquatique au tab

    // ✅ Méthode pour ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals >= aquaticAnimals.length) {
            System.out.println("Impossible d’ajouter : le tableau des animaux aquatiques est plein !");
            return;
        }
        aquaticAnimals[nbrAquaticAnimals] = aquatic;
        nbrAquaticAnimals++;
        System.out.println( aquatic.getName() + " ajouté avec succès au zoo aquatique !");
    }

    // ✅ Méthode pour afficher les animaux aquatiques
    public void displayAquaticAnimals() {
        System.out.println("🐠 Liste des animaux aquatiques du zoo " + name + " :");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.println("  - " + aquaticAnimals[i]);
        }
    }


    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
    }

    public String getName() { return name; }
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du Zoo ne peut pas être vide");
        }
        this.name = name;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public boolean addAnimal(Animal animal) {
        if(isZooFull() || animals.contains(animal)) {
            return false;
        }
        animals.add(animal);
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    public void displayAnimals() {
        if(animals.isEmpty()) {
            System.out.println("Aucun animal dans le zoo");
            return;
        }
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    public int searchAnimal(Animal animal) {
        for(int i=0; i<animals.size(); i++) {
            if(animals.get(i).getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return animals.size() >= MAX_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animals.size() >= z2.animals.size() ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Animaux=" + animals.size() + "]";
    }
}

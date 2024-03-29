// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter dog's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter dog's breed (PUG, LABRADOR, BULLDOG, Golden_Retriever, German_Shepherd,\n" +
                    "    Beagle, Bulldog, Poodle, Rottweiler, Siberian_Husky,\n" +
                    "    Dachshund, Boxer, Great_Dane): ");
            Breed breed = Breed.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Enter dog's age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Dog dog = new Dog(name, breed, age);

            if (dogs.stream().anyMatch(existingDog -> existingDog.getName().equals(dog.getName()))) {
                System.out.println("Error: Dog with the same name already exists.");
                continue;
            }

            dogs.add(dog);
        }

        Dog oldestDog = dogs.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .orElse(null);

        if (oldestDog != null) {
            System.out.println("The oldest dog is: " + oldestDog.getName() + " (" + oldestDog.getBreed() + ")");
        } else {
            System.out.println("No dogs were entered.");
        }
    }
}

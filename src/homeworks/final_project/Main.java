package homeworks.final_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Map<String, List<Integer>> invertedIndex = new HashMap<>();
    public static List<String> peopleData = new ArrayList<>();

    public static void main(String[] args) {
        String filename = "C:\\Java\\data_text.txt";
        if (!readDataFromFile(filename)) {
            System.out.println("Can`t reading data from file.");
            return;
        }

        buildIndex();
        while (true) {
            displayMenu();
            int menuNumber = scanner.nextInt();
            scanner.nextLine();
            switch (menuNumber) {
                case 0:
                    System.out.println("\nBye!");
                    return;
                case 1:
                    searchPeople();
                    break;
                case 2:
                    printAllPeople();
                    break;
                default:
                    System.out.println("Incorrect option.");
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n=== Menu ===" +
                "\n1. Find a person" +
                "\n2. Print all people" +
                "\n0. Exit");
    }

    public static boolean readDataFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            int numberOFLine = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                peopleData.add(line);
                numberOFLine++;
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public static void buildIndex() {
        for (int i = 0; i < peopleData.size(); i++) {
            String[] words = peopleData.get(i).split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                invertedIndex.putIfAbsent(word, new ArrayList<>());
                invertedIndex.get(word).add(i);
            }
        }
    }

    public static void searchPeople() {
        System.out.println("Select a matching strategy: ALL, ANY, NONE");
        String strategy = scanner.nextLine().toUpperCase();
        System.out.println("Enter a name or email to search all suitable people:");
        String query = scanner.nextLine().trim().toUpperCase();
        List<String> foundPeople = search(query, strategy);
        displayResults(foundPeople);
    }

    public static List<String> search(String query, String strategy) {
        Set<Integer> indexResult = new HashSet<>();
        String[] wordsQuery = query.split("\\s+");
        for (String word : wordsQuery) {
            word = word.toLowerCase();
            if (strategy.equals("NONE")) {
                for (int i = 0; i < peopleData.size(); i++) {
                    indexResult.add(i);
                }
            }
            if (invertedIndex.containsKey(word)) {
                List<Integer> wordIndexes = invertedIndex.get(word);
                switch (strategy) {
                    case "ALL":
                        if (indexResult.isEmpty()) {
                            indexResult.addAll(wordIndexes);
                        } else {
                            indexResult.retainAll(wordIndexes);
                        }
                        break;
                    case "ANY":
                        indexResult.addAll(wordIndexes);
                        break;
                    case "NONE":
                        wordIndexes.forEach(indexResult::remove);
                        break;
                    default:
                        System.out.println("Invalid strategy.");
                        return Collections.emptyList();
                }
            }
        }
        List<String> foundPeople = new ArrayList<>();
        for (int index : indexResult) {
            foundPeople.add(peopleData.get(index));
        }
        return foundPeople;
    }

    public static void displayResults(List<String> foundPeople) {
        if (foundPeople.isEmpty()) {
            System.out.println("No matching people found.");
        } else {
            System.out.println(foundPeople.size() + " persons found:");
            for (String person : foundPeople) {
                System.out.println(person);
            }
        }
    }

    public static void printAllPeople() {
        System.out.println("=== List of People ===");
        if (peopleData.isEmpty()) {
            System.out.println("No data available.");
        } else {
            for (String person : peopleData) {
                System.out.println(person);
            }
        }
    }
}

package homework14;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class TaskTwo {
    String name;

    public TaskTwo(String name) {
        this.name = name;
    }
    public static Optional<String> findingPopularName(Stream<TaskTwo> stream){
        Map<String,Integer> nameCount = new HashMap<>();
        stream.forEach(taskOne -> nameCount.put(taskOne.getName(),
                nameCount.getOrDefault(taskOne.getName(),0)+1));
        return nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Stream<TaskTwo> personStream = Stream.of(
                new TaskTwo("Danylo"),
                new TaskTwo("Ivan"),
                new TaskTwo("Danylo"),
                new TaskTwo("Danylo"),
                new TaskTwo("Petro"));
        Optional<String> theMostPopularPerson = findingPopularName(personStream);
        if (theMostPopularPerson.isPresent()){
            System.out.println("Найпопулярніше ім'я: "+theMostPopularPerson.get());
        }else {
            System.out.println("Немає");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

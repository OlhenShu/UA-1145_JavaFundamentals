package Practicals.Pr11.Ex3;

import java.util.ArrayList;
import java.util.List;

public class RunnerUsernameRegex {

    public static void main(String[] args) {

        List<String> userNameList = new ArrayList<>();

        userNameList.add("LittleKitty45");
        userNameList.add("Big_Boss777");
        userNameList.add("Пихата Зі Львова");
        userNameList.add("78751687648");
        userNameList.add("NN");
        userNameList.add("NNvnckfjghkdfjhbuknkjgeoahjgiowhjgoiwejgoiwejgiow");

        String pattern = "(^[a-zA-Z0-9_]{3,15}$)";

        for (var useName : userNameList) {
            System.out.println("Username '" + useName + "' validation status: " + useName.matches(pattern));
        }
    }
}

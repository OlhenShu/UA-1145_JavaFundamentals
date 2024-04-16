package edu10.PracticalTasks;

import java.time.LocalDate;

enum Position {
    DEVELOPER,
    MANAGER,
    TESTER,
    DEVOPS,
    QA;
}

public class PracticalTask02 {
}

record Employee(
        int id,
        String name,
        Position position,
        double salary,
        LocalDate dateOfBirth
) {
}

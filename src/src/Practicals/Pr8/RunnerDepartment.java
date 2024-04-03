package Practicals.Pr8;

public class RunnerDepartment {
    public static void main(String[] args) {

        Department department = new Department("Department 1", "Lviv", "Franka str.", 1);

        Department copyOfDepartment;
        try {
            copyOfDepartment = (Department) department.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(department);
        System.out.println(copyOfDepartment);

        System.out.println("=================================================");

        copyOfDepartment.setName("Department 2");
        copyOfDepartment.getAddress().setCity("Kyiv");
        copyOfDepartment.getAddress().setStreet("Lviv str.");
        copyOfDepartment.getAddress().setBuilding(2);

        System.out.println(department);
        System.out.println(copyOfDepartment);
    }
}

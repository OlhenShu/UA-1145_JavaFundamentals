package Task3;

import static Task3.Main.SCANNER;

public class ErrorWorking {
    private static int errorNumber;

    public static int errorNumberInput() {
        while (true) {
            try {
                System.out.println("Enter the error number you want to know more about: ");
                errorNumber = SCANNER.nextInt();
                return errorNumber;
            } catch (NumberFormatException e) {
                System.err.println("Entered value is non-integer. Please enter something in range [400-410]");
            }
        }
    }

    public static String errorNumberOutputLogic() {
        return switch (errorNumber) {
            case 400 -> HTTPError.Error400.name;
            case 401 -> HTTPError.Error401.name;
            case 402 -> HTTPError.Error402.name;
            case 403 -> HTTPError.Error403.name;
            case 404 -> HTTPError.Error404.name;
            case 405 -> HTTPError.Error405.name;
            case 406 -> HTTPError.Error406.name;
            case 407 -> HTTPError.Error407.name;
            case 408 -> HTTPError.Error408.name;
            case 409 -> HTTPError.Error409.name;
            case 410 -> HTTPError.Error410.name;
            default -> throw new IllegalArgumentException("There is no error with this number. Try something between [400-410]");
        };
    }

    public static void errorNameOutput() {
      while(true) {
          try {
              int errorNumber = errorNumberInput();
              String errorName = errorNumberOutputLogic();
              System.out.println("The name of Error" + errorNumber + " is: " + errorName);
              break;
          } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
          }
      }
        }
    }
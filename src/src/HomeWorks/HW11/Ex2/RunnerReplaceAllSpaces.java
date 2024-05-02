package HomeWorks.HW11.Ex2;

public class RunnerReplaceAllSpaces {

    public static void main(String[] args) {
        String sentence = "I   am       learning Java            Fundamental";

        String res = sentence.replaceAll("(\s){2,}", " ");

        System.out.println(res);
    }
}
//Everything good
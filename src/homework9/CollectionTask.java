package homework9;

import java.util.*;

public class CollectionTask {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random randomNumber = new Random();
        for(int i=0;i<=10;i++){
            myCollection.add(randomNumber.nextInt(-51,51));
        }
        System.out.println(myCollection);
        //task1
        int minNumber =0;
        int maxNumber=0;
        int minValue = myCollection.get(0);
        int maxValue = myCollection.get(0);
        for(int i= 1;i<myCollection.size();i++){
            int finNum = myCollection.get(i);
            if(finNum<minValue){
                minValue=finNum;
                minNumber=i;
            } else if (finNum>maxValue) {
                maxValue=finNum;
                maxNumber=i;
            }
        }
        Collections.swap(myCollection,minNumber,maxNumber);
        System.out.println(myCollection);
        //task2
        int threeDigitNum = randomNumber.nextInt(900)+100;
        for(int i=0;i<myCollection.size();i++){
            if(myCollection.get(i)<0);
            myCollection.add(i,threeDigitNum);
            break;
        }
        System.out.println(myCollection);
        //task3
        for(int i=0;i<myCollection.size()-1;i++){
            if(myCollection.get(i)*myCollection.get(i+1)<0){
                myCollection.add(i+1,0);
            }
        } System.out.println(myCollection);
        //task4
        List<Integer> list1=new ArrayList<>(myCollection.subList(0,5));
        List<Integer> list2=new ArrayList<>(myCollection.subList(5,myCollection.size()));
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);
        //task5
        for(int i=myCollection.size()-1;i>=0;i--){
            if(myCollection.get(i)%2==0){
                myCollection.remove(i);
                break;
            }
        }
        System.out.println(myCollection);
        for(int i=0;i<myCollection.size()-1;i++){
            if(myCollection.get(i)==minValue){
                myCollection.remove(i+1);
                break;
            }
        } System.out.println(myCollection);
    }
}

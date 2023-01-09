import java.util.ArrayList;
import java.util.List;

public class Ex {

    private static <T> List<T> filter(Iterable<T> array, IsGood<T> isGood) {
        List<T> newArray = new ArrayList<>();
        for (T val : array) {
            if (isGood.isGood(val)) {
                newArray.add(val);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        numList.add(20);
        numList.add(30);
        numList.add(-12);
        numList.add(-4);
        numList.add(19);
        numList.add(-3);
        numList.add(7);

        System.out.print("До=>");
        System.out.println(numList);

        System.out.print("После isEven=>");
        List<Integer> afterIsEven = filter(numList, new IsEven());
        System.out.println(afterIsEven);

        System.out.print("Стало isPositive=>");
        List<Integer> afterIsPos = filter(numList, new IsPositive());
        System.out.println(afterIsPos);

        System.out.println();

        List<String> strList = new ArrayList<>();
        strList.add("hfdkf");
        strList.add("AAA");
        strList.add("293");
        strList.add("Automat");
        strList.add("asdf");
        strList.add("Kfjjg");
        strList.add("Best");
        strList.add("123");
        strList.add("qwerty");
        strList.add("eccmeck");

        System.out.print("До=>");
        System.out.println(strList);

        System.out.print("После BeginSecond=>");
        List<String> afterWithA = filter(strList, new BeginsWithA());
        System.out.println(afterWithA);

        System.out.print("После BeginWith=>");
        List<String> afterWith = filter(strList, new BeginsWith("qwer"));
        System.out.println(afterWith);

    }

}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ratioList = new ArrayList<>(List.of(20, 16, 16, 16, 16, 16));
        int sum = ratioList.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
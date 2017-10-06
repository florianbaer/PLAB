package ch.hslu.plab.sw03.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public List<Integer> setUpData(){
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        return integers;
    }

    public void ExternalIteration(){
        List<Integer> integers = setUpData();

        for (Integer number : integers) {
            System.out.print(number);
        }
    }

    public void InternalIteration(){
        List<Integer> integers = setUpData();

        integers.forEach(x -> System.out.print(x));
    }

    public void StreamOfInteger(){
        List<Integer> integers = setUpData();
        // does not compile --> integers.filter(x -> x < 3).forEach(x -> System.out.print(x));

        Stream<Integer> streamOfInteger = integers.stream();
        streamOfInteger.filter(x -> x < 3)
                .forEach(x -> System.out.print(x));
    }
}

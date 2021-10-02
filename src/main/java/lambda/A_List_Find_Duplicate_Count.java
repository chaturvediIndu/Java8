package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_List_Find_Duplicate_Count {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Chennai","Bangalore","Pune","Hyderabad",
                "Chennai","Pune","Mysore","Delhi","Hyderabad",
                "Pune"
        );

         System.out.println(Collections.frequency(list, "Pune"));

         // finding frequency with stream
         String elementTo = "Delhi";
         list.stream().filter(c -> c.equals(elementTo)).count();
        System.out.println( list.stream().filter(c -> c.equals(elementTo)).count());

    }
}

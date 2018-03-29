package strings;


import java.util.ArrayList;

public class Join {
    public static String joinToString(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hyy");
        strings.add("zal");

        return StringFunction.joinToString(strings, ",", "", "");
    }
}

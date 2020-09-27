
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {


    public static String filterstring(String str){
        return str.replaceAll("[^{}()\\[\\]]","");
    }

    public static Boolean chekCondition(String str){
        boolean check = true;

        str = filterstring(str);

        if(str.length()%2!=0)
            return false;

        String[] list = str.split("");

        List<String> splitstring = new ArrayList();
        for (String s:list) {
            splitstring.add(s);
        }



        while(check){
            check=false;
            for (int i=0;i<splitstring.size();i++) {
                char first = splitstring.get(i).charAt(0);
                char second ='o';
                if(i>0)
                    second = splitstring.get(i-1).charAt(0);



                if (first==']'&&second=='[') {
                    splitstring.remove(i);
                    splitstring.remove(i-1);
                    check=true;
                    break;
                }


                if (first==')'&&second=='(') {
                    splitstring.remove(i);
                    splitstring.remove(i - 1);
                    check=true;
                    break;
                }


                if (first=='}'&&second=='{') {
                    splitstring.remove(i);
                    splitstring.remove(i-1);
                    check=true;
                    break;
                }
            }

        }
        return splitstring.isEmpty();
    }


    public static void main(String[] args) {
        String sir = "{({)}}";
        System.out.println(chekCondition(filterstring(sir)));



    }

}


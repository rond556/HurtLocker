import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorCounter {


    public String errorCounter(String[] listArray) throws Exception {
        Pattern pattern = Pattern.compile(":;");
        Integer counter = 0;
        for(String s : listArray){
            Matcher matcher = pattern.matcher(s);
            if(matcher.find()){
                counter++;
            }
        }
        return String.format("Number of errors: %d", counter);
    }
}

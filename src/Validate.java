import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE= "^[0]+[9|8|3]+\\d{8}";
    private static final String DATE= "^\\d{1,2}+[/|-]+\\d{1,2}+[/|-]+\\d{4}$";
    private static final String EMAIL=  "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    public boolean validatePhone(String regex) {
        pattern = Pattern.compile(PHONE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validateDate(String regex) {
        pattern = Pattern.compile(DATE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean validateEmail(String regex) {
        pattern = Pattern.compile(EMAIL);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

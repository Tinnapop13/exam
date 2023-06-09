package solution.base;

import java.util.Comparator;
import java.util.function.Predicate;

public class ToBeLambda {
    private final String firstname;
    private final String lastname;

    public String getFirstname() {
        return firstname;
    }
    
    public ToBeLambda(String fn, String ln) { firstname = fn; lastname = ln; }
    @Override public String toString() { return "ToBeLambda(" + firstname + ":" + lastname + ")"; }
    
    // replace null with a lambda expression to compare objects by the firstname
    public static Comparator<ToBeLambda> compareByFirstname 
            = (a,b) -> a.firstname.compareTo(b.firstname); // ANSWER 4.1
    
    public boolean evalFirstname(Predicate<String> p) { return p.test(firstname); }
}

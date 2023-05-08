import java.rmi.Remote;
import java.util.Set;
import java.util.HashMap;

public interface ProjectInterface extends Remote {
    public int CountChars(String s) throws Exception;

    public String longestWord(String s) throws Exception;

    public String ShortestWord(String s) throws Exception;

    public Set<String> RepeatedWords(String s) throws Exception;

    public HashMap<String, Integer> wordCount(String s) throws Exception;

}

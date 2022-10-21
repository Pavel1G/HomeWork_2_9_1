import java.util.Map;
import java.util.Set;

public class Method {
    public static void addData(Map<String, Integer> map) throws Exception {
        String str = "str" + (int) (Math.random() * 4);
        Integer num = (int) (Math.random() * 6);
        System.out.println("String - " + str + ", num - " + num);

        Set<String> keys = map.keySet();
        if (!keys.contains(str)) {
            map.put(str, num);
        } else if (keys.contains(str) && map.get(str).equals(num)) {
            throw new Exception("Такая мапа уже есть");
        } else if (keys.contains(str) && !map.get(str).equals(num)) {
            map.put(str, num);
        }
    }
}

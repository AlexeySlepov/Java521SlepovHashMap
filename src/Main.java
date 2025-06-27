import java.util.HashMap;

public class Main {
    // TODO:
    //  1)Реализовать удаление по ключу
    //  2)Реализовать удаление по значению
    //  3)Реализовать редактирование  значение
    //  4)Реализовать редактирование  ключа
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("dog", "sobaka");
        dictionary.put("brother", "brat");
        dictionary.put("mother", "mama");
        dictionary.put("father", "otec");
        dictionary.put("home", "dom");

        deleteByKey(dictionary, "home");
        deleteByValue(dictionary, "brat");
        changeValue(dictionary, "sobaka", "pes");
        changeKey(dictionary, "dog", "sobaka");

        System.out.println(dictionary);
    }

    public static void deleteByKey(HashMap<String, String> values, String key) {
        if (values.containsKey(key)) {
            values.remove(key);
        }
    }

    public static void deleteByValue(HashMap<String, String> values, String value) {
        if (values.containsValue(value)) {
            values.values().remove(value);
        }
    }

    public static void changeValue(HashMap<String, String> values, String oldValue, String newValue) {
        if (values.containsValue(oldValue)) {
            for (Object o : values.keySet()) {
                if (oldValue.equals(values.get(o))) {
                    values.replace((String) o, newValue);
                }
            }
        }
    }

    public static void changeKey(HashMap<String, String> values, String oldKey, String newKey) {
        if (values.containsKey(oldKey)) {
            values.put(newKey, values.remove(oldKey));
        }
    }


}

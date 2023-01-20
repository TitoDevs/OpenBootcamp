import java.util.HashMap;

public class OptionsParser {
    private HashMap<String, String> options = new HashMap();
    private String[] args;

    private OptionsParser() {}
    public OptionsParser(String[] args) {
        this.args = args;
    }

    public void registerOption(String optionName) {
        options.put(optionName, "");
    }

    public String getOption(String optionName) {
        return options.get(optionName);
    }


    public void setOptionValue(String optionName, String optionValue) {
        options.replace(optionName, optionValue);
    }

    public void parse() {
        for (int i = 0; i < args.length; i++) {
            String optionName = args[i].replace("-", "");;
            if (options.containsKey(optionName)) {
                setOptionValue(optionName, args[i + 1]);
            }
        }
    }
}

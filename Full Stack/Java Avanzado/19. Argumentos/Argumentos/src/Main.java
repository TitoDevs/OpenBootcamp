import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        // --opcion VALOR

        /*
        +----------+----+----------+-----+
        | --minVal | 10 | --maxVal | 100 |
        +----------+----+----------+-----+
        | 0        | 1  | 2        | 3   | ...
        +----------+----+----------+-----+
         */

        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.registerOption("minval");
        optionsParser.registerOption("maxval");
        optionsParser.registerOption("nombre");
        optionsParser.parse();

        int minVal = Integer.parseInt(optionsParser.getOption("minval"));
        int maxVal = Integer.parseInt(optionsParser.getOption("maxval"));

        for (int i = minVal; i <= maxVal; i++) {
            System.out.print(i + " ");
        }

        // https://commons.apache.org/cli/ - Apache Commons CLI
        // https://www.martiansoftware.com/jsap/ - JSAP
    }

    public static demoACCI(String[] args) {
        Options options = new Options();

        Option maxval = new Option("m", "maxval", true, "Valor máximo");
        maxval.setRequired(true);

        options.addOption(maxval);

        CommandLineParser parser = new CommandLineParser();
        HelpFormatter helpFormatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (Exception e) {

        }

        String miMaxVal = Integer.parseInt(cmd.getOptionValue("maxval"));
        System.out.println("Mi maxval es: " + miMaxVal);
    }
}
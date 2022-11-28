package consolidatedconditional.bad;

public class Main {

    private double extraSalary;
    private int seniority;
    private int educaction;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if (seniority<1){
            return 0;
        }

        if (educaction<1){
            return 0;
        }

        if (incidents > 10){
            return 0;
        }

        if (!certification){
            return 0;
        }

        // Calculate extra salary
        // ...
        return result;
    }
}

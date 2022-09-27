package consolidatedduplicate.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int educaction;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;

        if (!isEligibleExtraSalary()){  // verdadero
            result = 500;
        } else {  // falso
            result = 0;
        }
        sendMensaje();
        return result;
    }

    private void sendMensaje() {
        // send email
        // connect smtp
        System.out.println("Sending message");
    }


    public boolean isEligibleExtraSalary(){
        // agrupar condiciones utilizando AND (&&) y OR (||)
        boolean estudios = seniority < 1 || educaction<1;
        boolean antiguedad = incidents > 10 && certification;
        return estudios || antiguedad;
    }
}

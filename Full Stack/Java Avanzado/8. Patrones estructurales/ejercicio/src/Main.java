public class Main {
    public static void main(String[] args) {
        Aplicacion app = Aplicacion.getInstance();   // new Aplicacion()
        Aplicacion app2 = Aplicacion.getInstance();  // app2 = app;

        app.run();
        app2.run();

        System.out.println(app + " " + app2);
    }
}
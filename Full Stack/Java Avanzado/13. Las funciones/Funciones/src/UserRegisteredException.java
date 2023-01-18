public class UserRegisteredException extends UserException {
    public UserRegisteredException(String message) {
        super("Usuario ya existe: " + message);
    }
}

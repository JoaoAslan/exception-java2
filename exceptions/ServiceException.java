package exercicios.ex1.exceptions;

// CRIADA UMA CLASSE DO TIPO RuntimeException
public class ServiceException extends RuntimeException {

    public ServiceException(String msg) {
        super(msg);
    }
}

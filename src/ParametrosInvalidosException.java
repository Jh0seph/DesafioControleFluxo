
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
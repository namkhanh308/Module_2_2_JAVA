public class IllegalTriangleException extends Throwable{
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
        printStackTrace();
    }

    public IllegalTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTriangleException(Throwable cause) {
        super(cause);
    }

    public IllegalTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Đây không phải cạnh của tam giác");
    }

}

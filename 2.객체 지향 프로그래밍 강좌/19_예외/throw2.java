import java.io.IOException;
// 어떤건 반드시 예외처리를 하게 되어 있지만, 어떤건 예외처리를 하지 않아도 되게 되어있음.

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}
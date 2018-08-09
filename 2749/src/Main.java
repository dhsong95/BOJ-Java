import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	long n = Long.parseLong(br.readLine());
    	
    	Fibonacci fib = new Fibonacci(n);
    	int res = fib.fib_mod();

		bw.write(String.valueOf(res));
    	bw.flush();

    	bw.close();
    	br.close();
    }
}

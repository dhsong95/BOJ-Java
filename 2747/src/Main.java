import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int n = Integer.parseInt(br.readLine());

    	int n1 = 0;
    	int n2 = 1;

    	for(int i = 2; i <= n; i++){
    		int temp = n1;
    		n1 = n2;
    		n2 = temp + n1;
    	}

    	bw.write(n2 + "");
    	bw.close();
    	br.close();

    }
}

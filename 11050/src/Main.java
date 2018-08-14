import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	String[] arr = br.readLine().split(" ");
    	int n = Integer.parseInt(arr[0]);
    	int k = Integer.parseInt(arr[1]);

    	double res = 1.0;
    	for(int i = 0; i < k; i++){
    		res *= (n-i);
    	}

    	for(int i = 0; i < k; i++){
    		res /= (k-i);
    	}


    	bw.write(String.valueOf((int)res) + "\n");		

    	br.close();
    	bw.close();
    }
}

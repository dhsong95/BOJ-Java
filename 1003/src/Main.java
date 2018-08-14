import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int test_case = Integer.parseInt(br.readLine());
    	int[] arr = new int[test_case];

    	for(int i = 0; i < test_case; i++){
    		arr[i] = Integer.parseInt(br.readLine());
    	}

    	int zero = 0;
    	int one = 0;

    	for(int i = 0; i < test_case; i++){
    		int n = arr[i];

    		int zero_1 = 1;
    		int zero_2 = 0;

    		int one_1 = 0;
    		int one_2 = 1;

    		if(n == 0){
    			zero = 1;
    			one = 0;
    		}
    		else if(n == 1){
    			zero = 0;
    			one = 1;
    		}
    		else{
    			for(int j = 2; j <= n; j++){
    				int zero_temp = zero_1;
    				zero_1 = zero_2;
    				zero_2 = zero_1 + zero_temp;

    				int one_temp = one_1;
    				one_1 = one_2;
    				one_2 = one_1 + one_temp;
    			}

    			zero = zero_2;
    			one = one_2;
    		}

    		bw.write(String.valueOf(zero) + " " + String.valueOf(one) + "\n");
    		bw.flush();
    	}

    	br.close();
    	bw.close();
    }
}

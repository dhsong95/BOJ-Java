import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int testCase = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < testCase; i++){
    		String operators = br.readLine();
    		int arraySize = Integer.parseInt(br.readLine());
    		StringBuilder arr_str = new StringBuilder(br.readLine());
    		arr_str = new StringBuilder(arr_str.substring(1, arr_str.length() - 1));
    		String[] arr_s = arr_str.toString().split(",");
    		
    		int[] arr = new int[arraySize];
    		for(int j = 0; j < arraySize; j++){
    			arr[j] = Integer.parseInt(arr_s[j]);
    		}

    		AC ac = new AC(arraySize);
    		ac.setArr(arr);

    		StringBuilder res = new StringBuilder();
    		for(int k = 0; k < operators.length(); k++){
    			char op = operators.charAt(k);
    			if(op == 'R'){
    				res = new StringBuilder(ac.R());
    			}
    			else if(op == 'D'){
    				res = new StringBuilder(ac.D());
    			}
    		}
    		bw.write(res.toString() + "\n");
    		bw.flush();
    	}

    	br.close();
    	bw.close();

    }
}

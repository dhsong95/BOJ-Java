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

    	int[][] pascal_traingle = new int[1001][1001];
    	pascal_traingle[0][0] = 1;
    	pascal_traingle[1][0] = 1;
    	pascal_traingle[1][1] = 1;    	

    	for(int i = 2; i <= n; i++){
    		for(int j = 0; j <= k; j++){
    			if(j == 0 || j == i){
    				pascal_traingle[i][j] = 1;	
    			}
    			else{
	    			pascal_traingle[i][j] = ((pascal_traingle[i-1][j] % 10007) + (pascal_traingle[i-1][j-1] % 10007)) % 10007;
    			}
    			System.out.print(pascal_traingle[i][j]);
    		}
    		System.out.println();
    	}

    	bw.write(String.valueOf(pascal_traingle[n][k]) + "\n");		    	

    	br.close();
    	bw.close();
    }
}

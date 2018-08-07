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
    	String[] operand_str;
        StringBuilder res = new StringBuilder();
    	for(int i = 0; i < testCase; i++){
    		String operators = br.readLine();
    		int[] operand = new int[Integer.parseInt(br.readLine())];
    		operand_str = br.readLine().replaceAll("[\\[\\]]", "").split(",");
            
            for(int j = 0; j < operand.length; j++){
                operand[j] = Integer.parseInt(operand_str[j]);
            }

            AC ac = new AC(operand, operators);

            res.append(ac.calc());
    	}

        bw.write(res.toString());
    
    	br.close();
    	bw.close();

    }
}

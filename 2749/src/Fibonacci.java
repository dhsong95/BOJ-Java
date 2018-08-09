import java.util.ArrayList;

public class Fibonacci {
	int divider;
	long n;

	public Fibonacci(long n){
		this.divider = 1000000;
		this.n = n;
	}
	
	public int fib_mod(){
		ArrayList<Integer> period_arr = pisano(divider);
		
		if(n == 0){
			return 1;
		}
		else {
			int m = (int)(n % period_arr.size());
			return period_arr.get(m);	
		}
	}   
	private ArrayList<Integer> pisano(int d){
		ArrayList<Integer> period_arr = new ArrayList<>();
		int idx = 1;
		
		period_arr.add(0);
		period_arr.add(1);

		while(true){
			int a = period_arr.get(idx);
			int b = (period_arr.get(idx-1) + a) % d;
			idx++;
			if(a != 0 || b != 1){
				period_arr.add(b);
			}
			else{
				int last_idx = period_arr.size() - 1;
				period_arr.remove(last_idx);
				break;
			}			
		}
		return period_arr;
	} 
}

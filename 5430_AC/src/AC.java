import java.lang.StringBuilder;

public class AC {
    public int[] arr;

    public AC(){
    	arr = new int[100000];
    }
    public AC(int size){
    	arr = new int[size];
    }

    public int[] getArr(){
    	return arr;
    }
    public void setArr(int arr[]){
    	this.arr = arr;
    }

    public String R(){
    	int cur_len = arr.length;
    	int[] res = new int[cur_len];

    	for(int i = 0; i < cur_len; i++){
    		res[i] = arr[cur_len - 1 - i];
		}
		arr = res;
		return printArray();
    }
    public String D(){
    	int cur_len = arr.length;
    	if(cur_len == 0){
    		return "error";
    	}

    	int[] res = new int[cur_len-1];
    	for(int i = 1; i < cur_len; i++){
    		res[i-1] = arr[i];
    	}

    	arr = res;
    	return printArray();
    }
    public String printArray(){
    	int cur_len = arr.length;
    	if (cur_len == 0){
    		return "[]";
    	}

    	StringBuilder sb = new StringBuilder();
    	sb.append('[');
    	for(int i = 0; i < cur_len; i++){
    		sb.append(arr[i]);
    		if(i == cur_len - 1){
    			sb.append(']');
    		}
    		else {
    			sb.append(',');
    		}
    	}

    	return sb.toString();
    }
}

import java.lang.StringBuilder;

class AC {
    private int[] operand;
    private String op;

    //constructor
    public AC(){
    	operand = new int[10000];
        op = "";
    }
    public AC(int[] operand, String op){
    	this.operand = operand;
        this.op = op;
    }

    //setter and getter
    public int[] getOperand(){
    	return operand;
    }
    public void setOperand(int[] operand){
    	this.operand = operand;
    }
    public String getOp(){
        return op;
    }
    public void setOp(String op){
        this.op = op;
    }

    public String calc(){
        int head = 0;
        int tail = operand.length - 1;
        int ptr = head;

        int numberOfR = 0;

        for(int i = 0; i < op.length(); i++){
            char curOp = op.charAt(i);
            if(curOp == 'R'){
                numberOfR++;
                if(ptr == head){
                    ptr = tail;
                }
                else if(ptr == tail){
                    ptr = head;
                }
            }
            else if(curOp == 'D'){
                try{
                    operand[ptr] = -1;
                    if(ptr == head){
                        head += 1;
                        ptr = head;
                    }
                    else if(ptr == tail){
                        tail -= 1;
                        ptr = tail;
                    }
                }
                catch(Exception e){
                    return "error\n";
                }
            }
        }

        return print(numberOfR);
    }

    public String print(int numberOfR){
        StringBuilder sb = new StringBuilder();
        if(numberOfR % 2 == 0){
            for(int i = 0; i < operand.length; i++){
                if(operand[i] != -1){
                    sb.append(operand[i] + ",");
                }
            }
        }
        else{
            for(int i = operand.length - 1; i > -1; i--){
                if(operand[i] != -1){
                    sb.append(operand[i] + ",");
                }
            }
        }
        String res = sb.toString();

        res = res.length() > 0 ? String.format("[%s]\n", res.substring(0, res.length() - 1)) : "[]\n";
        return res;
    }
}

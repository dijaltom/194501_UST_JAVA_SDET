
public class labeledbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	lol:
    for(int i=0;i<5;i++) {
    	for(int j=0;j<=3;j++) {
    		System.out.println(i+"\t"+j);
    		if(i==4) {
    			break lol;
    		}
    	}
    }
	}

}

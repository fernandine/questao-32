package aplicacao;

public class Program {

	public static void main(String[] args) {
	
	
		        String arr = "14 24 37 89";
		        
		        String[] s = arr.split(" ");
		        int sum = 0;
		        for(int i=0; i< s.length; i++) {

		            sum += Integer.valueOf(s[i]);
		        }
		        System.out.println(sum);
		    }
		}
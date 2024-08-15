
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String numTel = scanner.nextLine();
		int tamTel = numTel.length();
		
		StringBuilder novoNumTel = new StringBuilder();
		
		for(int i=0; i<tamTel; i++){
		    char c = numTel.charAt(i);
		    
		    if(c == 'A' || c == 'B' || c == 'C' ){
		        novoNumTel.append('2');
		    }
		    if(c == 'D' || c == 'E' || c == 'F' ){
		        novoNumTel.append('3');
		    }
		    if(c == 'G' || c == 'H' || c == 'I' ){
		        novoNumTel.append('4');
		    }
		    if(c == 'J' || c == 'K' || c == 'L' ){
		        novoNumTel.append('5');
		    }
		    if(c == 'M' || c == 'N' || c == 'O' ){
		        novoNumTel.append('6');
		    }
		    if(c == 'P' || c == 'Q' || c == 'R' || c == 'S' ){
		        novoNumTel.append('7');
		    }
		    if(c == 'T' || c == 'U' || c == 'V' ){
		        novoNumTel.append('8');
		    }
		    if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z' ){
		        novoNumTel.append('9');
		    }
		    
		   if(c == '-' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6'|| c == '7' || c == '8' || c == '9' || c == '#'|| c == '*'|| c == '0'){
		        novoNumTel.append(c);
		   }
		    
		    
		}
		
		System.out.println(novoNumTel.toString());
	}
}

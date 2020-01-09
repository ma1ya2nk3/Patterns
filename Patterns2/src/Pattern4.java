import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int nsp = n-1;
		int row =1;
		int nst =1;
		while(row<=n) {
			int csp =1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nsp = nsp-1;
			nst = nst+1;
			row = row+1;
		}
		

	}

}

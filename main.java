import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.print("Mayın Tarlasına Hoşgeldizniz !");
		System.out.print("Lütfen oynamak istediğiniz boyutları giriniz.");
		System.out.println("Satır Sayısı : ");
		row= scan.nextInt();
		System.out.println("Sütın Sayısı");
		column= scan.nextInt();
		
		MayinTarlasi mayin =new MayinTarlasi(row,column);
		mayin.run();
		
	}

}

package repl_It60;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import day16_ClassesAndObjects.Contact;

public class Q_85ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
			s2=""; s3=""; s4=""; s5=""; s6=""; s7=""; s8=""; s9=""; s10="";
			double i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
			i2=0; i3=0; i4=0; i5=0 ; i6=0; i7=0; i8=0; i9=0; i10=0;
			System.out.println("Enter Item1 and its price:");
			item=scan.next();
			price=scan.nextDouble();
			s1=item;
			i1=price;
			totalPrice=totalPrice+price;
			shoppingListReport="Item1: " + s1 +" Price: " + i1 ;
			System.out.println("Add one more item?");
			countinue=scan.next();
			
			if(countinue.equals("yes")) {
				
				do {
					count++;
					System.out.println("Enter Item" + count + " and its price:" );
					item=scan.next();
					price=scan.nextDouble();
					if(count==2) {
						s2=item;
						i2=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ", Item2: " + s2 + " Price: " + i2;
					}else if(count==3) {
						s3=item;
						i3=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 + " Price: " + i1 +", Item2: " +s2 + " Price: "+ i2 + ", Item3: " +s3+ " Price: " +i3;
					}else if(count==4) {
						s4=item;
						i4=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ", Item2: "+ s2+ " Price: " + i2 + ", Item3: " + s3+ " Price: " + i3 + ", Item4: "+ s4+ " Price: " + i4;
					}else if(count==5) {
						s5=item;
						i5=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ",Item2: " + s2 + " Price: " + i2 + ", Item3: "  + s3+ " Price: "+i3 + ", Item4: " + s4+ " Price: " + i4 + ", Item5: " + s5 + " Price: "+i5 ;
					}else if(count==6) {
						s6=item;
						i6=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 + ",Item2: "+ s2 + " Price: "  + i2 + ",Item3: " + s3+ " Price: " +i3 + ", Item4: "+ s4+ " Price: "  + i4 + ", Item5: " + s5 + " Price: "+i5 +
								", Item6: " + s6 +" Price: " + i6;
					}else if(count==7) {
						s7=item;
						i7=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ", Item2: " + s2 + " Price: " + i2 + ", Item3: "  + s3+ " Price: "+i3 + ", Item4: " + s4+ " Price: " + i4 + ", Item5: " + s5 + " Price: "+i5 +
								" ,Item6: " + s6 +" Price: " + i6 +", Item7: " + s7 + " Price: " + i7;
					}else if(count==8) {
						s8=item;
						i8=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ", Item2: " + s2 + " Price: " + i2 + ", Item3: "  + s3+ " Price: "+i3 + ", Item4: " + s4+ " Price: " + i4 + ", Item5: " + s5 + " Price: "+i5 +
								", Item6: " + s6 +" Price: " + i6 +", Item7: " + s7 + " Price: " + i7 + ", Item8: " + s8 + " Price: " + i8;
					}else if(count==9) {
						s9=item;
						i9=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ", Item2: " + s2 + " Price: " + i2 + ", Item3: "  + s3+ " Price: "+i3 + ", Item4: "  + s4+ " Price: "+ i4 + ", Item5: " + s5 + " Price: "+i5 +
								", Item6: " + s6 +" Price: " + i6 +", Item7: " + s7 + " Price: " + i7 + ", Item8: " + s8 + " Price: " + i8 +", Item9: " + s9 + " Price: " + i9;
					}else if(count==10) {
						s10=item;
						i10=price;
						totalPrice=totalPrice+price;
						shoppingListReport="Item1: " + s1 +" Price: " + i1 + ", Item2: " + s2 + " Price: " + i2 + ", Item3: "  + s3+ " Price: "+i3 + ", Item4: " + s4+ " Price: " + i4 + ", Item5: " + s5 + " Price: "+i5 +
								", Item6: " + s6 +" Price: " + i6 +", Item7: " + s7 + " Price: " + i7 + ", Item8: " + s8 + " Price: " + i8 +", Item9: " + s9 + " Price: " + i9 + ", Item10: " + s10 + " Price: " +i10;
					}
					System.out.println("Add one more item?");
					countinue=scan.next();
					
				}while(countinue.equals("yes"));
				
				
				
			if(countinue.equals("no")) {
				
				System.out.println(shoppingListReport);
				System.out.println("Total price: " + totalPrice);
			
			
			}
			}else {
				System.out.println(shoppingListReport);
				System.out.println("Total price: " + totalPrice);
				
			}
			
			
			
	}

}

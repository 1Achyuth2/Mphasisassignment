package JavaAndDataStructures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class FixingBugs {
public static void main(String[] args) {
	
	        System.out.println("\tWelcome to TheDesk \n");
	        optionsSelection();

	    }

	    private static void optionsSelection() {
	        String[] arr = {"1.  To review my expenditure",
	                "2.  To add my expenditure",
	                "3.  To delete my expenditure",
	                "4.  To sort the expenditures",
	                "5.  To search for a particular expenditure",
	                "6. Close the application"
	        };
	        int[] a = {1,2,3,4,5,6};
	        for(int i=0; i<a.length;i++){
	            System.out.println(arr[i]);
	        }
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        ArrayList<Integer> e = new ArrayList<Integer>();
	        e.add(1000);
	        e.add(2300);
	        e.add(45000);
	        e.add(32000);
	        e.add(110);
	        e.addAll(al);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  uroptions =  sc.nextInt();
	        for(int j=1;j<=a.length;j++){
	            if(uroptions==j){
	                switch (uroptions){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(e+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        e.add(value);
	                        System.out.println("Your value is updated\n");
	                        e.addAll(al);
	                        System.out.println(e+"\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are delete your expenses! \nTo resolve this again selecting the same option...\n");
	                        int choice = sc.nextInt();
	                        if(choice==uroptions){
	                               e.clear();
	                            System.out.println(e+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortExpenses(e);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchExpenses(e);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("invalid choice!");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList) {
	        int l = arrayList.size();
	        System.out.println("Enter the expense you need to search:\t");
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        for(int i=0;i<l;i++) {
	        	if(arrayList.get(i)==input) {
	        		System.out.println("Found the expense " + input + " at " + i + " position");
	        	}
	        }
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrl =  arrayList.size();
	        Collections.sort(arrayList);
	        System.out.println("Sorted expenses: ");
	        for(Integer i: arrayList) {
	        	System.out.print(i + " ");
	        }
	        
	        System.out.println("\n");
	    }
}

package Booking;

import java.util.Scanner;

interface Ticket{
	void bookTicket(int numberOfTickets);
	void cancelTicket(int numberOfTickets);
	void availableTickets();
}
class BookTickets implements Ticket{
	int Tickets=50;
	@Override
	public void bookTicket(int numberOfTickets){
		if(numberOfTickets<=Tickets){
			Tickets -= numberOfTickets;
			System.out.println("Ticket Booking Succesful!");
			System.out.println("---------------------");
		}
		else{
			System.out.println("Available tickets are only:-"+Tickets);
		}
	}
	@Override
	public void cancelTicket(int numberOfTickets){
		Tickets += numberOfTickets;
		System.out.println("Ticket Cancelling Succesful!");
		System.out.println("---------------------");
	}
	@Override
	public void availableTickets(){
		System.out.println("Availeble Tickets:-- "+Tickets);
		System.out.println("---------------------");
	}

}
class Customer {

	public static void main(String[] args) {
		Ticket obj= new BookTickets();
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("1: Book Tickets \n2: Cancel Tickets \n3: Check Available Tickets \n4: Exit \nEnter Your choice:--");
			int choice = scan.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter how many tickets you would like to book");
				int ticketsToBook = scan.nextInt();
				obj.bookTicket(ticketsToBook);
				break;
			case 2:
				System.out.println("Enter how many tickets you would like to cancel");
				int ticketsToCancel = scan.nextInt();
				obj.cancelTicket(ticketsToCancel);
				break;
			case 3:
				obj.availableTickets();
				break;
			case 4:
				System.out.println("THANK YOU");
				System.exit(0);
			default:
				System.out.println("Invalid choice please try again");
			}
			System.out.println("---------------------");
		}
	}
}

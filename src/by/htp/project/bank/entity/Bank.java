package by.htp.project.bank.entity;

public class Bank {

	public Customer[] customers;

	public void show() {
		System.out.printf("%2s %9s %12s %16s %12s  %31s", "Id", "LastName", "FirstName", "MiddleName", "Address",
				"numberCrditCard" + "\n");

		for (int i = 0; i < customers.length; i++) {
			System.out.print(customers[i] + "\n");
		}
		System.out.println();
	}

	public void showNumberCreditCardBetween(int x, int y) {
		System.out.println("\t" + x + " <showNumberCreditCardBetween< " + y);
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getNumberCreditCard() > x && customers[i].getNumberCreditCard() < y) {
				System.out.println(customers[i]);
			}
		}
		System.out.println();
	}

	public void showSortListLastName() {
		for (int i = 0; i < customers.length; i++) {
			for (int j = i + 1; j < customers.length; j++) {
				if (customers[i].getLastName().compareTo(customers[j].getLastName()) < 0) {

					Customer[] tmp = new Customer[1];
					tmp[0] = customers[i];
					customers[i] = customers[j];
					customers[j] = tmp[0];
				}
			}
		}
	}

}

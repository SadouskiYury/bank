package by.htp.project.bank.run;

import by.htp.project.bank.entity.Customer;
import by.htp.project.bank.entity.Bank;

public class Main {

	public static void main(String[] args) {

		// Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
		// Номер банковского счета.
		// Создать массив объектов. Вывести:
		// a) список покупателей в алфавитном порядке;
		// b) список покупателей, у которых номер кредитной карточки находится
		// в заданном интервале
		Bank list = new Bank();
		list.customers = new Customer[5];
		Customer A = new Customer(1, "Pcheklin", "Valera", "Alexandrovich", "Minsk, Korolya 64-24", 35475885);
		Customer B = new Customer(2, "Tavrel", "Volodya", "Genadevich", "Grodno, Gorkogo 56-8", 578465548);
		Customer C = new Customer(3, "Kozlova", "Olga", "Maximovna", "Borisov, Lenina 7a-3", 24576688);
		Customer D = new Customer(4, "Vovochkin", "Artem", "Alexeevich", "Minsk,  Brilya 45-13", 654878892);
		Customer E = new Customer(5, "Petrova", "Helena", "Alexandrovna", "Minsk, Mysnikova 35-24", 35475885);
		list.customers[0] = A;
		list.customers[1] = B;
		list.customers[2] = C;
		list.customers[3] = D;
		list.customers[4] = E;
		list.show();
		list.showNumberCreditCardBetween(24576688, 654878892);
		list.showSortListLastName();
		list.show();
	}

}

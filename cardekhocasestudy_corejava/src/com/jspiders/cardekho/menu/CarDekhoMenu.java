package com.jspiders.cardekho.menu;

import java.util.Scanner;

import com.jspiders.cardekho.operation.CarDekhoOperation;

public class CarDekhoMenu {
	
	static CarDekhoOperation op = new CarDekhoOperation();
	static boolean loop = true;

	public static void main(String[] args) {

		while (loop) {
			mainmenu();
		}
	}

	private static void mainmenu() {
		
		
		System.out.println("=====Main Menu====\n"
							+"1. View All Cars \n"
							+"2. Search Car \n"
							+"3. Add Car \n"
							+"4. Remove Car \n"
							+"5. Edit Car \n"
							+"6. Exit \n"
							);
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			op.viewAllCars();
			break;
		case 2:
								
				System.out.println("====Search Menu====\n"
						+"1. Search Car by Id \n"
						+"2. Search Car by name \n"
						+"3. Search Car by brand \n"
						+"4. Search Car by fuelType \n"
						+"5. Search Car by price \n"
						+"6. Exit Search Menu \n"
						);
				
				int choice1 = scanner.nextInt();
				
				switch (choice1) {
				case 1:
					System.out.println("Search Car by id");
					int id = scanner.nextInt();
					op.searchCarByid(id);
					break;
				case 2:
					System.out.println("Search Car by name");
					String name = scanner.next();
					op.searchCarByName(name);
					break;
					
				case 3:
					System.out.println("Search Car by brand");
					String brand = scanner.next();
					op.searchCarByBrand(brand);
					break;
					
				case 4:
					System.out.println("Search Car by fuel type");
					String fuelType = scanner.next();
					op.searchCarByFuelType(fuelType);
					break;
					
				case 5:
					System.out.println("Search Car by min price");
					double minPrice = scanner.nextDouble();
					
					System.out.println("Search Car by max price");
					double maxPrice = scanner.nextDouble();
					op.searchCarByPrice(minPrice, maxPrice);
					break;
					
				case 6:
					mainmenu();
					break;

				default:
					break;
				}

			break;
		case 3:
			op.addCar(scanner);
			break;
		case 4:
			System.out.println("Remove Car");
			op.removeCar(scanner);
			break;
		case 5:
			System.out.println("Edit Car");
			op.editCar(scanner);
			break;
		case 6:
			System.out.println("Thank You");
			loop = false;
			break;

		default:
			System.out.println("Invalid Choice...");
			break;
		}

	}
}

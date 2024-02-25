package com.jspiders.cardekho.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarDekhoOperation {

	private List<Car> cars = new ArrayList<>();
//	static Car car = new Car();

	public void viewAllCars() {

		System.out.println("View All Method");

		if (cars.isEmpty()) {
			System.out.println("No car details available");
		} else {

			for (Car car : cars) {
				System.out.println(car);
			}
		}

	}

	public void searchCarByid(int id) {
		System.out.println("Search Car By Id Method");

		if (cars.isEmpty()) {
			System.out.println("No car details available");
		} else {
			boolean flag = false;
			for (Car car : cars) {
				if (car.getId() == id) {
					System.out.println(car);
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("...No Car with id " + id + " is available");
			}
		}
	}

	public void searchCarByName(String name) {
		System.out.println("Search Car By Name Method");

		if (cars.isEmpty()) {
			System.out.println("No car details available");
		} else {
			boolean flag = false;
			for (Car car : cars) {
				if (car.getName().equals(name)) {
					System.out.println(car);
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("...No Car with name " + name + " is available");
			}
		}
	}

	public void searchCarByBrand(String brand) {
		System.out.println("Search Car By Brand Method");
		if (cars.isEmpty()) {
			System.out.println("No car details available");
		} else {
			boolean flag = false;
			for (Car car : cars) {
				if (car.getBrand().equals(brand)) {
					System.out.println(car);
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("...No Car with brand " + brand + " is available");
			}

		}
	}

	public void searchCarByFuelType(String fuelType) {
		System.out.println("Search Car By Fuel Type Method");
		if (cars.isEmpty()) {
			System.out.println("No car details available");
		} else {
			boolean flag = false;
			for (Car car : cars) {
				if (car.getFuelType().equals(fuelType)) {
					System.out.println(car);
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("...No Car with Fuel Type " + fuelType + " is available");
			}
		}
	}

	public void searchCarByPrice(double minPrice, double maxPrice) {
		System.out.println("Search Car By Price Method");
		if (cars.isEmpty()) {
			System.out.println("No car details available");
		} else {
			boolean flag = false;
			for (Car car : cars) {
				if (car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {
					System.out.println(car);
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("...No Car with Price between " +minPrice+" and "+maxPrice+ " is available");
			}
		}

	}

	public void addCar(Scanner scanner) {
		System.out.println("How many cars you want to add ");
		int choice = scanner.nextInt();
		for (int i = 1; i <= choice; i++) {
			boolean flag = false;
			Car car = new Car();
			System.out.println("Enter the id : ");
			int id = scanner.nextInt();

			for (Car car2 : cars) {
				if (car2.getId() == id) {

					System.out.println("This id is already exist!!! Try Again!!");
					flag = true;
				}

			}
			if (flag == true) {
				continue;
			} else {
				//System.out.println("id added");
			}

			car.setId(id);

			System.out.println("Enter the Name");
			String name = scanner.next();
			car.setName(name);

			System.out.println("Enter the Brand");
			String brand = scanner.next();
			car.setBrand(brand);

			System.out.println("Enter the Model");
			String model = scanner.next();
			car.setModel(model);

			System.out.println("Enter the Fuel Type");
			String fuelType = scanner.next();
			car.setFuelType(fuelType);

			System.out.println("Enter the Price");
			double price = scanner.nextDouble();
			car.setPrice(price);

			System.out.println("Enter the Colour");
			String colour = scanner.next();
			car.setColour(colour);

			cars.add(car);
//			System.out.println();
		}

	}

	public void removeCar(Scanner scanner) {

		if (cars.isEmpty()) {
			System.out.println("No car details available");

		} else {

			for (Car car : cars) {
				System.out.println(car);
			}

			System.out.println("Remove the car by its id");
			System.out.println("Enter the car id");
			int cid = scanner.nextInt();

			for (Car car : cars) {
				if (car.getId() == cid) {
					cars.remove(car);
					System.out.println("Car with id " + cid + " has been removed!!");
					break;
				}

			}

		}

	}

	public void editCar(Scanner scanner) {
		if (cars.isEmpty()) {
			System.out.println("No car details available");

		} else {

			for (Car car : cars) {
				System.out.println(car);
			}

			System.out.println("Edit the car by its id");
			System.out.println("Enter the car id");
			int id = scanner.nextInt();
			for (Car car : cars) {
				if (car.getId() == id) {
					System.out.println("true");
					boolean flag = true;
					while (flag) {
						System.out.println("Which field You want to edit");
						System.out.println("====Edit Menu====\n" + "1. name \n" + "2. brand \n" + "3. model \n"
								+ "4. fuelType \n" + "5. price \n" + "6. colour \n" + "7. Exit Edit Menu \n");
						int choice = scanner.nextInt();

						switch (choice) {
						case 1:
							System.out.println("Enter the name to edit ");
							String name = scanner.next();
							car.setName(name);
							break;
						case 2:
							System.out.println("Enter the brand to edit ");
							String brand = scanner.next();
							car.setBrand(brand);
							break;
						case 3:
							System.out.println("Enter the model name to edit ");
							String model = scanner.next();
							car.setModel(model);

							break;
						case 4:
							System.out.println("Enter the fuel type to edit ");
							String fuelType = scanner.next();
							car.setFuelType(fuelType);
							break;
						case 5:
							System.out.println("Enter the Price to edit ");
							double price = scanner.nextDouble();
							car.setPrice(price);
							break;
						case 6:
							System.out.println("Enter the Colour to edit ");
							String colour = scanner.next();
							car.setColour(colour);
							break;
						case 7:
							System.out.println("Edit Menu Exited..");
							flag = false;
							break;

						default:
							System.out.println("Invalid choice");
							break;
						}
					}

					break;
				}

			}
		}

	}

}



import java.util.List;
import java.util.Scanner;

import controller.ListPetHelper;
import model.ListPet;

public class StartProgram {

		static Scanner in = new Scanner(System.in);
		static ListPetHelper lih = new ListPetHelper();

		private static void addAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter a pet name: ");
			String name = in.nextLine();
			System.out.print("Enter a owner name: ");
			String owner = in.nextLine();
			ListPet toAdd = new ListPet(name, owner);
			lih.insertItem(toAdd);

		}

		private static void deleteAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter the name to delete: ");
			String name = in.nextLine();
			System.out.print("Enter the owner to delete: ");
			String owner = in.nextLine();
			ListPet toDelete = new ListPet(name,	owner);
			lih.deleteItem(toDelete);
		}

		private static void editAnItem() {
			// TODO Auto-generated method stub
			System.out.println("How would you like to search? ");
			System.out.println("1 : Search by Pet Name");
			System.out.println("2 : Search by Owner Name");
			int searchBy = in.nextInt();
			in.nextLine();
			List<ListPet> foundItems;
			if (searchBy == 1) {
				System.out.print("Enter the pet name: ");
				String petName = in.nextLine();
				foundItems = lih.searchForItemByPetName(petName);
				
			} else {
				System.out.print("Enter the Owner Name: ");
				String ownerName = in.nextLine();
				foundItems = lih.searchForItemByOwnerName(ownerName);
			}

			if (!foundItems.isEmpty()) {
				System.out.println("Found Results.");
				for (ListPet l : foundItems) {
					System.out.println(l.getType() + " : " + l.toString());
				}
				System.out.print("Which Type to edit: ");
				String typeToEdit = in.nextLine();

				ListPet toEdit = lih.searchForItemByType(typeToEdit);
				System.out.println("Retrieved " + toEdit.getOwner() + " from " + toEdit.getName());
				System.out.println("1 : Update Name");
				System.out.println("2 : Update Owner");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Name: ");
					String newName = in.nextLine();
					toEdit.setName(newName);
				} else if (update == 2) {
					System.out.print("New Owner: ");
					String newOwner = in.nextLine();
					toEdit.setOwner(newOwner);
				}

				lih.updateItem(toEdit);

			} else {
				System.out.println("---- No results found");
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean goAgain = true;
			System.out.println("--- Welcome to our awesome pets list! ---");
			while (goAgain) {
				System.out.println("*  Select an pet:");
				System.out.println("*  1 -- Add a pet");
				System.out.println("*  2 -- Edit a pet");
				System.out.println("*  3 -- Delete a pet");
				System.out.println("*  4 -- View the pets");
				System.out.println("*  5 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addAnItem();
				} else if (selection == 2) {
					editAnItem();
				} else if (selection == 3) {
					deleteAnItem();
				} else if (selection == 4) {
					viewTheList();
				} else {
					lih.cleanUp();
					System.out.println("   Goodbye!   ");
					goAgain = false;
				}

			}

		}

		private static void viewTheList() {
			List<ListPet> allItems = lih.showAllItems();
			for(ListPet singleItem : allItems){
			System.out.println(singleItem.returnPetDetails());
			}
		}
	}
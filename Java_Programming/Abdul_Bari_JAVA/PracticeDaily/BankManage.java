public class BankManage {
	public String Name;
	public long Phone;
	public String Address;
	public String AccType;
	public String AccNumber;
	public static double AmountBal;

	public BankManage(String Name, Long Phone, String Address, String AccType, String AccNumber, double AmountBal) {
		this.Name = Name;
		this.Phone = Phone;
		this.Address = Address;
		this.AccType = AccType;
		this.AccNumber = AccNumber;
		BankManage.AmountBal = AmountBal;
	}

	public void showDetails() {
		System.out.println("Name: " + Name + "/nPhone Number: " + Phone + "\nAddress: " + Address + "\nAccount Type: "
				+ AccType + "\nAccount Number: " + AccNumber + "\nAmounBalance: " + AmountBal);

	}

	public void setName(String NewName) {
		Name = NewName;
	}

	public void setPhone(long NewPhone) {
		Phone = NewPhone;
	}

	public void setAddress(String NewAddress) {
		Address = NewAddress;
	}

	public static double withDraw(double am) {
		return AmountBal -= am;
	}

	public static double deposit(double dep) {
		return AmountBal += dep;
	}


	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Option: ");
		int sw = sc.nextInt();
		do {
			System.out.println("*********************** Bank Of India *******************");
			System.out.println("******************** 1. Create Account *********************");
			System.out.println("******************** 2. Update Account *********************");
			System.out.println("******************** 3. Withdraw Amount *********************");
			System.out.println("******************** 4. Deposit Amount *********************");
			System.out.println("******************** 5. Exit from Bank *********************");

			switch (sw) {
				case 1: 
					System.out.println("Enter Name: ");
					String name = sc.next();
					System.out.println("Enter Phone Number: ");
					long phone = sc.nextLong();
					System.out.println("Enter Address: ");
					String address = sc.next();
					System.out.println("Enter Account Type: ");
					String acctype = sc.next();
					System.out.println("Enter Account Number: ");
					String accNo = sc.next();
					System.out.println("Enter Balance: ");
					double bal = 0.0;
					bal = sc.nextDouble();
					double currentAmount = 0.0; // Initialized Current Amount
					new BankManage(name, phone, address, acctype, accNo, bal);
				
				case 2: 
					System.out.println("Which Field You Want To Update? ");
					String FieldUpdate = sc.next();
					if (FieldUpdate == "Name") {
						System.out.println("Enter New Name: ");
						String NewName = sc.next();
						name = NewName;
					} else if (FieldUpdate == "Phone") {
						System.out.println("Enter New Phone Number: ");
						long NewPhone = sc.nextLong();
						phone = NewPhone;
					} else if (FieldUpdate == "Address") {
						System.out.println("Enter New Address: ");
						String Add = sc.next();
						address = Add;
					}
				
				case 3: 
					// Withdraw Amount
					System.out.println("How much you want to withdraw: ");
					double amount = sc.nextDouble();
					currentAmount = withDraw(amount);
					System.out.println("Current Amount: " + currentAmount);
				
				case 4:
					System.out.println("How much you want to deposit: ");
					double depAmount = sc.nextDouble();
					currentAmount = deposit(depAmount);
					System.out.println("Current Amount: " + currentAmount);

				default: {
					System.out.println("Wrong Option!!");
				}
			}

			System.out.println("Enter Option: ");
			sw = sc.nextInt();
		} while (sw > 0 && sw < 5);
	}
}
## Java Programming Challenge

### Objective
Create a Java program that simulates a simple store where users can perform various actions such as cashing in, cashing out, buying items, selling items, and viewing their balance, bank balance, inventory, and transaction history.

### Requirements
You are only allowed to use the following:
- Arrays
- For loops
- While loops
- Do-while loops
- Basic input/output (System.in and System.out)

### Functional Requirements
1. The program should ask for the user's name at the beginning.
2. The user should be able to cash in money to their balance.
3. The user should be able to cash out money to their bank (only if they have enough balance).
4. The user should be able to buy items from the store (only if they have enough balance).
5. The user should be able to sell items back to the store (only if they have items in their inventory).
6. The user should be able to check their balance.
7. The user should be able to check their bank balance.
8. The user should be able to view their inventory.
9. The user should be able to view their transaction history.
10. The program should continue running until the user chooses to exit.

### Items and Prices
- Apple: $0.50
- Banana: $0.30
- Orange: $0.80
- Grapes: $2.00
- Watermelon: $1.50


## Example output

Welcome to the Store!
Please enter your name: John

Hello, John!
1. Cash In
2. Cash Out
3. Spend Money in the Store
4. Sell Items to the Store
5. Check Balance
6. Check Bank
7. View Inventory
8. View Transaction History
9. Exit
Choose an option: 1
Enter amount to cash in: 50
You have cashed in $50.0

Hello, John!
1. Cash In
2. Cash Out
3. Spend Money in the Store
4. Sell Items to the Store
5. Check Balance
6. Check Bank
7. View Inventory
8. View Transaction History
9. Exit
Choose an option: 5
Your current balance is $50.0

Hello, John!
1. Cash In
2. Cash Out
3. Spend Money in the Store
4. Sell Items to the Store
5. Check Balance
6. Check Bank
7. View Inventory
8. View Transaction History
9. Exit
Choose an option: 3
Items available in the store:
1. Apple - $0.5
2. Banana - $0.3
3. Orange - $0.8
4. Grapes - $2.0
5. Watermelon - $1.5
Select an item to buy: 1
You bought Apple for $0.5

Hello, John!
1. Cash In
2. Cash Out
3. Spend Money in the Store
4. Sell Items to the Store
5. Check Balance
6. Check Bank
7. View Inventory
8. View Transaction History
9. Exit
Choose an option: 7
Your inventory:
Apple: 1
Banana: 0
Orange: 0
Grapes: 0
Watermelon: 0

Hello, John!
1. Cash In
2. Cash Out
3. Spend Money in the Store
4. Sell Items to the Store
5. Check Balance
6. Check Bank
7. View Inventory
8. View Transaction History
9. Exit
Choose an option: 8
Transaction history:
Cashed in $50.0
Bought Apple for $0.5

Hello, John!
1. Cash In
2. Cash Out
3. Spend Money in the Store
4. Sell Items to the Store
5. Check Balance
6. Check Bank
7. View Inventory
8. View Transaction History
9. Exit
Choose an option: 9
Goodbye, John!

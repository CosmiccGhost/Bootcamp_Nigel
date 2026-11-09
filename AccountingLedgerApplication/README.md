# Accounting Ledger Application

## Project Overview

The Accounting Ledger Application is a Java command-line program that allows users to manage and track financial transactions. The program provides a simple menu system where users can add deposits, record payments, view their transaction history, and generate reports.

The application uses a CSV file to store transaction information, allowing financial records to remain saved between program runs. Each transaction includes a date, time, description, vendor, and amount.

This project was developed using Java and demonstrates object-oriented programming, file handling, collections, loops, conditional statements, and date and time management.

## Application Features

### 1. Home Menu

When the program starts, users are greeted with a home menu containing four options:

- **D) Add Deposit:** Records money being added to the account.
- **P) Make Payment (Debit):** Records a payment or expense.
- **L) Ledger:** Opens the transaction ledger.
- **X) Exit:** Exits the application.

### 2. Add Deposit

The deposit feature allows users to enter information about money received.

Users are asked to provide:
- Deposit description
- Vendor or source
- Deposit amount

The application automatically records the current date and time. The transaction is then saved to the CSV file with a positive amount.

### 3. Make Payment

The payment feature allows users to record expenses and payments.

Users are asked to provide:
- Payment description
- Vendor
- Payment amount

The application automatically records the current date and time. Payments are stored as negative amounts so they can be distinguished from deposits.

### 4. Ledger

The ledger provides access to previously recorded transactions. It contains the following options:

- **All:** Displays all transactions.
- **Deposits:** Displays transactions with positive amounts.
- **Payments:** Displays transactions with negative amounts.
- **Reports:** Opens the reports menu.

Transactions are organized by date and time, with the newest transactions displayed first. Monetary values are formatted as US currency.

### 5. Reports

The reports section allows users to filter and review their transaction history.

Available reports include:

- **Month To Date:** Displays transactions from the first day of the current month through today's date.
- **Previous Month:** Displays transactions from the entire previous month.
- **Year To Date:** Displays transactions from the beginning of the current year through today's date.
- **Previous Year:** Displays transactions from the previous calendar year.
- **Search by Vendor:** Searches for transactions associated with a specific vendor name.

## Technologies Used

- **Java:** Main programming language used to develop the application.
- **Java 17:** Development environment used for the project.
- **IntelliJ IDEA:** IDE used to write, organize, and run the program.
- **CSV File:** Used to store transaction records.
- **Java Libraries:** Uses classes such as Scanner, FileReader, FileWriter, BufferedReader, BufferedWriter, ArrayList, LocalDate, and LocalDateTime.

## Project Structure

The project is organized into three main Java classes and one CSV file.

### Main.java
Contains the main method and controls the application's menus and user interaction. It also contains the methods used to add deposits, make payments, display transactions, and generate reports.

### Transaction.java
Represents an individual financial transaction. It stores the transaction's date, time, description, vendor, and amount. It also contains a constructor, getters, and setters for accessing and updating transaction information.

### FileManager.java
Handles the application's transaction storage. It reads transaction records from the CSV file, converts them into Transaction objects, sorts them by date and time, and saves new transactions to the file.

### transactions.csv
Stores the transaction records. Each record contains five fields separated by the pipe character (`|`):

- Date
- Time
- Description
- Vendor
- Amount

## How to Run the Project

### Requirements
Before running the application, make sure you have:

- IntelliJ IDEA installed.
- Java Development Kit (JDK) 17 installed.
- The complete project folder, including the CSV file.

### Running Instructions

1. **Download the Project**
    - Download or clone the project from its GitHub repository.
    - Extract the project folder if it was downloaded as a ZIP file.

2. **Open IntelliJ IDEA**
    - Launch IntelliJ IDEA.
    - Select Open and locate the Accounting Ledger project folder.

3. **Configure the JDK**
    - Open File → Project Structure → Project.
    - Make sure the Project SDK is set to Java 17.

4. **Locate Main.java**
    - Open the Project panel.
    - Navigate to `src/main/java/org/example/`.
    - Open the `Main.java` file.

5. **Run the Application**
    - Locate the `main` method.
    - Click the green Run icon next to the method.
    - The application will start in the IntelliJ Run console.

6. **Interact With the Program**
    - Enter the letter or number corresponding to the menu option you want.
    - Follow the prompts to enter transaction information.
    - Use the ledger and reports to review saved transactions.

## Transaction Data Storage

All transaction records are stored in:

`src/main/resources/transactions.csv`

The application reads existing records when the ledger is accessed and appends new records when deposits or payments are saved.

An example of a transaction record looks like this:

`2026-11-05 | 19:03:18 | Customer payment | Nigel Davis | 100.0`

The amount determines the transaction type:
- Positive amount = Deposit
- Negative amount = Payment

Keeping the CSV file in its expected location is important because the application uses that file path when reading and saving transactions.

## Important Notes

- Do not delete or move the `transactions.csv` file if you want to preserve existing transaction records.
- Make sure Java 17 is configured before running the application.
- The application is designed to run through the IntelliJ IDEA console.
- Transaction records are saved directly to the CSV file, rather than being stored only temporarily in memory.
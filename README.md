Character Manager Application

A Java-based character management console application built using Object-Oriented Programming (OOP) principles. This project models standard RPG characters, manages their attributes, and demonstrates dynamic level updates.

📌 Features

Character Type Enum (CharacterType): Strict type safety for classes (WARRIOR, MAGE, ARCHER, ASSASSIN).

Encapsulated Character Model (Character): Secure state management using private attributes, explicit constructors, getters/setters, and custom string formatting.

Collection Management (CharacterManager): Helper class for maintaining character lists.

Interactive Main Entry (Main): Demonstrates character instantiation, printing, and level increments.

📁 Project Structure

src/
 └── com/
      └── unpri/
           └── charactermanager/
                ├── Main.java
                └── model/
                     ├── Character.java
                     ├── CharacterManager.java
                     └── CharacterType.java


🚀 Setup & Execution

Prerequisites

JDK: Java Development Kit (JDK 17 or higher recommended)

IDE: Visual Studio Code, IntelliJ IDEA, or Eclipse

Compilation & Execution Steps

Using Visual Studio Code

Open the project folder in VS Code.

Ensure the Java Extension Pack is installed.

Open Main.java and click Run (or press F5).

Using Command Line (Terminal)

Navigate to the root directory containing the src folder:

Apakah Desain Sekarang Sudah Open for Extension, Closed for Modification?: Secara umum untuk bagian tipe data (enum), desain ini sudah mendukung penambahan tanpa merusak kode lama (Open for Extension). Namun, jika nanti ada logika khusus per karakter (misalnya Necromancer punya skill khusus bangkitkan orang mati yang tidak dimiliki Warrior), pendekatan enum murni ini perlu ditingkatkan menggunakan Polimorfisme atau Inheritance agar benar-benar memenuhi prinsip Open/Closed Principle (OCP) secara penuh tanpa mengubah blok switch-case di kelas utama.Compile the source files:

javac -d bin src/com/unpri/charactermanager/*.java src/com/unpri/charactermanager/model/*.java


Run the application:

java -cp bin com.unpri.charactermanager.Main


📊 Sample Output

=== Character Manager v0.1 ===
Character{name='Arjuna', type=WARRIOR, level=5}
Character{name='Merlin', type=MAGE, level=3}
Character{name='Athena', type=ARCHER, level=4}

>> Arjuna level up!
Character{name='Arjuna', type=WARRIOR, level=6}


🛠️ Architecture Highlights

Encapsulation: All fields in Character are private to prevent unauthorized mutation.

Type Safety: Using Java enum for CharacterType eliminates string typos and compile-time mismatch errors.

Clean Code Package Layout: Business models are strictly segregated within the com.unpri.charactermanager.model package.

Google Docs TP-03
https://docs.google.com/document/d/1P0CGWfY2UCL8z6RCe3fibjA5vaZdDqL6aMHUwy8u5tM/edit?usp=sharing
![alt text](<Screenshot 2026-10-23 141450.png>)
Google Docs TP-05
https://docs.google.com/document/d/15iQ41bN59iQBiX0s0updeUCX5NTklC86VYO10vsxdQA/edit?usp=sharing
Google Docs TP-08
https://docs.google.com/document/d/1BDHQfp-4Ab93L3kNi3bGcRJPEYLGtQyonzQ4dztnd5c/edit?usp=sharing
![alt text](<Screenshot 2026-10-24 150929.png>)
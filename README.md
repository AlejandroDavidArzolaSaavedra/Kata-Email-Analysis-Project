<h1  align="center" >Kata4 - Email Analysis Project (IPO PATTERN)📧📊</h1>

This Java project, named Kata4, focuses on the analysis of email addresses and the creation of a histogram that displays the frequency of email domains present in a text file.

<p  align="center" >
  <img width="400px"src="https://github.com/AlejandroDavidArzolaSaavedra/kata4/assets/90756437/2bd27f42-b353-4039-90ee-0b0b13aa8e20">
</p>

# 👥 Development Team (Ctrl + Click to view profiles)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)

## Project Description 📈

The main objective of Kata4 is to process a text file containing email addresses and generate a histogram that shows the frequency of each email domain in the list. The program follows the Input, Process, Output (IPO) design pattern, where:

- **Input:** The program reads email addresses from a file named `email.txt`.
  
- **Process:** After reading the email addresses, the program processes the information to build a histogram that counts the frequency of each email domain.

- **Output:** Finally, the program displays the generated histogram in a graphical interface.

## Project Structure 🚀

### Main Classes

- **Kata4.java:** Contains the main class of the project. It is responsible for file reading, data processing, and histogram presentation.

### Model Classes

- **Histogram.java:** Represents a generic histogram and is used to store the frequency of email domains.

- **Mail.java:** Defines the structure of an email object and provides methods to obtain the email domain.

### View Classes

- **HistogramDisplay.java:** Creates and displays a graphical histogram using the JFreeChart library.

- **MailHistogramBuilder.java:** Builds a histogram from a list of email objects.

- **MailListReader.java:** Reads email addresses from a file and returns a list of email objects.

## How to Use 🚀

1. Clone or download the project to your development environment.

2. Ensure that you have the JFreeChart library in your project to visualize the histogram.

3. Run the `Kata4.java` class to start the application.

4. Observe the generated histogram in the graphical interface.

## Email File Configuration ⚙️

Ensure that the `email.txt` file is located in the path specified in the `input` method of the `Kata4.java` class. This file should contain a list of email addresses, and the program will ignore lines that do not contain "@".

**Note:** This project assumes you are using NetBeans as your development environment. Make sure to adjust file paths according to your environment if you are using a different IDE.

Enjoy exploring and analyzing email statistics with Kata4! 📧📊

## Contributions 🤝

Feel free to contribute to this project, whether by reporting issues, suggesting improvements, or proposing new features. Every contribution is welcome!

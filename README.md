# Village Management System

A simple Java console application for creating and managing a village with different building types.

## Author
**Ashutosh Vyas**

## Academic Information
- **Course**: 2nd Semester Programming Assignment
- **Assignment**: Object-Oriented Programming with Java
- **Student ID**: 000944693

## Overview
Console-based program where users create a village by adding different types of buildings and view population/profit statistics.

## Building Types
- **House**: Residential with rooms and occupants
- **ApartmentBuilding**: Multi-unit residential building  
- **GroceryStore**: Commercial building with yearly profit
- **HighRise**: Abstract base for tall buildings

## How to Run
```bash
javac assignment5_000944693/*.java
java assignment5_000944693.Village
```

## Usage
1. Enter village name and size
2. Choose number of buildings
3. Select building type (1-4) and enter details
4. View village summary with total population and profit

## Key Features
- Interactive building creation
- Population calculation from residential buildings
- Profit tracking from commercial buildings

## Programming Concepts Used
- **Object-Oriented Programming (OOP)**: Classes and objects
- **Inheritance**: Building hierarchy (HighRise extends Building)
- **Abstract Classes**: Building and HighRise
- **Interfaces**: Inhabitable and Profitable
- **Encapsulation**: Private fields with public methods
- **Polymorphism**: Different building types in same array
- **Static Factory Methods**: create() methods

---
*2nd Semester Programming Assignment*

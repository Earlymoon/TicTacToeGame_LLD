# Tic-Tac-Toe Game in Java

A simple yet fully functional Tic-Tac-Toe game implemented using Java, adhering to Object-Oriented Programming (OOP) and Low-Level Design (LLD) principles.

## Overview

This Tic-Tac-Toe game demonstrates key design principles such as modularity, abstraction, encapsulation, and maintainability. The game allows two players to take turns marking a 3x3 grid, with the winner being the first player to align three marks either horizontally, vertically, or diagonally.

### Key Features:
- Follows SOLID principles
- Object-Oriented Design (OOD)
- Encapsulated game logic
- Easy-to-understand, maintainable code
- Console-based user interface

## Class Design

The game is structured using the following classes:

### 1. `Board`
Handles the game board creation and updates, and manages the grid status. Includes functions to display the board and validate win conditions.

### 2. `Player`
Represents a player in the game, encapsulating the player's name and symbol (X or O).

### 3. `Game`
Contains the core game loop, including turn-based logic and win/loss/draw checks. It ensures smooth player transitions and handles user input.

### 4. `Main`
Entry point for the game. Initializes the game, players, and board, and starts the game loop.

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/tic-tac-toe-java.git

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katanon.xolab4oop;

import java.util.*;

/**
 *
 * @author nonku
 */
public class Game {

    private Player o;
    private Player x;
    private int row, col;
    private Board board;
    Scanner sc = new Scanner(System.in);

    public Game() {
        o = new Player('O');
        x = new Player('X');
    }

    public void play() {
        this.showWelcome();
        while (true) {
            this.newGame();
            showStat();
            if (askContinue()) {
                break;
            }
        }
    }

    public void showStat() {
        System.out.println(x);
        System.out.println(o);
    }

    public boolean askContinue() {
        // play again
        System.out.println("Do you want to play again? (y/n, other to no): ");
        String play = sc.next().trim().toLowerCase();
        if (play.equals("yes") || play.equals("y")) {
        } else {
            return true;
        }
        return false;
    }

    public void newGame() {
        board = new Board(x, o);
        while (true) {
            board.printBoard();
            this.showTurn();
            this.inputRowCol();
            if (board.results()) {
                board.updateStat();
                return;
            }
            board.switchTurn();

        }
    }

    public void showTurn() {
        System.out.println("Turn " + board.getCurrentPlayer().getSymbol());
    }

    private void showWelcome() {
        System.out.println("Welcome to XO Game");
    }

    public void inputRowCol() {
        while (true) {
            try {
                System.out.print("Please input row, col: ");
                row = sc.nextInt() - 1;
                col = sc.nextInt() - 1;

                if (board.setRowCol(row, col)) {
                    return;
                } else {
                    System.out.println("Player is already in that spot!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("This position is outside of the board!");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please input integers!");
                sc.next();
            }
        }
    }
}

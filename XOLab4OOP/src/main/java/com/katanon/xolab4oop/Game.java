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
        board = new Board(o, x);
        board.printBoard();
        inputRowCol();
        board.printBoard();
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
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("This position is outside of the board!");
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input! Please input integers!");
                sc.next();
            }
        }
    }
}

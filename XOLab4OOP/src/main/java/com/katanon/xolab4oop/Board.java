/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katanon.xolab4oop;

/**
 *
 * @author nonku
 */
public class Board {

    private char[][] board = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
    private Player p1;
    private Player p2;

    public Board(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}

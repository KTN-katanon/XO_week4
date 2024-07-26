/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katanon.xolab4oop;

/**
 *
 * @author nonku
 */
public class Game {
    private Player o;
    private Player x;
    private Board board;

    public Game() {
        o = new Player('O');
        x = new Player('X');
    }
    
    
    
    public void play(){
        this.showWelcome();
        board = new Board(o,x);
        this.showBoard();
    }
    
    private void showWelcome(){
        System.out.println("Welcome to XO Game");
    }
    
    private void showBoard(){
        char [][] table = board.getBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

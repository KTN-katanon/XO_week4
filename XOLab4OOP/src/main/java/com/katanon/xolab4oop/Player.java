/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katanon.xolab4oop;

/**
 *
 * @author nonku
 */
public class Player {
    private char symbol;
    private int winCount;
    private int drawCount;
    private int loseCount;

    public Player(char symbol) {
        this.symbol = symbol;
        this.winCount = 0;
        this.drawCount = 0;
        this.loseCount = 0;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }
    
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Player " + symbol + " win!!!";
    }
    
    
}

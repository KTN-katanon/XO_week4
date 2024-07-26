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

    public void incWinCount() {
        this.winCount++;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void incDrawCount() {
        this.drawCount++;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void incLoseCount() {
        this.loseCount++;
    }
    
    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Player{" + "symbol=" + symbol + ", winCount=" + winCount + ", drawCount=" + drawCount + ", loseCount=" + loseCount + '}';
    }

    
    
    
}

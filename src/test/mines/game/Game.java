/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.mines.game;

import test.mines.models.Square;

/**
 *
 * @author Anthony Gonzalez
 */
public class Game {
    
    int width;
    int height;
    int nMines;
    
    public boolean playing;
    
    Square board[][];

    public Game(int width, int height, int nMines) {
        this.width = width;
        this.height = height;
        this.nMines = nMines;       
        this.playing = true;
        this.initBoard();
    }
    
    private void initBoard() {
        board = new Square[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Square sq = new Square();
                sq.covered = true;
                sq.hasFlag = false;
                sq.hasMinesAround = false;
                sq.nMinesAround = 0;
                board[i][j] = sq;
            } 
        }
    }
    
    public void printBoard() { 
        System.out.println("-------------------------------------");  
        for (Square[] rows : board) {
            String srow = "";
            for (Square sq : rows) {
                srow += (sq.covered == true ? "." : "-") + " "; 
            } 
            System.out.println(srow);
        }
        System.out.println("-------------------------------------");  
    }
    
    public void executeAction(int x, int y, String action) {
        if ("U".equalsIgnoreCase(action)) {
            board[x][y].covered = false;
            // TODO makes validations
        }
        printBoard();
    }
    
    
}

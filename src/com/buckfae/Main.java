package com.buckfae;

import com.buckfae.game.GameBoard;
import com.buckfae.game.Tile;
import com.buckfae.game.TileType;

public class Main {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        System.out.println(gameBoard.toString());

        gameBoard.setTileTypeAt(0, 0, TileType.X);
        System.out.println(gameBoard.toString());

        gameBoard.setTileTypeAt(0, 2, TileType.X);
        System.out.println(gameBoard.toString());

        gameBoard.setTileTypeAt(2, 0, TileType.X);
        System.out.println(gameBoard.toString());

        gameBoard.setTileTypeAt(2, 2, TileType.X);
        System.out.println(gameBoard.toString());


    }
}

package com.buckfae.game;

public class GameBoard {

    private Tile[][] tiles; // All Tiles of the gameBoard

    /**
     * Creating a new GameBoard
     */
    public GameBoard(){

        tiles = new Tile[3][3]; // Setting up the array

        // Filling the gameBoard with empty tiles
        for(int colID = 0; colID < 3; colID++){
            for(int rowID = 0; rowID < 3; rowID++){
                tiles[rowID][colID] = new Tile(rowID, colID);
            }
        }
    }

    /**
     * Sets the {@link TileType} of the {@link Tile} a the given coordinates
     * @param rowID the id of the row
     * @param colID the id of the col
     * @param tileType the desired {@link TileType} of the {@link Tile}
     */
    public void setTileTypeAt(int rowID, int colID, TileType tileType){
        if(!checkIfCoordinatesAreValidOnGameBoard(rowID, colID)) throw new IllegalArgumentException("The coordinates given are not valid!");
        tiles[rowID][colID].setTileType(tileType);
    }

    /**
     * Returns the {@link TileType} of the {@link Tile} a the given coordinates
     * @param rowID the id of the row
     * @param colID the id of the col
     * @return the {@link TileType} of the {@link Tile}
     */
    public TileType getTileTypeAt(int rowID, int colID){
        if(!checkIfCoordinatesAreValidOnGameBoard(rowID, colID)) throw new IllegalArgumentException("The coordinates given are not valid!");
        return tiles[rowID][colID].getTileType();
    }

    // Checks if the given coordinates are valid
    private boolean checkIfCoordinatesAreValidOnGameBoard(int rowID, int colID){
        return !(rowID < 0 || rowID > 2 || colID < 0 || colID > 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int colID = 0; colID < 3; colID++){
            for(int rowID = 0; rowID < 3; rowID++){
                sb.append(tiles[rowID][colID].toString());
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}

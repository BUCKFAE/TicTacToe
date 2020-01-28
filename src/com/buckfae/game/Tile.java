package com.buckfae.game;

/**
 * Represents a single tile on the {@link GameBoard}
 */
public class Tile {

    final private int xPos; // The xPos of the tile on the gameBoard
    final private int yPos; // The yPos of the tile on the gameBoard

    private TileType tileType; // The type of the Tile

    /**
     * Creating a new tile
     * @param x the xPos of the new {@link Tile}
     * @param y the yPos of the new {@link Tile}
     */
    Tile(int x, int y){

        // Ensuring we have a valid x and a valid y value
        if(x < 0 || x > 2) throw new IllegalArgumentException("Tile x value can only be between [0, 2]");
        if(y < 0 || y > 2) throw new IllegalArgumentException("Tile y value can only be between [0, 2]");

        this.xPos = x;
        this.yPos = y;

        this.tileType = TileType.N;
    }

    /**
     * Getting the {@link TileType} of the {@link Tile}
     * @return the {@link TileType} of the {@link Tile}
     */
    TileType getTileType(){
        return tileType;
    }

    /**
     * Setting the new {@link TileType} of the {@link Tile}
     * @param newType the new type
     */
    void setTileType(TileType newType){

        if(newType == null) throw new IllegalArgumentException("New tileType can't be null");

        if(tileType != TileType.N) throw new IllegalArgumentException("Can't override the value of a Tile that already belongs to a player");

        tileType = newType;
    }

    @Override
    public String toString() {
        return tileType.toString();
    }
}

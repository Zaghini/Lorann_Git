package model;

/**
 * Map.java created for lorann
 *
 * @author Antoine
 * @version 1.0
 * @since 04/06/2018
 */

public class Map {

    private final int    id;
    private       String name;
    private       int    width;
    private       int    height;
    private       String mapData;
    private       String pawnData;

    public Map(int id, String name, int width, int height, String mapData, String pawnData) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.mapData = mapData;
        this.pawnData = pawnData;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMapData() {
        return mapData;
    }

    public void setMapData(String mapData) {
        this.mapData = mapData;
    }

    public String getPawnData() {
        return pawnData;
    }

    public void setPawnData(String pawnData) {
        this.pawnData = pawnData;
    }
}

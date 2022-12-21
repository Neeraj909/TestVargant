package datamodel;

import java.util.ArrayList;
import java.util.List;

public class RCB {
    private String name;
    private String location;
    private List<Player> player = new ArrayList<Player>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

}

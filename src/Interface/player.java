package Interface;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,this.weapon);
        values.add(2, String.valueOf(this.hitPoints));
        values.add(3, String.valueOf(this.strength));
        return values;
    }

    @Override
    public void read(List<String> readList) {
        if (readList == null)
        {
            exit(-1);
        }else
            this.name = readList.get(0);
            this.weapon = readList.get(1);
            this.hitPoints = Integer.parseInt(readList.get(2));
            this.strength = Integer.parseInt(readList.get(3));

    }

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

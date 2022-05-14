package Interface;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> valuesMonster = new ArrayList<>();
        valuesMonster.add(0,this.name);
        valuesMonster.add(1,String.valueOf(this.hitPoints));
        valuesMonster.add(2, String.valueOf(this.strength));

        return valuesMonster;
    }

    @Override
    public void read(List<String> readList) {
        if (readList == null)
            exit(-1);
        else
            this.name = readList.get(0);
            this.hitPoints = Integer.parseInt(readList.get(1));
            this.strength = Integer.parseInt(readList.get(2));

    }

    @Override
    public String toString() {
        return "monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

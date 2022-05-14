package Interface;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ISaveable object;
        player player = new player("demo", 000, 000);
        object = new player("sonic", 100, 76);
        
        object.write();
        object.read(object.write());
    }
}

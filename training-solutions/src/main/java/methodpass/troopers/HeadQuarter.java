package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public void addTrooper(Trooper trooper) {
        if (new TrooperValidator().isValidTrooper(trooper)) {
            troopers.add(trooper);
        }
    }

    public List<Trooper> getTroopers() {
        return new ArrayList<>(troopers);
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findTrooperByName(String name) {
        new NameValidator().isValidName(name);
        for (Trooper actual : troopers) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Trooper " + name + " is not exist!");
    }

    private Trooper findClosestTrooper(Position target) {
        new PositionValidator().isValidPosition(target);
        Trooper closestTrooper = troopers.get(0);
        for (Trooper actual : troopers) {
            if (closestTrooper.distanceFrom(target) > actual.distanceFrom(target)) {
                closestTrooper = actual;
            }
        }
        return closestTrooper;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        boolean validTrooper = new TrooperValidator().isValidTrooper(trooper);
        boolean validTarget = new PositionValidator().isValidPosition(target);
        if (validTrooper && validTarget) {
            trooper.changePosition(target);
        }
    }
}

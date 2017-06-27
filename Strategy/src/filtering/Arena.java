/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtering;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaugustyniak
 */
class Arena {

    private List<Knight> knights;
    private KnightValidator validator;

    public Arena(KnightValidator validator) {

        this.validator = validator;

        knights = new ArrayList<Knight>();

    }

    public void addKnight(Knight knight) {

        if (validator.validate(knight)) {
            knights.add(knight);
        }

    }

    public String toString() {
        String out = "";
        for (Knight knight : knights) {
            out += "Rycerz " + knight.getName() + "\n";
        }

        return out;

    }

    public static void main(String[] args) {

        Knight anna = new Knight(60, "Anna");
        Knight zbyszko = new Knight(40, "Zbyszko");
        Knight dobromil = new Knight(70, "Dobromil");

        KnightValidator oldValid = new OldKnightsValidator();
        KnightValidator nameValid = new MaleKnightsValidator();

        Arena eldersArena = new Arena(oldValid);
        Arena malesArena = new Arena(nameValid);

        eldersArena.addKnight(anna);
        eldersArena.addKnight(zbyszko);
        eldersArena.addKnight(dobromil);

        malesArena.addKnight(anna);
        malesArena.addKnight(zbyszko);
        malesArena.addKnight(dobromil);

        System.out.println("=== Arena seniorow ===");
        System.out.println(eldersArena);

        System.out.println("=== Arena bez rownoupranienia ===");
        System.out.println(malesArena);

    }

}

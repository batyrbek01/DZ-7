public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] havingSuperAbilities = {magic, medic, warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility("Supersposobnost");


        }
    }
}

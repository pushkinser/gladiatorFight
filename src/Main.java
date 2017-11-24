import fight.calculator.FightResult;
import fight.model.gladiator.Gladiator;
import fight.model.gladiator.parameter.Skill;
import fight.model.weapon.Weapon;
import fight.model.weapon.WeaponType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Skill> skills = new ArrayList<>();
        Skill skill = new Skill();

        skill.setCountOfAttack(500);
        skill.setCountOfBlock(500);
        skill.setHourOfTraining(9 * 30);
        skill.setKills(0);
        skill.setWeaponType(WeaponType.SWORD);
        skills.add(skill);

        Skill skill2 = new Skill();
        skill2.setCountOfAttack(200);
        skill2.setCountOfBlock(200);
        skill2.setHourOfTraining(9 * 10);
        skill2.setKills(1);
        skill2.setWeaponType(WeaponType.LANCE);
        skills.add(skill2);

        Gladiator murmillo = new Gladiator();
        murmillo.setName("Murmillo");
        murmillo.setWeapon(new Weapon(WeaponType.SWORD));
        murmillo.setCountSpirit(65);
        murmillo.setHp(100);
        murmillo.setAgility(60);
        murmillo.setStrength(65);
        murmillo.setStamina(80);
        murmillo.setSkillList(skills);

        Gladiator gallus = new Gladiator();
        gallus.setName("Gallus");
        gallus.setWeapon(new Weapon(WeaponType.LANCE));
        gallus.setCountSpirit(75);
        gallus.setHp(100);
        gallus.setAgility(60);
        gallus.setStrength(65);
        gallus.setStamina(80);
        gallus.setSkillList(skills);

        int countMurmilloWin = 0;
        int N = 1000;
        for (int i = 0; i < N; i++) {
            if (FightResult.result(murmillo, gallus).equals(murmillo.getName())) countMurmilloWin++;
        }
        System.out.println(murmillo.getName() + ":" + countMurmilloWin);
        System.out.println(gallus.getName() + ":" + (N - countMurmilloWin));


    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance.interfaceDAO;

import java.util.List;
import metier.Weapon;

/**
 *
 * @author Short
 */
public interface IWeaponDAO {
    public List<Weapon> getWeapons();
}

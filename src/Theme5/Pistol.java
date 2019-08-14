package Theme5;

public class Pistol {

    private int ammo;

    public Pistol(int ammo) {
        setAmmo(ammo);
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void shoot(){
        if (ammo > 0){
            System.out.println("Бах!");
            ammo--;
        }
        else System.out.println("Клац!");
    }
}

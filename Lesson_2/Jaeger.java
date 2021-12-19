public class Jaeger {

    private String madelName;
    private String mark;
    private String origin;
    private String weapon;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public String getMadelname() {
        return madelName;
    }

    public void setMadelname(String madelName) {
        this.madelName = madelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
        
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
        
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
        
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return true;
    }

    public String move() {
        return "идет";
    }

    public String scanKaiju() {
        return "сканирует";
    }

    public String useWeapon() {
        return "Егерь " + madelName + " использует " + weapon;
    }
}
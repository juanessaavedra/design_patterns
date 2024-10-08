package patrones_creacionales.prototype.prototype_laboratory;

public class Character implements Cloneable{
    private String name;
    private String type;
    private int level;

    public Character(String name, String type, int level){
        this.name = name;
        this.type = type;
        this.level = level;
    }

    //Metodo para clonar un personaje
    @Override
    public Character clone() throws CloneNotSupportedException{
        return (Character) super.clone();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                '}';
    }
}

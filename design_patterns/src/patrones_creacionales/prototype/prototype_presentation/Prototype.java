package patrones_creacionales.prototype.prototype_presentation;

public interface Prototype extends Cloneable{
    Prototype shallowClone() throws CloneNotSupportedException; //Clonacion superficial
    Prototype deepClone() throws CloneNotSupportedException; //Clonacion profunda
}

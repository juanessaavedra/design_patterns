package patrones_creacionales.prototype.prototype_laboratory;

public class Main {
    public static void main(String[] args) {
        try {
            Character originalCharacter = new Character("Sponge bob", "Square pants", 1);
            System.out.println("Original character: " + originalCharacter);

            Character clonedCharacter = originalCharacter.clone();
            System.out.println("Cloned character: " + clonedCharacter);

            System.out.println("Are the characters the same? " + (originalCharacter == clonedCharacter));

        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

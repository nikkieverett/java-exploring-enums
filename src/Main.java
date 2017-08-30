public class Main {

    public static void main(String[] args) {
        for(Characters character : Characters.values()){
            System.out.println(character + " can do magic: " + character.canDoMagic());
        }
    }

}

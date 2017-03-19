/**
 * Created by malik on 20.03.2017.
 */
public class Cats extends Animals {
    public String favToy="Yarn";
    public void playWith(){
        System.out.println("Yeah "+favToy);
    }

    @Override
    public void walkAround() {
        System.out.println(this.getName()+" stalks around");
    }

    public String getFavToy() {
        return favToy;
    }

    public Cats(){

    }

    public Cats(String name, String favFood, String favToy) {
        super(name, favFood);
        this.favToy = favToy;
    }
}

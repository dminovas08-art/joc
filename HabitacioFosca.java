public class HabitacioFosca extends Habitacio {
    private boolean illuminada = false;

    public HabitacioFosca(String nom, String descripcio){
        super(nom, descripcio);
    }

    // TO DO: canviar per utilitzarItem()
    public void utilitzarItem(Item item){
        if (item.getNom().equalsIgnoreCase("Llanterna")) {
            illuminada = true;
            System.out.println("Has il·luminat l'habitació.");
            System.out.println(super.toString());
        }
        else {
            System.out.println("Aquest objecte no serveix per il·luminar.");
        }
    }

    @Override
    public String toString() {
        if (!illuminada) {
            return "L'habitació és a les fosques, no es veu res.";

        }
        else {
            return super.toString();
        }
    }

    @Override
    public Item getItem(){
        if (!illuminada) {
            return null;
        }
        else {
            return super.getItem();
        }
    }
}

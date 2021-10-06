
// подкласс "Электрогитара"
class ElGitar extends StringInstrument {
    private boolean pwr; // переменная состояния питания эл.гитары

    public ElGitar(int numSrings, String name) {
        super(numSrings, name);
        this.pwr = false; // начальное состояние - выключена
    }

    // метод включения/выключения питания гитары
    public void power(boolean power) {
        this.pwr = power; //
    }

    // переопределяем метод игры: если не включено питание - играть не может.
    @Override
    public void sound() {
        if (this.pwr) {
            System.out.println(this.name + " играет");
        } else {
            System.out.println(this.name + " не включена!!!");
        }
    }
}

// подкласс "Скрипка"
class Violin extends StringInstrument {
    private boolean violinBowIsReady; // переменная готовности смычка скрипки

    public Violin(int numSrings, String name) {
        super(numSrings, name);
        this.violinBowIsReady = false; // начальное состояние - смычок в футляре
    }

    public void getViolinBow(){
        violinBowIsReady = true; // достаем смычок, наносим канифоль - готов к игре
    }

    // переопределяем метод игры: если смы
    @Override
    public void sound() {
        if (this.violinBowIsReady) {
            System.out.println(this.name + " играет");
        } else {
            System.out.println(this.name + " не играет - смычок не готов!!!");
        }
    }
}

// подкласс "Домра"
class Domra extends StringInstrument {

    public Domra (int numSrings, String name) {
        super(numSrings, name);
    }

}




public class Main {

    public static void main(String[] args) {
        // создаем наше трио:
        System.out.println("Струнное трио ООП:)");
        ElGitar elgitar = new ElGitar(6, "Электрогитара");
        Violin violin = new Violin(4, "Скрипка");
        Domra domra = new Domra(3,"Домра");

        //включаем гитару
        elgitar.power(true);
        // достаем и готовим смычок
        violin.getViolinBow();
        // домру готовить не надо

        // и... начали...
        System.out.println();
        System.out.println("Начинам наш концерт...");
        elgitar.sound();
        violin.sound();
        domra.sound();



    }

}
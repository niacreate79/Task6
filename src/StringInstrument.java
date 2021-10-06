
// базовый класс "Струнные инструменты"
public class StringInstrument{
    private int numSrings;  // кол-во струн
    public String name;


    // конструктор по умолчанию
    StringInstrument(){
        this.name="Струнный инструмент";
        setNumSrings(3);
        about();
    }


    StringInstrument(int numSrings, String name){
        this.name=name;
        setNumSrings(numSrings);
        about();
    }

    // геттер кол-ва струн
    public int getNumSrings() {
        return numSrings;
    }

    // сеттер кол-ва струн
    public void setNumSrings(int numSrings) {
        this.numSrings = numSrings;
    }

    // метод "игра"
    public void sound(){
        System.out.println(this.name+" играет");
    }

    // метод "информация об инструменте"
    public void about(){
        System.out.println("Инструмент '"+this.name+"', струн: "+this.numSrings);
    }

}

public class Main {

//    Potrebno je kreirati klasu kalkulator koja ima dva svojstva operand1 i operand2.
//    Klasa poseduje metode: add,sub,mul i div koje kao rezultat vraćaju zbir, razliku,
//    proizvod i količnik dva operanda.
//    Sve vrednosti su tipa double.
//
//    Create class kalkulator that has two fields operand1 and operand2. The class should
//    have methods add, sub, mul and div that provide addition, subtraction, multiplication
//    and division of the two operands. All values should be of type double.
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();
        kalkulator.add();
        kalkulator.sub();
        kalkulator.mul();
        kalkulator.div();
    }
}
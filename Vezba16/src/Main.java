public class Main {
    /*
    Kreirati for petlju koja ce prikazati tablicu mnozenja sa 1,2 i 3 za brojeve od 1 do 10.

    Create a program with a "for" loop that will display multiplication table for the numbers 1,2 and 3
    with numbers 1 trough 10.
     */
    public static void main(String[] args) {
        System.out.println("*******************");
        System.out.println("#     1     2     3");
        System.out.println("*******************");
        for(int i=1;i<11;i++){
            System.out.println(i+"     "+i*1+"     "+i*2+"     "+i*3);
        }
    }
}
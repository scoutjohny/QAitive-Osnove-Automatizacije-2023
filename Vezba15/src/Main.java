public class Main {
    /*
    Dati su sledeći ulazni podaci za jedno vozilo: String carMake = "Ford"; int doors = 4;
    Potrebno je napraviti uslovnu konstrukciju koja će da proverava da li je proizvođač
    automobila Ford i ukoliko jeste, da u zavisnosti od broja vrata prikazuje odgovarajuću poruku.

    Create a program that will have following vehicle input data: String carMake = "Ford"; int doors = 4;
    The program should have a program flow control implemented that will check weather the car manufacturer
    is "Ford" and if it is, to display the appropriate message in regards to the number of doors the car has.
     */
    public static void main(String[] args) {
        String carMake = "Ford";
        int doors = 4;

        if (carMake.equals("Ford")) {
            switch (doors) {
                case 1: {
                    System.out.println("Car maker is Ford and the car has 1 door");
                    break;
                }
                case 2: {
                    System.out.println("Car maker is Ford and the car has 2 doors");
                    break;
                }
                case 3: {
                    System.out.println("Car maker is Ford and the car has 3 doors");
                    break;
                }
                case 4: {
                    System.out.println("Car maker is Ford and the car has 4 doors");
                    break;
                }
                case 5: {
                    System.out.println("Car maker is Ford and the car has 5 doors");
                    break;
                }
                default: {
                    System.out.println("Car maker is Ford but that door number is not supported");
                }
            }//End of Switch/Case
        }//End of IF statement
    }
}
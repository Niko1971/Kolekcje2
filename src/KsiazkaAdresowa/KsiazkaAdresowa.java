package KsiazkaAdresowa;

public class KsiazkaAdresowa implements Comparable {

    public static int compareTo(Object obj1, Object obj2) {
        String miasto1 = ((Person) obj1).getMiasto();
        String miasto2 = ((Person) obj2).getMiasto();
        return (miasto1.compareTo(miasto2));
    }

    public static void main(String[] args) {
        KsiazkaAdresowa ksiazka = new KsiazkaAdresowa();

        Person osoba1 = new Person("Katowice", "Czarna", "Krawczyk", "Maryla", "512323653");
        Person osoba2 = new Person("Sosnowiec", "Zółta", "Rodowicz", "Zbigniew", "125123254");
        Person osoba3 = new Person("Tychy", "Biała", "Wodecki", "Krzysztof", "1234541235");

        System.out.println(compareTo(osoba2, osoba2));
        System.out.println(compareTo(osoba3, osoba2));
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

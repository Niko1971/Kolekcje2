package KsiazkaAdresowa;

public class Person implements Comparable {

    private String miasto;
    private String ulica;
    private String imie;
    private String nazwisko;
    private String telefon;

    public void setMiasto() {
        this.miasto = miasto;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setUlica() {
        this.ulica = ulica;
    }

    public String getUlica() {
        return ulica;
    }

    public void setNazwisko() {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie() {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setTelefon() {
        if (telefon.length() == 9) {
            this.telefon = telefon;
        } else {
            System.out.println("Niepoprawny numer telefonu");
        }
    }

    public String getTelefon() {
        return telefon;
    }

    public Person(String miasto, String ulica, String nazwisko, String imie, String telefon) {

        this.miasto = miasto;
        this.ulica = ulica;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;

    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

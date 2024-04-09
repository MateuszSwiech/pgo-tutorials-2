public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public double[] grades;


    public double obliczanieSredniej(){
        double srednia = 0;
        double[] zaokragloneOceny = {2,2.5,3,3.5,4,4.5,5};
        if (grades.length == 0) {
            throw new IllegalArgumentException("Sudent nie ma żadnej oceny");

        } else if (grades.length>20) {
            throw new IllegalArgumentException("Za dużo ocen, max 20");

        }else{
            for (int i = 0; i < grades.length; i++) {
                srednia += grades[i];

            }
            srednia /= grades.length;

            //w celu zaokraglenia liczby do jej nablizszej wartosci z "double[] zaokragloneOceny",
            //porownujemy wynik odejmowania zaokraglonych liczb z "zaokragloneOceny" od sredniej
            //najmniejsza wartosc tej roznicy, jest zaokraglona wartoscią sredniej
            double najblizszaWartosc = zaokragloneOceny[0];
            double najmniejszyWynikOdejmowania = Math.abs(srednia - zaokragloneOceny[0]);

            for (int i = 1; i < zaokragloneOceny.length; i++) {
                double aktualnyWynikOdejmowania = Math.abs(srednia - zaokragloneOceny[i]);

                //najmniejsza roznice bierzemy jako nablizsza wartosc sredniej
                //jesli roznica jest taka sama to zgodnie z matematycznymi zasadami, bierzemy wieksza wartosc zaokraglenia
                if (aktualnyWynikOdejmowania < najmniejszyWynikOdejmowania || (aktualnyWynikOdejmowania == najmniejszyWynikOdejmowania && zaokragloneOceny[i] > najblizszaWartosc)) {
                    najblizszaWartosc = zaokragloneOceny[i];
                    najmniejszyWynikOdejmowania = aktualnyWynikOdejmowania;
                }
            }
            srednia = najblizszaWartosc;
            return srednia;
        }




    }




}

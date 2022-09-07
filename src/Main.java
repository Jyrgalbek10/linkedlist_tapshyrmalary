import java.util.*;

public class Main {
    static final Random random = new Random();
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        LinkedList<Country> city = new LinkedList<>();
        Country country0 = new Country(1,"Bishkek",600,11111);
        Country country1 = new Country(2,"Moscow",700,22222);
        Country country2 = new Country(3,"Nur-Sultan",800,33333);
        Country country3 = new Country(4,"Washington",900,44444);
        Country country4 = new Country(5,"Tashkent",1000,55555);
        Country country5 = new Country(6,"Minsk",1100,66666);
        Country country6 = new Country(7,"Ankara",1200,77777);
        Country country7 = new Country(8,"Baku",1300,88888);
        Country country8 = new Country(9,"London",1500,99999);
        Country country9= new Country(10,"Dushanba",1400,10000);

        city.add(country0);
        city.add(country1);
        city.add(country2);
        city.add(country3);
        city.add(country4);
        city.add(country5);
        city.add(country6);
        city.add(country7);
        city.add(country8);
        city.add(country9);
        System.out.println(" Tapshyrma");
//        for (Country c : city){
//
//            System.out.println(c.getId()+" " + c.getName()+" "+c.getPopulation()+" "+c.getGdp());
//        }
//        System.out.println();

        city.sort(Country.sortCountryId);
        for (Country c: city) {
            System.out.println(c.getId()+" " + c.getName()+" "+c.getPopulation()+" "+c.getGdp());
        }

        System.out.println();
        city.sort(Country.sortCountryName);
        for (Country c: city) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getPopulation() + " " + c.getGdp());
        }

        System.out.println();
        city.sort(Country.sortCountryPopulation);
        for (Country c: city) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getPopulation() + " " + c.getGdp());


        }
        System.out.println();
        city.sort(Country.sortCountryGDP);
        for (Country c: city) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getPopulation() + " " + c.getGdp());
        }
    }
}

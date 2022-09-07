import java.util.Comparator;

public class Country{
    private int id;
    private String name;
    private int population;
    private int gdp;

    public Country(int id, String name, int population, int gdp) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.gdp = gdp;
    }
    public static Comparator<Country> sortCountryPopulation = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o2.population-o1.population;
        }
    };
    public static Comparator<Country>sortCountryId = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.id - o2.id;
        }
    };

    public static Comparator<Country>sortCountryName = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public static Comparator<Country>sortCountryGDP= new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o2.gdp-o1.gdp;
        }
    };




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", gdp=" + gdp +
                '}';
    }



}
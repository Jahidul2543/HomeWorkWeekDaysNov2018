package Homework.Homework1;

public class Countries {
    String name;
    String country;
    int population;


    public void immigrate(){
        System.out.println(name + "was imigrated "+ "from"+country +"with population of " + population);


    }
    public Countries(String name, String country, int population){
        this.name = name;
        this.country = country;
        this.population = population;

    }

    public static void main(String[] args) {
        Countries myCountry= new Countries("Ziyad", "Pakistan", 239654);
        myCountry.immigrate();

        }
    }


import Model.Additions;
import Model.DeluxeBurger;
import Model.Hamburger;
import Model.HealthyBurger;

public class Main {

    public static void Uygula(){
        Additions[] additions1=new Additions[4];

        Hamburger hamburger1=new Hamburger("standart1","etli",10,"kepekli");
        System.out.println(hamburger1);
        Hamburger hamburger2=new Hamburger("standart2","tavuklu",8,"normal");
        System.out.println(hamburger2);

        hamburger1.addHamburgerAddition1("mayonez",3);
        hamburger1.itemizeHamburger();

        DeluxeBurger deluxeBurger1=new DeluxeBurger("deluxe1","etli",1,"normal","dilimli","cola");
        System.out.println(deluxeBurger1);
        deluxeBurger1.addHamburgerAddition1("mayonez",3);

        HealthyBurger healthyBurger1=new HealthyBurger("healthy1","peynirli",10,"kepekli");
        System.out.println(healthyBurger1);
        healthyBurger1.addHealthyAddition1("maydonoz",2);
        healthyBurger1.itemizeHamburger();

        System.out.println("////////////////////////////////");

        Hamburger hamburger = new Hamburger("Basic", "Normal",3.56, "Wrap");

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger","Tofu", 5.67, "Sandwich");

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
    }
        public static void main(String[] args) {
           Uygula();
    }
}
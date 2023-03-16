package main.java.patterns.creational.abstract_factory;

public class CarDealer {
    public static void main(String[] args) {
        CarsFactory fordFactory = new FordFactory();
        fordFactory.createCoupe();
        fordFactory.createSedan();

        CarsFactory toyotaFactory = new ToyotaFactory();
        toyotaFactory.createCoupe();
        toyotaFactory.createSedan();

        CarsFactory factory = new CarsFactory() {
            class BmwCoupe implements Coupe {
                public BmwCoupe() {
                    System.out.println("Create BmwCoupe");
                }
            }

            class BmwSedan implements Sedan {
                public BmwSedan() {
                    System.out.println("Create BmwSedan");
                }
            }

            @Override
            public Sedan createSedan() {
                return new BmwSedan();
            }

            @Override
            public Coupe createCoupe() {
                return new BmwCoupe();
            }
        };
        factory.createCoupe();
        factory.createSedan();
    }
}

abstract class Product {
    abstract void use();
}

class ConcreteProductA extends Product {
    void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB extends Product {
    void use() {
        System.out.println("Using Product B");
    }
}

abstract class Creator {
    abstract Product factoryMethod();

    Product createProduct() {
        return factoryMethod();
    }
}

class ConcreteCreatorA extends Creator {
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodDesign {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.use();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.use();
    }
}

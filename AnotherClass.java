class AnotherClass {

    static void useBag() {

        System.out.println("Inside AnotherClass: Using Bag");

        Bag.openBag();
        Bag.addItem();
        Bag.checkWeight();
        Bag.removeItem();
        Bag.closeBag();
    }
}

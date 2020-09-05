package chain_of_responsability;

class ClassificatePerson {

    public String classificate(Person person){
        RangeAge baby = new Baby();
        RangeAge child = new Child();
        RangeAge teenager = new Teenager();
        RangeAge adult = new Adult();
        RangeAge old = new Old();

        baby.next(child);
        child.next(teenager);
        teenager.next(adult);
        adult.next(old);

        return baby.print(person);
    }
}

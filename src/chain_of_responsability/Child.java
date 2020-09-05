package chain_of_responsability;

class Child implements RangeAge {
    private RangeAge rangeAge;

    @Override
    public String print(Person person) {
        if(person.age <=10){
            return person.name + " é uma criança";
        }
        return this.rangeAge.print(person);
    }

    @Override
    public void next(RangeAge rangeAge) {
        this.rangeAge = rangeAge;
    }
}

package chain_of_responsability;

class Adult implements RangeAge {

    private RangeAge rangeAge;

    @Override
    public String print(Person person) {
        if(person.age <=60){
            return person.name + " é um Adulto";
        }
        return this.rangeAge.print(person);
    }

    @Override
    public void next(RangeAge rangeAge) {
        this.rangeAge = rangeAge;
    }
}

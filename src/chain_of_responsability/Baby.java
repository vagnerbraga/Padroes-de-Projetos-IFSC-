package chain_of_responsability;

class Baby implements RangeAge {

    private RangeAge rangeAge;

    @Override
    public String print(Person person) {
        if(person.age <=2){
            return person.name + " é um Bebê";
        }
        return this.rangeAge.print(person);
    }

    @Override
    public void next(RangeAge rangeAge) {
        this.rangeAge = rangeAge;
    }
}

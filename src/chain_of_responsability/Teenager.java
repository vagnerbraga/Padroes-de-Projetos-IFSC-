package chain_of_responsability;

class Teenager implements RangeAge {

    private RangeAge rangeAge;

    @Override
    public String print(Person person) {
        if(person.age <=18){
            return person.name + " é um adolescente";
        }
        return this.rangeAge.print(person);
    }

    @Override
    public void next(RangeAge rangeAge) {
        this.rangeAge = rangeAge;
    }
}

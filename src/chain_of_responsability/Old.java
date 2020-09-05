package chain_of_responsability;

class Old implements RangeAge {

    private RangeAge rangeAge;

    @Override
    public String print(Person person) {
        return person.name + " é um Idoso";
    }

    @Override
    public void next(RangeAge rangeAge) {
    }
}

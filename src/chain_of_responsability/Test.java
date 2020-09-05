package chain_of_responsability;

import org.w3c.dom.ranges.Range;

class Test {

    public static void main(String[] args) {
        Person person = new Person("Fulano de tal", 70);
        ClassificatePerson classificatePerson = new ClassificatePerson();
        System.out.println(classificatePerson.classificate(person));

    }
}

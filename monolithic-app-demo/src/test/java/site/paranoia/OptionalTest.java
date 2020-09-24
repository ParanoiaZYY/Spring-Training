package site.paranoia;

import org.junit.Test;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import site.paranoia.module.fin.domain.FinCharge;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

    public Optional<FinCharge> getFinCharge() {
        FinCharge finCharge = new FinCharge();
        return Optional.of(finCharge);
    }

    public Optional<List<FinCharge>> getFinChargeList() {
        FinCharge finCharge = new FinCharge();
        List<FinCharge> finChargeList = new ArrayList<>();
        finChargeList.add(finCharge);
        return Optional.of(finChargeList);
    }

    public Depart getDepart() {
        Depart depart = null;
        return depart;
    }



    @Test
    public void testOptional() {
        Optional<FinCharge> stringOptional = getFinCharge();
        stringOptional.ifPresent(finCharge -> {

        });

        Depart depart = new Depart();
        People people = new People();
        people.setName("A001");
        depart.setPeople(people);

        String peopleName = "";

        if (!ObjectUtils.isEmpty(depart)) {
            if (!ObjectUtils.isEmpty(depart.getPeople())) {
                if (!StringUtils.isEmpty(depart.getPeople().getName()))
                    peopleName = depart.getPeople().getName();
            }
        }

        System.out.println(peopleName);
    }

    @Test
    public void testOptional2() {
        Depart depart = new Depart();
        People people = new People();
        people.setName("A001");
        depart.setPeople(people);

        String peopleName = Optional.of(depart)
                .map(Depart::getPeople)
                .map(People::getName)
                .orElse("");

        System.out.println(peopleName);
    }

    @Test
    public void testOptional3() {
        Depart depart = getDepart();

        String peopleName = Optional.ofNullable(depart)
                .map(Depart::getPeople)
                .map(People::getName)
                .orElse("");

        System.out.println(peopleName);
    }

    private People createPeople() {
        System.out.println("createPeople");
        return new People();
    }

    @Test
    public void testOptional4() {
        People people = new People();
        People peopleName = Optional.of(people)
                .orElse(createPeople());
        System.out.println(peopleName);
    }

    @Test
    public void testOptional5() {
        People people = new People();
        People peopleName = Optional.of(people)
                .orElseGet(this::createPeople);
        System.out.println(peopleName);
    }

    @Test
    public void testOptional6() {
        People people = null;
        People peopleName = Optional.ofNullable(people)
                .orElseGet(this::createPeople);
        System.out.println(peopleName);
    }

    @Test
    public void testOptional7() throws Throwable {
        String type = null;
        Optional.ofNullable(type)
                .orElseThrow(IllegalArgumentException::new);
    }
}

package a;

public class PersonBuilder {
    String setName;
    String setSurname;
    int setAge;
    String setAddress;

    public PersonBuilder setName(String name) {
        setName = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        setSurname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        setAge = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        setAddress = address;
        return this;
    }


    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (setName == null || setSurname == null) {
            throw new IllegalStateException("Вы ввели не все обязательные параметры");
        }
        if (setAge < 0) {
            throw new IllegalArgumentException("Не корректно указан возраст");
        }
        return new Person(setName, setSurname, setAge, setAddress);
    }
}


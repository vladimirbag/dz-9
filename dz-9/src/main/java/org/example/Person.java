package org.example;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        if (this instanceof Man) {
            return age >= 65;
        } else if (this instanceof Woman) {
            return age >= 60;
        }
        return false;
    }

    public void registerPartnership(Person partner) {
        this.partner = partner;
        if (partner != null) {
            partner.partner = this;
            if (this instanceof Woman) {
                partner.setLastName(this.lastName);
            }
        }
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            partner.partner = null;
            if (returnToPreviousLastName && this instanceof Woman) {
                this.lastName = partner.getLastName();
            }
        }
        this.partner = null;
    }
}

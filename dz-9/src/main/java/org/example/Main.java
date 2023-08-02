package org.example;

    public class Main {
        public static void main(String[] args) {
            // Створення об'єктів класу Man і Woman
            Man john = new Man("John", "Smith", 68);
            Woman mary = new Woman("Mary", "Johnson", 62);

            // Встановлення віку для об'єктів
            john.setAge(68);
            mary.setAge(62);

            // Перевірка, чи на пенсії обидва об'єкти
            System.out.println(john.getFirstName() + " " + john.getLastName() + " is retired: " + john.isRetired());
            System.out.println(mary.getFirstName() + " " + mary.getLastName() + " is retired: " + mary.isRetired());

            // Зареєструвати партнерство між об'єктами
            john.registerPartnership(mary);
            System.out.println(john.getFirstName() + " " + john.getLastName() + " is partner of " + john.partner.getFirstName() + " " + john.partner.getLastName());
            System.out.println(mary.getFirstName() + " " + mary.getLastName() + " is partner of " + mary.partner.getFirstName() + " " + mary.partner.getLastName());

            // Скасувати партнерство
            mary.deregisterPartnership(true);
            System.out.println(mary.getFirstName() + " " + mary.getLastName() + " is partner of " + mary.partner);
        }
    }
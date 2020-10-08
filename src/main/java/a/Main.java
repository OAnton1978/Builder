package a;


    public class Main {
        public static void main(String[] args) {
            Person mom = new PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф")
                    .setAge(31)
                    .setAddress("Сидней")
                    .build();
            Person son = mom.newChildBuilder()
                    .setName("Антошка")
                    .build();
            System.out.println("У " + mom + " есть сын, " + son);


            try {
                // Не хватает обяхательных полей
                new PersonBuilder().build();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }

            try {
                // Возраст недопустимый
                new PersonBuilder()
                        .setName("Анна")             //в задании строк 28,29 нет, добавил т.к. метод build кидает первое исключение и до следующего дело не доходит
                        .setSurname("Вольф")
                        .setAge(-100).build();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

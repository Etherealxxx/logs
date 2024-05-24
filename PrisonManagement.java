package org.example;

class PrisonManagement extends Prison {

    private static final java.util.logging.Logger logger = Logger.setupLogger(PrisonManagement.class.getName());

    @Override
    public void addPrisoner(String name, int age, String crime) {
        logger.info("Добавление заключенного: " + name + ", возраст: " + age + ", преступление: " + crime);
    }

    @Override
    public void releasePrisoner(int prisonerId) {
        logger.info("Освобождение заключенного с ID: " + prisonerId);
    }

    @Override
    public String searchPrisoner(String searchTerm) {
        logger.info("Поиск заключенного по запросу: " + searchTerm);
        return "Заключенный не найден";
    }
}

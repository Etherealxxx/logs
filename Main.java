package org.example;

public class Main {
    // Логгер для основного класса
    private static final java.util.logging.Logger logger = Logger.setupLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Программа запущена");

        System.out.println("Количество заключенных: " + Prison.getPrisonerCount("123"));
        System.out.println("Продолжительность приговора: " + Prison.calculateSentenceLength("01-01-2024", "01-01-2025"));
        Prison.recordVisitorEntry("Андрей", "04-06-2026", "посещение");

        Prison main = new PrisonManagement();

        main.addPrisoner("Владислав", 30, "кража");
        main.releasePrisoner(456);
        System.out.println(main.searchPrisoner("Владислав"));

        Prison.getPrisonStatistics();
        Prison.updateVisitorRecord("Андрей", "04-04-2027", "визит");

        logger.info("Программа завершена");
    }
}

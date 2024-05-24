package org.example;

abstract class Prison {
    // Логгер
    private static final java.util.logging.Logger logger = Logger.setupLogger(Prison.class.getName());

    public static int getPrisonerCount(String prisonId) {
        logger.info("Получение количества заключенных для ID тюрьмы: " + prisonId);
        return 100;
    }

    public static int calculateSentenceLength(String startDate, String endDate) {
        logger.info("Расчет продолжительности приговора с " + startDate + " по " + endDate);
        return 365;
    }

    public static void recordVisitorEntry(String visitorName, String visitDate, String purpose) {
        logger.info("Посетитель " + visitorName + " осуществил вход с целью: " + purpose + " " + visitDate);
    }

    public static void getPrisonStatistics() {
        logger.info("Получение статистики по тюрьме");
        System.out.println("Статистика:");
        System.out.println("Всего заключенных: 100");
        System.out.println("Средний срок заключения: 3 года");
    }

    public static void updateVisitorRecord(String visitorName, String newVisitDate, String newPurpose) {
        logger.info("Обновление записи посетителя: " + visitorName + " с новой датой посещения: " + newVisitDate + " и новой целью: " + newPurpose);
    }

    public abstract void addPrisoner(String name, int age, String crime);
    public abstract void releasePrisoner(int prisonerId);
    public abstract String searchPrisoner(String searchTerm);
}

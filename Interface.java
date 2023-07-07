public class Interface {
      public static void pageHeadMenuView() {
        System.out.println();
        System.out.println("\t\tАвтомат игрушек");
        System.out.println();
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Игрушки.");
        System.out.println("2. Розыгрыш игрушек.");
        System.out.println("3. Выход из программы.");
    }
    public static void pageToyView() {
        System.out.println();
        System.out.println("\t\t\tИгрушки");
        System.out.println();
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Посмотреть все игрушки.");
        System.out.println("2. Добавить новую игрушку.");
        System.out.println("3. Изменить вес игрушки(шанс выпадения игрушки).");
        System.out.println("4. Удалить игрушку.");
        System.out.println("5. Выход в главное меню.");
    }
    public static void pageToysDrawingView() {
        System.out.println();
        System.out.println("\t\tРозыгрыш игрушек");
        System.out.println();
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Список призовых игрушек.");
        System.out.println("2. Список разыгранных игрушек.");
        System.out.println("3. Разыграть игрушку, для добавления ее в список призовых игрушек.");
        System.out.println("4. Получить призовую игрушку.");
        System.out.println("5. Выход в главное меню.");
    }
}

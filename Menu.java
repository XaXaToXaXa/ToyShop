    public class Menu {
        final String FILE_NAME_TOYS = "./Toys.csv";
        final String PRIZE_TOY = "./PrizeToys.csv";
        final String AWARDED_TOY = "./AwardedToys.csv";

        public void start() {
            int numberOfMenu;
            do {
                Interface.pageHeadMenuView();
                numberOfMenu = Input.choice();
                switch (numberOfMenu) {
                    case 1:
                        Toys();
                        break;
                    case 2:
                        Prize();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
                }
            } while (numberOfMenu != 3);
        }


        public void Toys() {
            int numberOfMenu;
            do {
                Interface.pageToyView();
                numberOfMenu = Input.choice();
                switch (numberOfMenu) {
                    case 1:
                        System.out.println(ToyHandler.readFromFile(FILE_NAME_TOYS));
                        break;
                    case 2:
                        ToyHandler.addNewToy();
                        break;
                    case 3:
                        System.out.println(ToyHandler.readFromFile(FILE_NAME_TOYS));
                        System.out.println("\n\tВведите № игрушки для изменения веса игрушки: ");
                        int idToy = Input.choice();
                        ToyHandler.updateToyWeight(FILE_NAME_TOYS, idToy);
                        break;
                    case 4:
                        System.out.println(ToyHandler.readFromFile(FILE_NAME_TOYS));
                        System.out.println("\n\tВведите № игрушки для удаления: ");
                        ToyHandler.removeToy(FILE_NAME_TOYS, Input.choice());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
                }
            } while (numberOfMenu != 5);
        }

        public void Prize() {
            int numberOfMenu;
            do {
                Interface.pageToysDrawingView();
                numberOfMenu = Input.choice();
                switch (numberOfMenu) {
                    case 1:
                        System.out.println("\n\tСписок призовых игрушек.");
                        System.out.println(ToyHandler.readPrize(PRIZE_TOY));
                        break;
                    case 2:
                        System.out.println("\n\tСписок разыгранных игрушек.");
                        System.out.println(ToyHandler.readPrize(AWARDED_TOY));
                        break;
                    case 3:
                        ToyHandler.addToPrize(FILE_NAME_TOYS, PRIZE_TOY);
                        System.out.println("\n\tСписок призовых игрушек.");
                        System.out.println(ToyHandler.readPrize(PRIZE_TOY));
                        break;
                    case 4:
                        ToyHandler.addAwarded(PRIZE_TOY, AWARDED_TOY);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
                }
            } while (numberOfMenu != 5);
        }
    }

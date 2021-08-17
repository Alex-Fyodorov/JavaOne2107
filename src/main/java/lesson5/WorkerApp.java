package lesson5;

public class WorkerApp {
    public static void main(String[] args) {
        Worker[] worker = new Worker[5];
        worker[0] = new Worker("Ленин Владимир Ильич",
                "Председатель СНК СССР",
                "Revolucia001@mavzoley.ru",
                89000000001L,
                500,
                53);
        worker[1] = new Worker("Сталин Иосиф Виссарионович",
                "Председатель СМ СССР",
                "OtecNarodov@mavzoley.ru",
                89000000021L,
                1200,
                74);
        worker[2] = new Worker("Хрущёв Никита Сергеевич",
                "Первый секретарь ЦК КПСС",
                "Kukuruza@mavzoley.ru",
                89000000321L,
                800,
                70);
        worker[3] = new Worker("Брежнев Леонид Ильич",
                "Генеральный секретарь ЦК КПСС",
                "Zastoy@mavzoley.ru",
                89000004321L,
                25000,
                75);
        worker[4] = new Worker("Андропов Юрий Владимирович",
                "Генеральный секретарь ЦК КПСС",
                "KGBeshnik@mavzoley.ru",
                89000054321L,
                800,
                70);

        System.out.println("Информация о сотрудниках, покинувших пост позже 70-ти лет:");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (worker[i].getAge() > 70) {
                System.out.print(i + 1 + ". ");
                worker[i].info();
            }
        }
    }
}

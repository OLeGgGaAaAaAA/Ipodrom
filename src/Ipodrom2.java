import java.util.Scanner;
import static java.lang.Thread.sleep;
public class Ipodrom2 {
    static Ipodrom mAnotherOption;
    public static void main(String[] args) throws InterruptedException {
        mAnotherOption = new Ipodrom();
            System.out.println("Гонка началась");
            mAnotherOption.start();

        final int trackLenth = 1000;
        int i = 30;
        int j = 50;
        int randomRunning = i + (int) (Math.random() * j);
        int horse1 = randomRunning;

        int k = 30;
        int h = 50;
        int randomRunning2 = k + (int) (Math.random() * h);
        int horse2 = randomRunning;

        int a = 300;
        int b = 400;
        int randomSleepNumber = a + (int) (Math.random() * b);
        try {
            sleep(randomSleepNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите надежного букмекера:" + "  " +
                "1.БК ЛЕОН БК, БК ЛЕОН БК, БК ЛЕОН БК, БК, ЛЕОН, БК" + "  " +
                "2.Вот это преессс, разве это пресс? ВОТ ЭТО ПРЕЕСС 1xBET");
        scanner.next();
        System.out.println("Выберите конячку:" + "  " +
                "1. horse1" + "  "+
                "2. horse2");
        scanner.next();
            if (horse1 == horse2)
                System.out.println("ничья");
            if (horse1> horse2)
                System.out.println("победила 1");
            if (horse2> horse1)
                System.out.println("победила 2");

        if (mAnotherOption.isAlive()) {
                    mAnotherOption.join();
            }
        }
    }

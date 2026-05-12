package d4AssignmentQuestion2_Prathap_Kandasamy;

import java.util.Random;

public class ImageProcessor implements Runnable {

    private String fileName;

    public ImageProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        try {
            System.out.println("Processing image: " +fileName);

            Random r = new Random();
            Thread.sleep(1000 + r.nextInt(3000));

            System.out.println("Finished image: " +fileName);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
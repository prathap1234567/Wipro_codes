package d4AssignmentQuestion2_Prathap_Kandasamy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageProcessingTest{

    public static void main(String[] args){

        ExecutorService service = Executors.newFixedThreadPool(6);
        String[] images={
            "profile_user_001.png",
            "passport_scan_2024.jpg",
            "invoice_bill_8845.png",
            "nature_mountain_hd.jpg",
            "product_mobile_ads.png",
            "wedding_photo_edited.jpg",
            "doctor_prescription_scan.png",
            "travel_paris_2025.jpg",
            "food_menu_design.psd",
            "company_logo_final.png",
            "birthday_event_2023.jpg",
            "satellite_map_area51.png"
        };

        for (int i =0; i<images.length;i++) {
            service.submit(new ImageProcessor(images[i]));
        }

        service.shutdown();

        System.out.println("All image processing jobs submitted..");
    }
}
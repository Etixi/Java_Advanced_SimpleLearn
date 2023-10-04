package com.etienne.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandlingDemo {
    public static void main(String[] args) throws IOException {

        int width = 612;
        int height = 612;

        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image){
        try {
            File sampleFile = new File("com/etienne/image/istockphoto-186019678-612x612.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            // Reading input file
            image = ImageIO.read(sampleFile);

            System.out.println("Reading Complete : " + image);
        } catch (IOException e){
            System.out.println("Error : " + e);
        }
        return image;
    }

    private static void writeToFile(BufferedImage image){
        try {
            File output = new File("com/etienne/image/out.jpg");
            ImageIO.write(image, "jpg", output);
            System.out.println("Writing Complete.");


        }catch (IOException e){
            System.out.println("Error : " + e);
        }
    }
}

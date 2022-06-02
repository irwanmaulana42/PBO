/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warna;

import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author PRISMA
 */
public class Sepia {

    public String path = Paths.get("").toAbsolutePath().toString() + "\\assets\\";
    public String newPath;

    public Sepia(BufferedImage img, File f) {
        //read image
        try {
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        //get image width and height
        int width = img.getWidth();
        int height = img.getHeight();
        
        //convert to sepia
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                //Retrieving the values of a pixel
                int pixel = img.getRGB(x, y);
                //Creating a Color object from pixel value
                Color color = new Color(pixel, true);
                //Retrieving the R G B values
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int avg = (red + green + blue) / 3;
                int depth = 20;
                int intensity = 30;
                red = avg + (depth * 2);
                green = avg + depth;
                blue = avg - intensity;
                //Making sure that RGB values lies between 0-255
                if (red > 255) {
                    red = 255;
                }
                if (green > 255) {
                    green = 255;
                }
                if (blue > 255) {
                    blue = 255;
                }
                if (blue < 0) {
                    blue = 0;
                }
                //Creating new Color object
                color = new Color(red, green, blue);
                //Setting new Color object to the image
                img.setRGB(x, y, color.getRGB());
            }
        }

        //write image
        try {
            f = new File(path + "sepia.jpg");
            ImageIO.write(img, "jpg", f);
            this.newPath = path + "sepia.jpg";
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String getPath() {
        return this.newPath;
    }
}

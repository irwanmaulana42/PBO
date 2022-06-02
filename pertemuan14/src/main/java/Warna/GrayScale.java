/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warna;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

/**
 *
 * @author PRISMA
 */
public class GrayScale {
    public String path = Paths.get("").toAbsolutePath().toString() + "\\assets\\";
    public String newPath;
    public GrayScale(BufferedImage img, File f) {
        //read image
        try {
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        //get image width and height
        int width = img.getWidth();
        int height = img.getHeight();

        //convert to grayscale
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                //calculate average
                int avg = (r + g + b) / 3;

                //replace RGB value with avg
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img.setRGB(x, y, p);
            }
        }

        //write image
        try {
            f = new File(path + "Gs.jpg");
            ImageIO.write(img, "jpg", f);
            this.newPath = path + "Gs.jpg";
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public String getPath() {
        return this.newPath;
    }
}

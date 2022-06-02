/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Warna;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

/**
 *
 * @author PRISMA
 */
public class Flip {

    public String path = Paths.get("").toAbsolutePath().toString() + "\\assets\\";
    public String newPath;

    public Flip(BufferedImage img, File f) {
        //read image
        try {
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        //get image width and height
        int width = img.getWidth();
        int height = img.getHeight();

        //Flip 180 degree
        AffineTransform tx = AffineTransform.getScaleInstance(-1, -1);
        tx.translate(-width, -height);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        img = op.filter(img, null);

        //write image
        try {
            f = new File(path + "flip.jpg");
            ImageIO.write(img, "jpg", f);
            this.newPath = path + "flip.jpg";
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String getPath() {
        return this.newPath;
    }
}

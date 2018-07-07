package main.java.com.ch_02_using_objects.e_02_16_half_size_picture;

/**
 * Using the {@code Picture} class of Worked Example 2.2, write
 * a {@code HalfSizePicture} program that loads a picture and
 * shows it at half the original size, centered in the window.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class HalfSizePicture {
    public static void main(String[] args) {
        Picture pic = new Picture();
        pic.load("queen-mary.png");

        int newWidth = pic.getWidth() / 2;
        int newHeight = pic.getHeight() / 2;

        pic.scale(newWidth, newHeight);
        pic.move(newWidth / 2, newHeight / 2);
    }
}

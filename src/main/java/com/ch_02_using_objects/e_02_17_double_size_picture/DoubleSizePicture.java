package main.java.com.ch_02_using_objects.e_02_17_double_size_picture;

/**
 * Using the {@code Picture} class of Worked Example 2.2, write
 * a {@code DoubleSizePicture} program that loads a picture, doubles
 * its size, and shows the center of the picture in the window.
 *
 * @author Alexander Parinov
 * @version 1.0
 * @since 07.07.2018
 */
public class DoubleSizePicture {
    public static void main(String[] args) {
        Picture pic = new Picture();
        pic.load("queen-mary.png");

        int newWidth = pic.getWidth() * 2;
        int newHeight = pic.getHeight() * 2;

        pic.scale(newWidth, newHeight);
        pic.move(newWidth / 4, newHeight / 4);
//Actually I stuck at this exercise, maybe I'll come back to it later on.

    }
}

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageEncoder {

    public static void main(String[] args) {

        try {
            // Get encryption key from command-line argument
            int key = Integer.parseInt(args[0]);

            // Check whether the key is within the valid range
            if (key < 0 || key > 255) {
                System.out.println("Invalid key! Enter a value between 0 and 255.");
                return;
            }

            // Read the input image
            File inputFile = new File("input.png");

            if (!inputFile.exists()) {
                System.out.println("Input image not found!");
                return;
            }

            BufferedImage image = ImageIO.read(inputFile);

            int width = image.getWidth();
            int height = image.getHeight();

            // Process every pixel
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    int pixel = image.getRGB(x, y);

                    // Extract ARGB components
                    int alpha = (pixel >> 24) & 0xff;
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;

                    // Transform RGB values using the encryption key
                    red = (red + key) % 256;
                    green = (green + key) % 256;
                    blue = (blue + key) % 256;

                    // Reconstruct the pixel
                    int newPixel =
                            (alpha << 24) |
                            (red << 16) |
                            (green << 8) |
                            blue;

                    image.setRGB(x, y, newPixel);
                }
            }

            // Save the encrypted image
            File outputFile = new File("encoded_image.png");
            ImageIO.write(image, "png", outputFile);

            System.out.println("Image encrypted successfully!");
            System.out.println("Encryption Key: " + key);
            System.out.println("Output File: encoded_image.png");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number between 0 and 255.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

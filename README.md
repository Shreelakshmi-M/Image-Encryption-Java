# Image Encryption Using Pixel Value Transformation in Java

A Java-based image encryption project that performs pixel-level RGB
transformation using a user-defined encryption key and modular arithmetic.

---

## Project Overview

This project implements a basic image encryption technique using Java.

The program reads an input image and processes it pixel by pixel. For
each pixel, the Red (R), Green (G), and Blue (B) color components are
extracted and transformed using a user-defined encryption key.

The transformed RGB values are then reconstructed to generate a new
encrypted image.

This project demonstrates practical concepts of:

- Java programming
- Image processing
- Pixel-level manipulation
- RGB color representation
- File handling
- Modular arithmetic
- Command-line arguments
- Basic encryption concepts

---

## Author

**Your Full Name**

B.E. – Electrical & Electronics Engineering  
BNM Institute of Technology, Bengaluru

---

## Objectives

The main objectives of this project are:

- To develop a Java-based image encryption system.
- To understand pixel-level image processing.
- To extract and manipulate RGB components of an image.
- To apply modular arithmetic for pixel transformation.
- To accept an encryption key from the user.
- To generate an encrypted image from the original image.
- To understand how mathematical transformations can be applied to
  digital image data.

---

## Working Principle

The program follows a pixel-level transformation approach.

# Step 1: Read the Input Image

The program reads an image named `input.png` using Java's
`BufferedImage` and `ImageIO` classes.

# Step 2: Access Individual Pixels

Every pixel in the image is accessed using its X and Y coordinates.

```text
for every row
    for every column
        access pixel
```
# Step 3: Extract Pixel Components

Each pixel contains four components:

- **Alpha (A)** – represents transparency.
- **Red (R)** – represents the red intensity.
- **Green (G)** – represents the green intensity.
- **Blue (B)** – represents the blue intensity.

The program extracts these components from the pixel using bitwise
operations.

# Step 4: Apply the Encryption Key

The user provides an encryption key between `0` and `255`.

The key is added to each RGB component. Modular arithmetic is used to
keep the resulting RGB values within the valid range of `0` to `255`.

The transformation is performed using:

```text
R' = (R + Key) mod 256
G' = (G + Key) mod 256
B' = (B + Key) mod 256
```
# Step 5: Reconstruct the Pixel

After transforming the RGB values, the program combines the Alpha,
Red, Green and Blue components to create the new pixel.

```
Alpha + Transformed Red + Transformed Green + Transformed Blue
                         ↓
                    New Pixel
```
                    

The newly created pixel replaces the original pixel in the image.

# Step 6: Process All Pixels

The same transformation is repeated for every pixel in the image.

```
Input Image
     ↓
Read Pixel
     ↓
Extract ARGB
     ↓
Transform RGB
     ↓
Reconstruct Pixel
     ↓
Update Image
     ↓
Next Pixel
```

This process continues until all pixels in the image have been
processed.

# Step 7: Generate the Encrypted Image

After processing all pixels, the transformed image is saved using
```
ImageIO. 
```


The output file is:

```
encoded_image.png
```

### Encryption Formula

The RGB values are transformed using the following equations:
```
R' = (R + Key) mod 256
G' = (G + Key) mod 256
B' = (B + Key) mod 256
```
Where:
```
R, G, B       = Original RGB values
Key           = User-defined encryption key
R', G', B'    = Transformed RGB values
```

The Alpha component is preserved during the transformation.

### Example of Pixel Transformation

Consider a pixel with the following RGB values:
```
R = 100
G = 120
B = 80
```
If the user enters:
```
Key = 150
```
The transformed values are:
```
R' = (100 + 150) mod 256
   = 250

G' = (120 + 150) mod 256
   = 14

B' = (80 + 150) mod 256
   = 230
```
Therefore, the original pixel:
```
RGB = (100, 120, 80)
```
becomes:
```
RGB = (250, 14, 230)
```
The same operation is performed on every pixel in the image.

### Key Features
- User-defined encryption key
- Encryption key validation from ``` 0 ``` to ``` 255```
- Pixel-by-pixel image processing
- RGB component extraction
- Modular arithmetic-based transformation
- Alpha channel preservation
- PNG image input and output
- Command-line argument support
- Basic error handling

### Technologies Used

- Java -Core programming language
- Java AWT -Image processing functionality
- BufferedImage	-Accessing and manipulating image pixels
- ImageIO	-Reading and writing image files
- Modular Arithmetic	-RGB value transformation
- Command-Line Arguments -Passing the encryption key

###  Project Structure
```
Image-Encryption-Java/
│
├── ImageEncoder.java
│       └── Java encryption program
│
├── input.png
│       └── Original input image
│
├── encoded_image.png
│       └── Encrypted output image
│
├── Image_Encryption_Colab.ipynb
│       └── Google Colab demonstration
│
├── README.md
│       └── Project documentation
│
└── .gitignore
        └── Git ignored files
```

### How to Run the Project
Prerequisites
Install the Java Development Kit (JDK).

Check whether Java is installed:

```java -version```

Check the Java compiler:

```javac -version```

# Step 1: Clone the Repository
```git clone https://github.com/Chinnu200519/Image-Encryption-Java.git```

Navigate to the project folder:

```cd Image-Encryption-Java```

# Step 2: Check the Input Image

Make sure the input image is named:

```input.png```

and is located in the same folder as:

```ImageEncoder.java```

# Step 3: Compile the Program
```javac ImageEncoder.java```

# Step 4: Run the Program

Provide the encryption key as a command-line argument:

```java ImageEncoder 150```

Here, ```150``` is the encryption key.

The valid key range is:

```0 to 255```

# Step 5: View the Output

After successful execution, the program generates:

```encoded_image.png```

This is the transformed/encrypted version of the input image.

### Testing

The program can be tested with different encryption keys.

Encryption Key	      Expected Result
- ```0```            RGB values remain unchanged
- ```50```	RGB values shifted by 50
- ```100```	RGB values shifted by 100
- ```150```	RGB values shifted by 150
- ```200```RGB values shifted by 200
- ```255```	RGB values shifted by 255

### Input Validation

The program accepts encryption keys only within the range:

```0 ≤ Key ≤ 255```

If a value outside this range is entered, the program displays:

```Invalid key! Enter a value between 0 and 255.```

If the encryption key cannot be converted into an integer, the program
handles the input error.

### Error Handling

The program handles common errors during execution.

Invalid Encryption Key

If the key is less than ```0``` or greater than ```255```, the program rejects
the input.

Missing Input Image

If ```input.png``` is not found, the program displays:

```Input image not found!```

## Invalid Input

If the provided encryption key is not a valid integer, the program
displays an appropriate error message.

### Sample Execution

Example command:

```java ImageEncoder 150```

Expected output:
```
Image encrypted successfully!
Encryption Key: 150
Output File: encoded_image.png
```

### Input and Output
## Input Image

The original image used for processing is:

```input.png```

## Encrypted Image

After applying the selected encryption key, the program generates:

```encoded_image.png```

The output maintains the original image dimensions while the RGB
values are transformed.

### Project Workflow

             Input Image
                  │
                  ▼
          Read Image File
                  │
                  ▼
            Access Pixel
                  │
                  ▼
            Extract ARGB
                  │
                  ▼
        Enter Encryption Key
                  │
                  ▼
          Transform RGB
       (RGB + Key) mod 256
                  │
                  ▼
         Reconstruct Pixel
                  │
                  ▼
        Process All Pixels
                  │
                  ▼
          Save Output Image
                  │
                  ▼
        encoded_image.png

### Concepts Demonstrated
## Java Programming
- Classes and objects
- Exception handling
- Command-line arguments
- File handling
- Loops
- Conditional statements

## Image Processing
- Image reading and writing
- Pixel access
- RGB extraction
- Pixel reconstruction
- Image manipulation

## Mathematical Concepts
- Modular arithmetic
- Integer transformation
- RGB value range limitation

### Learning Outcomes

Through this project, I gained practical understanding of:

- Java-based image processing
- Pixel-level RGB manipulation
- ```BufferedImage``` and ```ImageIO```
- File handling in Java
- Modular arithmetic
- Command-line arguments
- Input validation
- Exception handling
- Basic image encryption concepts

### Google Colab Demonstration

The project is also demonstrated interactively using Google Colab.

## Open in Google Colab

The Colab notebook demonstrates the complete project workflow,
including:

- Project introduction
- Input image
- Java source-code creation
- Java compilation
- Encryption key input
- Java program execution
- Encrypted image generation
- Output image display

### Notebook

The repository contains the following notebook:

```Image_Encryption_Colab.ipynb```

The notebook provides a step-by-step interactive demonstration of the
Java image encryption project.

### Future Enhancements

The project can be further extended by:

- Implementing a corresponding image decryption function
- Adding a graphical user interface (GUI)
- Supporting multiple image formats
- Allowing users to select images through a file browser
- Implementing stronger cryptographic algorithms
- Adding password-based key generation
- Supporting batch image encryption
- Combining encryption and decryption in a single application


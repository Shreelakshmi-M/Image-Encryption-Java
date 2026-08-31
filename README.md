# 🔐 Image Encryption Using Pixel Value Transformation in Java

A Java-based image encryption project that performs pixel-level RGB
transformation using a user-defined encryption key and modular arithmetic.

---

## 📌 Project Overview

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

## 👤 Author

**Your Full Name**

B.E. – Electrical & Electronics Engineering  
BNM Institute of Technology, Bengaluru

**GitHub:** [@Chinnu200519](https://github.com/Chinnu200519)

---

## 🎯 Objectives

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

## ⚙️ Working Principle

The program follows a pixel-level transformation approach.

### Step 1: Read the Input Image

The program reads an image named `input.png` using Java's
`BufferedImage` and `ImageIO` classes.

### Step 2: Access Individual Pixels

Every pixel in the image is accessed using its X and Y coordinates.

```text
for every row
    for every column
        access pixel
```
### Step 3: Extract Pixel Components

Each pixel contains four components:

- **Alpha (A)** – represents transparency.
- **Red (R)** – represents the red intensity.
- **Green (G)** – represents the green intensity.
- **Blue (B)** – represents the blue intensity.

The program extracts these components from the pixel using bitwise
operations.

### Step 4: Apply the Encryption Key

The user provides an encryption key between `0` and `255`.

The key is added to each RGB component. Modular arithmetic is used to
keep the resulting RGB values within the valid range of `0` to `255`.

The transformation is performed using:

```text
R' = (R + Key) mod 256
G' = (G + Key) mod 256
B' = (B + Key) mod 256
```
### Step 5: Reconstruct the Pixel

After transforming the RGB values, the program combines the Alpha,
Red, Green and Blue components to create the new pixel.

```
Alpha + Transformed Red + Transformed Green + Transformed Blue
                         ↓
                    New Pixel
```
                    

The newly created pixel replaces the original pixel in the image.

### Step 6: Process All Pixels

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

### Step 7: Generate the Encrypted Image

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
Java AWT -Image processing functionality
BufferedImage	Accessing and manipulating image pixels
ImageIO	Reading and writing image files
Modular Arithmetic	RGB value transformation
Command-Line Arguments	Passing the encryption key
📁 Project Structure
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

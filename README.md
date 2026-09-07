# Basic Image Encryption Using Pixel-Level RGB Transformation in Java

A basic **Java-based image encryption project** that performs pixel-level RGB transformation using a user-defined key and modular arithmetic.
## Google Colab

[Open Project in Google Colab]
https://colab.research.google.com/drive/1tM1PqaIIye72xj-Edg1pns0zj-_oroka?usp=sharing


## Features

* Pixel-by-pixel image processing
* RGB value extraction and transformation
* User-defined encryption key
* Modular arithmetic for RGB transformation
* Alpha channel preservation
* PNG input and output

## How It Works

The program reads an input image and processes each pixel individually. The RGB values are modified using the encryption key:

```text
R' = (R + Key) mod 256
G' = (G + Key) mod 256
B' = (B + Key) mod 256
```

The transformed RGB values are combined with the original alpha value to create the output pixel.

## Example Calculation

Suppose a pixel has the following RGB values:

```text
R = 200
G = 100
B = 50
Key = 30
```

Applying the encryption formula:

```text
R' = (200 + 30) mod 256 = 230
G' = (100 + 30) mod 256 = 130
B' = (50 + 30) mod 256 = 80
```

Therefore, the original pixel:

```text
RGB(200, 100, 50)
```

becomes the encrypted pixel:

```text
RGB(230, 130, 80)
```

The modulo 256 operation keeps every RGB value within the valid range of **0–255**.


## Technologies Used

* Java
* BufferedImage
* ImageIO
* RGB Pixel Manipulation
* Modular Arithmetic

## Input & Output

**Input:** `input.png`

**Output:** `encoded_image.png`

## How to Run

Compile the program:

```bash
javac ImageEncoder.java
```

Run with an encryption key:

```bash
java ImageEncoder 150
```

The key must be between **0 and 255**.

## Project Structure

```text
Image-Encryption-Java/
├── ImageEncoder.java
├── input.png
├── encoded_image.png
├── Image_Encryption_Colab.ipynb
├── README.md
└── .gitignore
```

## Note

This project demonstrates a **basic image transformation technique for learning purposes**. It is not intended to replace modern cryptographic algorithms used for secure image encryption.

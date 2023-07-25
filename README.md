# FingerboardStructure

The Fingerboard class is a part of the `com.github.guitar-scale.fingerboardStructure` package. It represents a guitar fingerboard and provides methods to manipulate and retrieve information about the fingerboard.

## Features

- Create a fingerboard with a specified number of frets, key base, scale, and tuning.
- Get the structure of the fingerboard.
- Get the scale of the fingerboard.
- Get the tuning of the fingerboard.
- Compare the fingerboard with another object.
- Generate a hash code for the fingerboard.

## class structure
https://guitar-scale.github.io/fingerboardStructure/

## Installation

### maven

```xml
<dependency>
    <groupId>io.github.guitar-scale</groupId>
    <artifactId>fingerboardStructure</artifactId>
    <version>1.0.5</version>
</dependency>
```

### gradle

```
implementation group: 'io.github.guitar-scale', name: 'fingerboardStructure', version: '1.0.5'
```

## Usage

### Creating a Fingerboard

You can create a Fingerboard object by providing the number of frets, key base, scale, and tuning. The number of frets should be between 12 and 32.

```
Scale scale = new Scale(ScaleBox.Minor.getName(), ScaleBox.Minor.getStructure());
Tuning tuning = Tuning.getStandardTuning(); // EADGBE
Fingerboard fb = new Fingerboard(24, KeyBase.E, scale, tuning);
```

or

```
Scale scale = new Scale("myCustomScale", new int[]{2, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1});
Tuning tuning = new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"));
Fingerboard fb = new Fingerboard(24, KeyBase.E, scale, tuning);
```


### Getting the Structure of the Fingerboard

You can get the structure of the fingerboard, which is represented as a 2D array.

```
int[][] structure = fb.getStructure();

/* result toString
2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 
1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 
1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 
1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 
1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 
2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2,
*/
```

### Getting the Scale of the Fingerboard

You can get the scale of the fingerboard.

```
Scale scale = fb.getScale();
```

### Getting the Tuning of the Fingerboard

You can get the tuning of the fingerboard.

```
Tuning tuning = fb.getTuning();
```

### Comparing the Fingerboard with Another Object

You can compare the fingerboard with another object. The result is true if and only if the argument is not null and is a Fingerboard object that has the same fretboard structure as this object.

```
boolean isEqual = fb.equals(anotherObject);
```

### Generating a Hash Code for the Fingerboard

You can generate a hash code for the fingerboard. The hash code is computed based on the fretboard structure of the Fingerboard.

```
int hashCode = fb.hashCode();
```

## Tuning

The Tuning class represents the tuning of a guitar. It provides methods to create a tuning, get the tuning structure, and get standard or DadGad tuning.

### Creating a Tuning

You can create a Tuning object by providing an array of integers representing the tuning of the guitar.

```
Tuning tuning = new Tuning(
  new int[]{
    KeyBase.fromString("E").toInt(),
    KeyBase.fromString("A").toInt(),
    KeyBase.fromString("D").toInt(),
    KeyBase.fromString("G").toInt(),
    KeyBase.fromString("B").toInt(),
    KeyBase.fromString("E").toInt()
  }
);
```

### Getting the Tuning Structure

You can get the tuning structure, which is represented as an array of integers.

```
int[] tuningStructure = tuning.getTuningStructure();
```

### Getting Standard or DadGad Tuning

You can get a Tuning object representing the standard or DadGad tuning of a guitar.

```
Tuning standardTuning = Tuning.getStandardTuning();
Tuning dadGadTuning = Tuning.getDadGad();
```

## License

This project is licensed under the MIT License. You can find the full text of the license in the LICENSE file of this repository.

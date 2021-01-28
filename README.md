# kotlinextensions
This repository includes different extensions in kotlin which can be used for android app development.

## Download

### Add this in project level gradle.

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Add this in app level gradle

```
 implementation 'com.github.himanshufi:kotlinextensions:0.1'

```
## Documentation

Check out the extensions related to the `x`:

```
when(x) {
  Activity -> [here](https://github.com/himanshufi/kotlinextensions/blob/master/documentation/ActivityExtension.md)
}

```
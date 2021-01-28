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

<pre>

when(x) {
   is <b>Activity</b> -> <a href="https://github.com/himanshufi/kotlinextensions/blob/master/docs/ActivityExtensions.md">Click here</a>
   is <b>View</b> -> <a href="https://github.com/himanshufi/kotlinextensions/blob/master/docs/ViewExtensions.md">Click here</a>
   is <b>Context</b> -> <a href="https://github.com/himanshufi/kotlinextensions/blob/master/docs/ContextExtensions.md">Click here</a>
} 

</pre>
